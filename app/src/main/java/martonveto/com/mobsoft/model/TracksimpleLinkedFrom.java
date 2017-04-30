package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * Part of the response when Track Relinking is applied, and the requested track has been replaced with different track. The track in the linked_from object contains information about the originally requested track.
 **/
public class TracksimpleLinkedFrom {

    @SerializedName("albumId")
    private String albumId = null;

    @SerializedName("href")
    private String href = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("external_urls")
    private Map<String, String> externalUrls = new HashMap<String, String>();

    @SerializedName("uri")
    private String uri = null;


    /**
     * The Spotify ID for the track.
     **/
    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }


    /**
     * A link to the Web API endpoint providing full details of the track.
     **/
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


    /**
     * The object type: 'track'.
     **/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    /**
     * Known external URLs for this track.
     **/
    public Map<String, String> getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(Map<String, String> externalUrls) {
        this.externalUrls = externalUrls;
    }


    /**
     * The Spotify URI for the track.
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
        TracksimpleLinkedFrom tracksimpleLinkedFrom = (TracksimpleLinkedFrom) o;
        return Objects.equals(albumId, tracksimpleLinkedFrom.albumId) &&
                Objects.equals(href, tracksimpleLinkedFrom.href) &&
                Objects.equals(type, tracksimpleLinkedFrom.type) &&
                Objects.equals(externalUrls, tracksimpleLinkedFrom.externalUrls) &&
                Objects.equals(uri, tracksimpleLinkedFrom.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, href, type, externalUrls, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TracksimpleLinkedFrom {\n");

        sb.append("    albumId: ").append(toIndentedString(albumId)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
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
