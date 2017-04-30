package martonveto.com.mobsoft.ui.album.list;

import android.util.Log;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.interactor.albums.AlbumsInteractor;
import martonveto.com.mobsoft.interactor.albums.events.DownloadedAlbumsEvent;
import martonveto.com.mobsoft.ui.Presenter;

import static martonveto.com.mobsoft.MobSoftApplication.injector;

public class AlbumListPresenter extends Presenter<AlbumListScreen> {

    @Inject
    AlbumsInteractor albumsInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus eventBus;

    public AlbumListPresenter() {
    }

    @Override
    public void attachScreen(AlbumListScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        eventBus.register(this);
    }

    @Override
    public void detachScreen() {
        eventBus.unregister(this);
        super.detachScreen();
    }

    public void getAlbumsOfArtist(final String artistId){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                albumsInteractor.downloadAlbumsOfArtist(artistId);
            }
        });
    }

    public void onEventMainThread(DownloadedAlbumsEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                //todo
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else {
            if(screen != null){
                screen.showAlbums(event.getAlbums());
            }
        }
    }

}
