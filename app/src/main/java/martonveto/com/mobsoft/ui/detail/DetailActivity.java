package martonveto.com.mobsoft.ui.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.R;

public class DetailActivity extends AppCompatActivity implements DetailScreen {

    @Inject
    DetailPresenter detailPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        MobSoftApplication.injector.inject(this);
    }


    @Override
    protected void onStop() {
        super.onStop();
        detailPresenter.detachScreen();
    }

    @Override
    public void showDetail() {

    }

}
