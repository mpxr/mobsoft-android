package martonveto.com.mobsoft.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.R;
import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.model.Artist;
import martonveto.com.mobsoft.model.SearchArtists;
import martonveto.com.mobsoft.ui.album.list.AlbumListActivity;
import martonveto.com.mobsoft.utils.IntentConstants;

public class MainActivity extends AppCompatActivity implements MainScreen {

    @Inject
    MainPresenter mainPresenter;

    private AutoCompleteTextView textView;
    private List<Artist> artists;
    private List<Album> savedAlbums;
    private ListView savedAlbumsListView;

    private Tracker tracker;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobSoftApplication.injector.inject(this);

        textView = (AutoCompleteTextView) findViewById(R.id.searchTextView);
        savedAlbumsListView = (ListView) findViewById(R.id.savedAlbums);

        savedAlbumsListView.setOnItemClickListener(getListViewListener());

        textView.setOnItemClickListener(autocompleteSelected());
        textView.setOnClickListener(autocompleteClicked());

        MobSoftApplication application = (MobSoftApplication) getApplication();
        tracker = application.getDefaultTracker();
    }

    private AdapterView.OnItemClickListener autocompleteSelected() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mainPresenter.showAlbumList(artists.get(position));
            }
        };
    }

    private View.OnClickListener autocompleteClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        };
    }

    @Override
    protected void onStart() {
        super.onStart();
        tracker.setScreenName("Image~MainActivity");
        tracker.send(new HitBuilders.ScreenViewBuilder().build());
        mainPresenter.attachScreen(this);
        mainPresenter.getAllAlbums();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainPresenter.detachScreen();
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void startAlbumListIntent(Artist artist) {
        Intent intent = new Intent(this, AlbumListActivity.class);
        intent.putExtra(IntentConstants.ARTIST_NAME, artist.getName());
        intent.putExtra(IntentConstants.ARTIST_ID, artist.getArtistId());
        startActivity(intent);
    }

    @Override
    public void showResults(SearchArtists searchArtists) {
        artists = searchArtists.getItems();

        List<String> foundArtists = new ArrayList<>();
        for (Artist artist : artists) {
            foundArtists.add(artist.getName());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, foundArtists);
        textView.setAdapter(adapter);
        textView.showDropDown();
    }

    @Override
    public void showSavedAlbums(List<Album> albums) {
        savedAlbums = albums;
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1);
        adapter.addAll(getAlbumNames(albums));
        savedAlbumsListView.setAdapter(adapter);
    }

    private Collection<? extends String> getAlbumNames(List<Album> albums) {
        List<String> albumNames = new ArrayList<>();
        for (Album album : albums) {
            albumNames.add(album.getName());
        }
        return albumNames;
    }

    public void forceCrash(View view) {
        throw new RuntimeException("This is a crash");
    }

    public void buttonClicked(View view) {
        mainPresenter.search(textView.getText().toString());
    }

    private AdapterView.OnItemClickListener getListViewListener() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        };
    }

}
