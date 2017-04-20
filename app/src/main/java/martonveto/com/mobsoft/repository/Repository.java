package martonveto.com.mobsoft.repository;

import android.content.Context;

import java.util.List;

import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.model.Artist;

public interface Repository {

    void open(Context context);

    void close();

    List<Artist> getAllArtist();

    List<Album> getAlbumsOfArtist(Artist artist);

    Artist findArtistByName(String artistName);

    Album findAlbumByName(String albumName);

    boolean isArtistInDb(Artist artist);

    boolean isAlbumInDb(Album album);

    void saveAlbum(Album album);

    void saveArtist(Artist artist);

    void removeAlbum(Album album);

}
