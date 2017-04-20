package martonveto.com.mobsoft.ui.album.list;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.interactor.albums.AlbumsInteractor;
import martonveto.com.mobsoft.ui.Presenter;

public class AlbumListPresenter extends Presenter<AlbumListScreen> {

    @Inject
    AlbumsInteractor albumsInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus eventBus;

    @Override
    public void attachScreen(AlbumListScreen screen) {
        super.attachScreen(screen);
        eventBus.register(this);
    }

    @Override
    public void detachScreen() {
        eventBus.unregister(this);
        super.detachScreen();
    }

}
