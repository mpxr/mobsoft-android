package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Search {

    @SerializedName("albums")
    private SearchAlbums albums = null;

    @SerializedName("artists")
    private SearchArtists artists = null;


    /**
     **/
    public SearchAlbums getAlbums() {
        return albums;
    }

    public void setAlbums(SearchAlbums albums) {
        this.albums = albums;
    }


    /**
     **/
    public SearchArtists getArtists() {
        return artists;
    }

    public void setArtists(SearchArtists artists) {
        this.artists = artists;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Search search = (Search) o;
        return Objects.equals(albums, search.albums) &&
                Objects.equals(artists, search.artists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albums, artists);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Search {\n");

        sb.append("    albums: ").append(toIndentedString(albums)).append("\n");
        sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
