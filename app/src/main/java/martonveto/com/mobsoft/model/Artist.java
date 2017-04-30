package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;
import com.orm.dsl.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Table
public class Artist {

    @SerializedName("db_id")
    private transient Long id = null;

    @SerializedName("external_urls")
    private Map<String, String> externalUrls = new HashMap<String, String>();

    @SerializedName("genres")
    private List<String> genres = new ArrayList<String>();

    @SerializedName("href")
    private String href = null;

    @SerializedName("id")
    private String artistId = null;

    @SerializedName("images")
    private List<Image> images = new ArrayList<Image>();

    @SerializedName("name")
    private String name = null;

    @SerializedName("popularity")
    private Integer popularity = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("uri")
    private String uri = null;


    public Artist() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Known external URLs for this artist.
     **/
    public Map<String, String> getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(Map<String, String> externalUrls) {
        this.externalUrls = externalUrls;
    }


    /**
     * A list of the genres the artist is associated with. For example: 'Prog Rock', 'Post-Grunge'. (If not yet classified, the array is empty.)
     **/
    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }


    /**
     * A link to the Web API endpoint providing full details of the artist.
     **/
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


    /**
     * The Spotify ID for the artist.
     **/
    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }


    /**
     * Images of the artist in various sizes, widest first.
     **/
    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }


    /**
     * The name of the artist.
     **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * The popularity of the artist. The value will be between 0 and 100, with 100 being the most popular. The artist's popularity is calculated from the popularity of all the artist's tracks.
     **/
    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }


    /**
     * The object type: 'artist'
     **/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    /**
     * The Spotify URI for the artist.
     **/
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Artist artist = (Artist) o;
        return Objects.equals(externalUrls, artist.externalUrls) &&
                Objects.equals(genres, artist.genres) &&
                Objects.equals(href, artist.href) &&
                Objects.equals(artistId, artist.artistId) &&
                Objects.equals(images, artist.images) &&
                Objects.equals(name, artist.name) &&
                Objects.equals(popularity, artist.popularity) &&
                Objects.equals(type, artist.type) &&
                Objects.equals(uri, artist.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalUrls, genres, href, artistId, images, name, popularity, type, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OldArtist {\n");

        sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
        sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    artistId: ").append(toIndentedString(artistId)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
