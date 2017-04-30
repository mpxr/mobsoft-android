package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;
import com.orm.dsl.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Table
public class Album {

    @SerializedName("db_id")
    private transient Long id = null;

    @SerializedName("album_type")
    private String albumType = null;

    @SerializedName("artists")
    private List<Artist> artists = new ArrayList<Artist>();

    @SerializedName("available_markets")
    private List<String> availableMarkets = new ArrayList<String>();

    @SerializedName("copyrights")
    private List<AlbumCopyrights> copyrights = new ArrayList<AlbumCopyrights>();

    @SerializedName("external_ids")
    private Map<String, String> externalIds = new HashMap<String, String>();

    @SerializedName("external_urls")
    private Map<String, String> externalUrls = new HashMap<String, String>();

    @SerializedName("genres")
    private List<String> genres = new ArrayList<String>();

    @SerializedName("href")
    private String href = null;

    @SerializedName("albumId")
    private String albumId = null;

    @SerializedName("images")
    private List<Image> images = new ArrayList<Image>();

    @SerializedName("name")
    private String name = null;

    @SerializedName("popularity")
    private Integer popularity = null;

    @SerializedName("release_date")
    private String releaseDate = null;

    @SerializedName("release_date_precision")
    private String releaseDatePrecision = null;

    @SerializedName("tracks")
    private TrackSimplePage tracks = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("uri")
    private String uri = null;

    public Album() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
     * The artists of the album. Each artist object includes a link in href to more detailed information about the artist.
     **/
    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
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
     * The copyright statements of the album.
     **/
    public List<AlbumCopyrights> getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(List<AlbumCopyrights> copyrights) {
        this.copyrights = copyrights;
    }


    /**
     * Known external IDs for this album.
     **/
    public Map<String, String> getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(Map<String, String> externalIds) {
        this.externalIds = externalIds;
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
     * A list of the genres used to classify the album. For example: 'Prog Rock', 'Post-Grunge'. (If not yet classified, the array is empty.)
     **/
    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
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
     * The popularity of the album. The value will be between 0 and 100, with 100 being the most popular. The popularity is calculated from the popularity of the album's individual tracks.
     **/
    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }


    /**
     * The date the album was first released, for example '1981-12-15'. Depending on the precision, it might be shown as '1981' or '1981-12'.
     **/
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * The precision with which release_date value is known: 'year', 'month', or 'day'.
     **/
    public String getReleaseDatePrecision() {
        return releaseDatePrecision;
    }

    public void setReleaseDatePrecision(String releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
    }


    /**
     **/
    public TrackSimplePage getTracks() {
        return tracks;
    }

    public void setTracks(TrackSimplePage tracks) {
        this.tracks = tracks;
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
        Album album = (Album) o;
        return Objects.equals(albumType, album.albumType) &&
                Objects.equals(artists, album.artists) &&
                Objects.equals(availableMarkets, album.availableMarkets) &&
                Objects.equals(copyrights, album.copyrights) &&
                Objects.equals(externalIds, album.externalIds) &&
                Objects.equals(externalUrls, album.externalUrls) &&
                Objects.equals(genres, album.genres) &&
                Objects.equals(href, album.href) &&
                Objects.equals(albumId, album.albumId) &&
                Objects.equals(images, album.images) &&
                Objects.equals(name, album.name) &&
                Objects.equals(popularity, album.popularity) &&
                Objects.equals(releaseDate, album.releaseDate) &&
                Objects.equals(releaseDatePrecision, album.releaseDatePrecision) &&
                Objects.equals(tracks, album.tracks) &&
                Objects.equals(type, album.type) &&
                Objects.equals(uri, album.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumType, artists, availableMarkets, copyrights, externalIds, externalUrls, genres, href, albumId, images, name, popularity, releaseDate, releaseDatePrecision, tracks, type, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OldAlbum {\n");

        sb.append("    albumType: ").append(toIndentedString(albumType)).append("\n");
        sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
        sb.append("    availableMarkets: ").append(toIndentedString(availableMarkets)).append("\n");
        sb.append("    copyrights: ").append(toIndentedString(copyrights)).append("\n");
        sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
        sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
        sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    albumId: ").append(toIndentedString(albumId)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("    releaseDatePrecision: ").append(toIndentedString(releaseDatePrecision)).append("\n");
        sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
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
