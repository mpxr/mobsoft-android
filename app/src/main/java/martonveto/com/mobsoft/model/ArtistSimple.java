package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class ArtistSimple {

    @SerializedName("external_urls")
    private Map<String, String> externalUrls = new HashMap<String, String>();

    @SerializedName("href")
    private String href = null;

    @SerializedName("albumId")
    private String albumId = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("uri")
    private String uri = null;


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
    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
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
        ArtistSimple artistSimple = (ArtistSimple) o;
        return Objects.equals(externalUrls, artistSimple.externalUrls) &&
                Objects.equals(href, artistSimple.href) &&
                Objects.equals(albumId, artistSimple.albumId) &&
                Objects.equals(name, artistSimple.name) &&
                Objects.equals(type, artistSimple.type) &&
                Objects.equals(uri, artistSimple.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalUrls, href, albumId, name, type, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtistSimple {\n");

        sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    albumId: ").append(toIndentedString(albumId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
