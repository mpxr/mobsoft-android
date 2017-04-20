package martonveto.com.mobsoft.ui.home;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.interactor.artist.ArtistInteractor;
import martonveto.com.mobsoft.ui.Presenter;

public class MainPresenter extends Presenter<MainScreen> {

    @Inject
    ArtistInteractor artistInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus eventBus;

    @Override
    public void attachScreen(MainScreen screen) {
        //eventBus.register(this);
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        //eventBus.unregister(this);
        super.detachScreen();
    }

    public void getAllArtist(){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                artistInteractor.findAllArtists();
            }
        });
    }

    public void showDetails() {
        screen.startDetailIntent();
    }

    public void showAlbumList() {
        screen.startAlbumListIntent();
    }
}