package martonveto.com.mobsoft.repository;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.model.Artist;

public class MemoryRepository implements Repository {

    private List<Artist> artists;
    private List<Album> albums;

    @Override
    public void open(Context context) {
        this.albums = new ArrayList<>();
        this.artists = new ArrayList<>();
    }

    @Override
    public void close() {

    }

    @Override
    public List<Artist> getAllArtist() {
        return this.artists;
    }

    @Override
    public List<Album> getAlbumsOfArtist(Artist artist) {
        List<Album> albumsOfArtist = new ArrayList<>();
        for (Album album : this.albums) {
            if(album.getArtist().equals(artist)){
                albumsOfArtist.add(album);
            }
        }

        return albumsOfArtist;
    }

    @Override
    public Artist findArtistByName(String artistName) {
        for (Artist artist : this.artists) {
            if(artist.getName().equals(artistName)){
                return artist;
            }
        }

        return null;
    }

    @Override
    public Album findAlbumByName(String albumName) {
        for (Album album : this.albums) {
            if(album.getName().equals(albumName)){
                return album;
            }
        }

        return null;
    }

    @Override
    public boolean isArtistInDb(Artist artist) {
        return this.artists.contains(artist);
    }

    @Override
    public boolean isAlbumInDb(Album album) {
        return this.albums.contains(album);
    }

    @Override
    public void saveAlbum(Album album) {
        this.albums.add(album);
    }

    @Override
    public void saveArtist(Artist artist) {
        this.artists.add(artist);
    }

    @Override
    public void removeAlbum(Album album) {
        this.albums.remove(album);
    }

}
