package martonveto.com.mobsoft.interactor.albums;

import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.interactor.albums.events.GetAllAlbumsEvent;
import martonveto.com.mobsoft.interactor.albums.events.RemoveAlbumEvent;
import martonveto.com.mobsoft.interactor.albums.events.SaveAlbumEvent;
import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.model.Artist;
import martonveto.com.mobsoft.repository.Repository;

public class AlbumsInteractor {

    @Inject
    Repository repository;

    @Inject
    EventBus eventBus;

    public AlbumsInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void saveAlbum(Album album) {
        SaveAlbumEvent event = new SaveAlbumEvent();
        event.setAlbum(album);
        try {
            repository.saveAlbum(album);
            eventBus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            eventBus.post(event);
        }
    }

    public void getAllAlbumsByArtist(Artist artist) {
        GetAllAlbumsEvent event = new GetAllAlbumsEvent();
        try {
            List<Album> albumsOfArtist = repository.getAlbumsOfArtist(artist);
            event.setAlbums(albumsOfArtist);
            eventBus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            eventBus.post(event);
        }
    }

    public void removeAlbum(Album album) {
        RemoveAlbumEvent event = new RemoveAlbumEvent();
        event.setAlbum(album);
        try {
            repository.removeAlbum(album);
        } catch (Exception e) {
            event.setThrowable(e);
            eventBus.post(event);
        }

    }

}
