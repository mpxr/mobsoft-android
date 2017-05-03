package martonveto.com.mobsoft.repository;

import android.content.Context;

import java.util.Iterator;

import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.model.Artist;

public class MemoryRepository implements Repository {

    @Override
    public void open(Context context) {

    }

    @Override
    public void close() {

    }

    @Override
    public void saveAlbum(Album currentAlbum) {

    }

    @Override
    public Iterator<Album> getAllAlbums() {
        return null;
    }

    @Override
    public void saveArtist(Artist artist) {

    }

}
