package martonveto.com.mobsoft.repository;

import android.content.Context;

import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.List;

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
    public List<Artist> getAllArtist() {
        return SugarRecord.listAll(Artist.class);
    }

    @Override
    public List<Album> getAlbumsOfArtist(Artist artist) {
        return SugarRecord.find(Album.class, "artist.artistId = ?", artist.getArtistId());
    }

    @Override
    public Artist findArtistByName(String artistName) {
        List<Artist> artists = SugarRecord.find(Artist.class, "name = ?", artistName);
        if (!artists.isEmpty()) {
            return artists.get(0);
        }
        return null;
    }

    @Override
    public Album findAlbumByName(String albumName) {
        List<Album> album = SugarRecord.find(Album.class, "name = ?", albumName);
        if (!album.isEmpty()) {
            return album.get(0);
        }
        return null;
    }

    @Override
    public boolean isArtistInDb(Artist artist) {
        return SugarRecord.findById(Artist.class, artist.getId()) != null;
    }

    @Override
    public boolean isAlbumInDb(Album album) {
        return SugarRecord.findById(Album.class, album.getId()) != null;
    }

    @Override
    public void saveAlbum(Album album) {
        SugarRecord.save(album);
    }

    @Override
    public void saveArtist(Artist artist) {
        SugarRecord.save(artist);
    }

    @Override
    public void removeAlbum(Album album) {
        SugarRecord.delete(album);
    }

}
