package martonveto.com.mobsoft.ui.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.R;
import martonveto.com.mobsoft.ui.album.list.AlbumListActivity;
import martonveto.com.mobsoft.ui.detail.DetailActivity;

public class MainActivity extends AppCompatActivity implements MainScreen {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobSoftApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachScreen(this);
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
    public void startDetailIntent() {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    @Override
    public void startAlbumListIntent() {
        Intent intent = new Intent(this, AlbumListActivity.class);
        startActivity(intent);
    }

    public void showDetails(View view) {
        mainPresenter.showDetails();
    }

    public void showAlbumList(View view) {
        mainPresenter.showAlbumList();
    }
}
