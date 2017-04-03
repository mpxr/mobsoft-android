package martonveto.com.mobsoft.ui.album.list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.R;

public class AlbumListActivity extends AppCompatActivity implements AlbumListScreen {

    @Inject
    AlbumListPresenter albumListPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_list);

        MobSoftApplication.injector.inject(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}
