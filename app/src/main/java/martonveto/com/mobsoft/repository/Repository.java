package martonveto.com.mobsoft.repository;

import android.content.Context;

import java.util.Iterator;

import martonveto.com.mobsoft.model.Artist;

public interface Repository {

    void open(Context context);

    void close();

    void saveAlbum(martonveto.com.mobsoft.model.Album currentAlbum);

    Iterator<martonveto.com.mobsoft.model.Album> getAllAlbums();

    void saveArtist(Artist artist);

}
