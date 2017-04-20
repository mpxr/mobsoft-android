package martonveto.com.mobsoft.model;

import com.orm.dsl.Table;

@Table
public class Artist {

    private Long id;
    private String artistId;
    private String name;

    public Artist() {
    }

    public Artist(String artistId, String name) {
        this.artistId = artistId;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        if (artistId != null ? !artistId.equals(artist.artistId) : artist.artistId != null) return false;
        return name != null ? name.equals(artist.name) : artist.name == null;

    }

    @Override
    public int hashCode() {
        int result = artistId != null ? artistId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

}
