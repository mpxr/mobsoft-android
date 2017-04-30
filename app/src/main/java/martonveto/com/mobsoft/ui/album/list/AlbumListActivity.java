package martonveto.com.mobsoft.ui.album.list;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.R;
import martonveto.com.mobsoft.model.AlbumSimple;
import martonveto.com.mobsoft.model.AlbumSimplePage;
import martonveto.com.mobsoft.ui.detail.DetailActivity;
import martonveto.com.mobsoft.utils.IntentConstants;

public class AlbumListActivity extends AppCompatActivity implements AlbumListScreen {

    @Inject
    AlbumListPresenter albumListPresenter;

    private String artistId;
    private String artistName;
    private RecyclerView albumRecyclerView;
    private AlbumAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private TextView artistTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_list);
        MobSoftApplication.injector.inject(this);

        artistTextView = (TextView) findViewById(R.id.artistTextView);
        albumRecyclerView = (RecyclerView) findViewById(R.id.albumRecyclerView);
        albumRecyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 2);
        albumRecyclerView.setLayoutManager(layoutManager);

        artistId = getIntent().getStringExtra(IntentConstants.ARTIST_ID);
        artistName = getIntent().getStringExtra(IntentConstants.ARTIST_NAME);

        artistTextView.setText(artistName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        albumListPresenter.attachScreen(this);
        if (artistId != null) {
            albumListPresenter.getAlbumsOfArtist(artistId);
        }
    }

    @Override
    protected void onStop() {
        albumListPresenter.detachScreen();
        super.onStop();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(IntentConstants.ARTIST_ID, artistId);
        outState.putString(IntentConstants.ARTIST_NAME, artistName);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        artistId = savedInstanceState.getString(IntentConstants.ARTIST_ID);
        artistName = savedInstanceState.getString(IntentConstants.ARTIST_NAME);
        artistTextView.setText(artistName);
    }

    @Override
    public void showAlbums(AlbumSimplePage albums) {
        if (albums.getTotal() > 0) {
            List<AlbumSimple> items = albums.getItems();
            adapter = new AlbumAdapter(AlbumListActivity.this, items);
            albumRecyclerView.setAdapter(adapter);
            adapter.setOnAlbumClickListener(new OnAlbumClickListener() {
                @Override
                public void onAlbumClick(AlbumSimple album) {
                    Intent intent = new Intent(AlbumListActivity.this, DetailActivity.class);
                    intent.putExtra(IntentConstants.ALBUM_ID, album.getAlbumId());
                    startActivity(intent);
                }
            });
        }
    }

}
