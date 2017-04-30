package martonveto.com.mobsoft.ui.detail;

import android.util.Log;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.interactor.albums.AlbumsInteractor;
import martonveto.com.mobsoft.interactor.albums.events.DownloadedAlbumInfoEvent;
import martonveto.com.mobsoft.interactor.albums.events.SaveAlbumEvent;
import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.ui.Presenter;

import static martonveto.com.mobsoft.MobSoftApplication.injector;

public class DetailPresenter extends Presenter<DetailScreen>{

    @Inject
    AlbumsInteractor albumsInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus eventBus;

    @Override
    public void attachScreen(DetailScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        eventBus.register(this);
    }

    @Override
    public void detachScreen() {
        eventBus.unregister(this);
        super.detachScreen();
    }


    public void getAlbumInfo(final String albumId) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                albumsInteractor.downloadAlbumInfo(albumId);
            }
        });
    }

    public void save(final Album currentAlbum) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                albumsInteractor.saveAlbum(currentAlbum);
            }
        });
    }

    public void onEventMainThread(DownloadedAlbumInfoEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                //todo
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else {
            if(screen != null){
                screen.showDetail(event.getAlbum());
            }
        }
    }

    public void onEventMainThread(SaveAlbumEvent event){
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                //todo
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else{
            if(screen != null){
                screen.sendMessage(event.getAlbum().getName());
            }
        }
    }

}
