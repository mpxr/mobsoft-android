package martonveto.com.mobsoft.ui.home;

import android.util.Log;

import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.interactor.albums.AlbumsInteractor;
import martonveto.com.mobsoft.interactor.albums.events.GetAllAlbumsEvent;
import martonveto.com.mobsoft.interactor.search.SearchInteractor;
import martonveto.com.mobsoft.interactor.search.events.SearchEvent;
import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.model.Artist;
import martonveto.com.mobsoft.ui.Presenter;

import static martonveto.com.mobsoft.MobSoftApplication.injector;

public class MainPresenter extends Presenter<MainScreen> {

    @Inject
    SearchInteractor searchInteractor;

    @Inject
    AlbumsInteractor albumsInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus eventBus;

    public MainPresenter() {
    }

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        eventBus.register(this);
    }

    @Override
    public void detachScreen() {
        eventBus.unregister(this);
        super.detachScreen();
    }

    public void search(final String artist) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                searchInteractor.search(artist);
            }
        });
    }


    public void getAllAlbums() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                albumsInteractor.getAllAlbums();
            }
        });
    }

    public void showAlbumList(Artist artist) {
        screen.startAlbumListIntent(artist);
    }

    public void onEventMainThread(SearchEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showMessage("error");
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else {
            if (screen != null) {
                if (event.getSearch().getArtists().getTotal() > 0) {
                    screen.showResults(event.getSearch().getArtists());
                }
            }
        }
    }

    public void onEventMainThread(GetAllAlbumsEvent event){
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                //todo
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else {
            if(screen != null){
                List<Album> albums = event.getAlbums();
                screen.showSavedAlbums(albums);
            }
        }
    }
}