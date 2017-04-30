package martonveto.com.mobsoft.ui.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.R;
import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.model.Artist;
import martonveto.com.mobsoft.model.TrackSimple;
import martonveto.com.mobsoft.utils.IntentConstants;

public class DetailActivity extends AppCompatActivity implements DetailScreen {

    @Inject
    DetailPresenter detailPresenter;

    private String albumId;
    private Album currentAlbum;

    private ImageView albumImageView;
    private TextView albumArtistTextView;
    private TextView albumTextView;
    private TextView releaseTextView;
    private ListView trackList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        MobSoftApplication.injector.inject(this);

        albumImageView = (ImageView) findViewById(R.id.albumImageView);
        albumArtistTextView = (TextView) findViewById(R.id.albumArtistTextView);
        albumTextView = (TextView) findViewById(R.id.albumTextView);
        releaseTextView = (TextView) findViewById(R.id.releaseTextView);
        trackList = (ListView) findViewById(R.id.trackList);

        albumId = getIntent().getStringExtra(IntentConstants.ALBUM_ID);

    }

    @Override
    protected void onStart() {
        super.onStart();
        detailPresenter.attachScreen(this);
        detailPresenter.getAlbumInfo(albumId);
    }

    @Override
    protected void onStop() {
        super.onStop();
        detailPresenter.detachScreen();
    }

    @Override
    public void showDetail(Album album) {
        this.currentAlbum = album;
        Picasso.with(getApplicationContext()).load(album.getImages().get(0).getUrl()).into(albumImageView);
        albumArtistTextView.setText(getArtistNames(album.getArtists()));
        albumTextView.setText(album.getName());
        releaseTextView.setText(album.getReleaseDate());
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1);
        adapter.addAll(getTracks(album));
        trackList.setAdapter(adapter);
    }

    @Override
    public void sendMessage(String name) {
        Toast.makeText(getApplicationContext(), name + " saved", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        final MenuItem menuItem = menu.findItem(R.id.action_favorite);
        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(currentAlbum != null){
                    detailPresenter.save(currentAlbum);
                }
                return false;
            }
        });
        return true;

    }

    private String getArtistNames(List<Artist> artists) {
        StringBuilder artistNames = new StringBuilder();
        for (Artist artist : artists) {
            artistNames.append(artist.getName()).append(",");
        }
        return artistNames.substring(0, artistNames.length() - 1);
    }

    private Collection<? extends String> getTracks(Album album) {
        List<String> tracks = new ArrayList<>();
        for (TrackSimple trackSimple : album.getTracks().getItems()) {
            tracks.add(trackSimple.getName());
        }
        return tracks;
    }

}
