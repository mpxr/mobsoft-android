package martonveto.com.mobsoft.repository;

import android.content.Context;

import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.Iterator;

import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.model.Artist;

public class SugarOrmRepository implements Repository {

    @Override
    public void open(Context context) {
        SugarContext.init(context);
    }

    @Override
    public void close() {
        SugarContext.terminate();
    }

    @Override
    public void saveAlbum(Album currentAlbum) {
        SugarRecord.save(currentAlbum);
    }

    @Override
    public Iterator<Album> getAllAlbums() {
        return SugarRecord.findAll(Album.class);
    }

    @Override
    public void saveArtist(Artist artist) {
        SugarRecord.save(artist);
    }

}
