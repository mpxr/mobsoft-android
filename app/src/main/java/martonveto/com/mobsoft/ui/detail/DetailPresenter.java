package martonveto.com.mobsoft.ui.detail;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.interactor.albums.AlbumsInteractor;
import martonveto.com.mobsoft.model.Artist;
import martonveto.com.mobsoft.ui.Presenter;

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
        eventBus.register(this);
    }

    @Override
    public void detachScreen() {
        eventBus.unregister(this);
        super.detachScreen();
    }

    public void getAlbumsByArtist(){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                Artist artist = new Artist();
                albumsInteractor.getAllAlbumsByArtist(artist);
            }
        });
    }

}
