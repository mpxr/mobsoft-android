package martonveto.com.mobsoft.ui;


import android.content.Context;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import martonveto.com.mobsoft.ui.album.list.AlbumListPresenter;
import martonveto.com.mobsoft.ui.detail.DetailPresenter;
import martonveto.com.mobsoft.ui.home.MainPresenter;


@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public DetailPresenter provideDetailPresenter(){
        return new DetailPresenter();
    }

    @Provides
    @Singleton
    public AlbumListPresenter provideAlbumListPresenter(){
        return new AlbumListPresenter();
    }

}