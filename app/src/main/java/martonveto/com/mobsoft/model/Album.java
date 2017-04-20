package martonveto.com.mobsoft.model;

import com.orm.dsl.Table;

@Table
public class Album {

    private Long id;
    private String albumId;
    private String name;
    private Artist artist;

    public Album() {
    }

    public Album(String albumId, String name, Artist artist) {
        this.albumId = albumId;
        this.name = name;
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Album album = (Album) o;

        if (albumId != null ? !albumId.equals(album.albumId) : album.albumId != null) return false;
        if (name != null ? !name.equals(album.name) : album.name != null) return false;
        return artist != null ? artist.equals(album.artist) : album.artist == null;

    }

    @Override
    public int hashCode() {
        int result = albumId != null ? albumId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        return result;
    }

}
