package martonveto.com.mobsoft.interactor.albums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.interactor.albums.events.DownloadedAlbumInfoEvent;
import martonveto.com.mobsoft.interactor.albums.events.DownloadedAlbumsEvent;
import martonveto.com.mobsoft.interactor.albums.events.GetAllAlbumsEvent;
import martonveto.com.mobsoft.interactor.albums.events.SaveAlbumEvent;
import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.model.AlbumSimplePage;
import martonveto.com.mobsoft.network.AlbumApi;
import martonveto.com.mobsoft.network.ArtistsApi;
import martonveto.com.mobsoft.repository.Repository;
import retrofit2.Response;

public class AlbumsInteractor {

    @Inject
    AlbumApi albumApi;

    @Inject
    ArtistsApi artistsApi;

    @Inject
    Repository repository;

    @Inject
    EventBus eventBus;

    public AlbumsInteractor() {
        MobSoftApplication.injector.inject(this);
    }


    public void downloadAlbumsOfArtist(String artistId) {
        DownloadedAlbumsEvent event = new DownloadedAlbumsEvent();
        try {
            Response<AlbumSimplePage> albumResults = artistsApi.artistsAlbumIdAlbumsGet(artistId, 20, 0, "album", "HU").execute();
            AlbumSimplePage body = albumResults.body();
            event.setAlbums(body);
            eventBus.post(event);
        } catch (IOException e) {
            event.setThrowable(e);
            eventBus.post(event);
        }
    }

    public void downloadAlbumInfo(String albumId) {
        DownloadedAlbumInfoEvent event = new DownloadedAlbumInfoEvent();
        try {
            Response<Album> albumInfo = albumApi.albumsAlbumIdGet(albumId, "HU").execute();
            event.setAlbum(albumInfo.body());
            eventBus.post(event);
        } catch (IOException e) {
            event.setThrowable(e);
            eventBus.post(event);
        }
    }

    public void saveAlbum(Album currentAlbum) {
        SaveAlbumEvent event = new SaveAlbumEvent();
        event.setAlbum(currentAlbum);
        try {
            repository.saveAlbum(currentAlbum);
            eventBus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            eventBus.post(event);
        }
    }

    public void getAllAlbums() {
        GetAllAlbumsEvent event = new GetAllAlbumsEvent();
        try {

            Iterator<Album> allAlbums = repository.getAllAlbums();
            List<Album> albumList = new ArrayList<>();
            while (allAlbums.hasNext()) {
                albumList.add(allAlbums.next());
            }
            event.setAlbums(albumList);
            eventBus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            eventBus.post(event);
        }
    }

}
