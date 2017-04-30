package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class AlbumSimple {

    @SerializedName("album_type")
    private String albumType = null;

    @SerializedName("available_markets")
    private List<String> availableMarkets = new ArrayList<String>();

    @SerializedName("external_urls")
    private Map<String, String> externalUrls = new HashMap<String, String>();

    @SerializedName("href")
    private String href = null;

    @SerializedName("id")
    private String albumId = null;

    @SerializedName("images")
    private List<Image> images = new ArrayList<Image>();

    @SerializedName("name")
    private String name = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("uri")
    private String uri = null;


    /**
     * The type of the album: one of 'album', 'single', or 'compilation'.
     **/
    public String getAlbumType() {
        return albumType;
    }

    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }


    /**
     * The markets in which the album is available: ISO 3166-1 alpha-2 country codes. Note that an album is considered available in a market when at least 1 of its tracks is available in that market.
     **/
    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }


    /**
     * Known external URLs for this album.
     **/
    public Map<String, String> getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(Map<String, String> externalUrls) {
        this.externalUrls = externalUrls;
    }


    /**
     * A link to the Web API endpoint providing full details of the album.
     **/
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


    /**
     * The Spotify ID for the album.
     **/
    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }


    /**
     * The cover art for the album in various sizes, widest first.
     **/
    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }


    /**
     * The name of the album.
     **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * The object type: 'album'.
     **/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    /**
     * The Spotify URI for the album.
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
        AlbumSimple albumSimple = (AlbumSimple) o;
        return Objects.equals(albumType, albumSimple.albumType) &&
                Objects.equals(availableMarkets, albumSimple.availableMarkets) &&
                Objects.equals(externalUrls, albumSimple.externalUrls) &&
                Objects.equals(href, albumSimple.href) &&
                Objects.equals(albumId, albumSimple.albumId) &&
                Objects.equals(images, albumSimple.images) &&
                Objects.equals(name, albumSimple.name) &&
                Objects.equals(type, albumSimple.type) &&
                Objects.equals(uri, albumSimple.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumType, availableMarkets, externalUrls, href, albumId, images, name, type, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlbumSimple {\n");

        sb.append("    albumType: ").append(toIndentedString(albumType)).append("\n");
        sb.append("    availableMarkets: ").append(toIndentedString(availableMarkets)).append("\n");
        sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    albumId: ").append(toIndentedString(albumId)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
