package martonveto.com.mobsoft.model;

import com.google.gson.annotations.SerializedName;
import com.orm.dsl.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Table
public class TrackSimple {

    @SerializedName("db_id")
    private transient Long id = null;

    @SerializedName("artists")
    private List<ArtistSimple> artists = new ArrayList<ArtistSimple>();

    @SerializedName("available_markets")
    private List<String> availableMarkets = new ArrayList<String>();

    @SerializedName("disc_number")
    private Integer discNumber = null;

    @SerializedName("duration_ms")
    private Integer durationMs = null;

    @SerializedName("explicit")
    private Boolean explicit = null;

    @SerializedName("external_urls")
    private Map<String, String> externalUrls = new HashMap<String, String>();

    @SerializedName("href")
    private String href = null;

    @SerializedName("albumId")
    private String albumId = null;

    @SerializedName("is_playable")
    private Boolean isPlayable = null;

    @SerializedName("linked_from")
    private TracksimpleLinkedFrom linkedFrom = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("preview_url")
    private String previewUrl = null;

    @SerializedName("track_number")
    private Integer trackNumber = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("uri")
    private String uri = null;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * The artists who performed the track. Each artist object includes a link in href to more detailed information about the artist.
     **/
    public List<ArtistSimple> getArtists() {
        return artists;
    }

    public void setArtists(List<ArtistSimple> artists) {
        this.artists = artists;
    }


    /**
     * A list of the countries in which the track can be played, identified by their ISO 3166-1 alpha-2 code.
     **/
    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }


    /**
     * The disc number (usually 1 unless the album consists of more than one disc).
     **/
    public Integer getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }


    /**
     * The track length in milliseconds.
     **/
    public Integer getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }


    /**
     * Whether or not the track has explicit lyrics (true = yes it does; false = no it does not OR unknown).
     **/
    public Boolean getExplicit() {
        return explicit;
    }

    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
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
     * A link to the Web API endpoint providing full details of the track.
     **/
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


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
     * Part of the response when Track Relinking is applied. If true, the track is playable in the given market. Otherwise false.
     **/
    public Boolean getIsPlayable() {
        return isPlayable;
    }

    public void setIsPlayable(Boolean isPlayable) {
        this.isPlayable = isPlayable;
    }


    /**
     **/
    public TracksimpleLinkedFrom getLinkedFrom() {
        return linkedFrom;
    }

    public void setLinkedFrom(TracksimpleLinkedFrom linkedFrom) {
        this.linkedFrom = linkedFrom;
    }


    /**
     * The name of the track.
     **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * A URL to a 30 second preview (MP3 format) of the track.
     **/
    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }


    /**
     * The number of the track. If an album has several discs, the track number is the number on the specified disc.
     **/
    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
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
        TrackSimple trackSimple = (TrackSimple) o;
        return Objects.equals(artists, trackSimple.artists) &&
                Objects.equals(availableMarkets, trackSimple.availableMarkets) &&
                Objects.equals(discNumber, trackSimple.discNumber) &&
                Objects.equals(durationMs, trackSimple.durationMs) &&
                Objects.equals(explicit, trackSimple.explicit) &&
                Objects.equals(externalUrls, trackSimple.externalUrls) &&
                Objects.equals(href, trackSimple.href) &&
                Objects.equals(albumId, trackSimple.albumId) &&
                Objects.equals(isPlayable, trackSimple.isPlayable) &&
                Objects.equals(linkedFrom, trackSimple.linkedFrom) &&
                Objects.equals(name, trackSimple.name) &&
                Objects.equals(previewUrl, trackSimple.previewUrl) &&
                Objects.equals(trackNumber, trackSimple.trackNumber) &&
                Objects.equals(type, trackSimple.type) &&
                Objects.equals(uri, trackSimple.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artists, availableMarkets, discNumber, durationMs, explicit, externalUrls, href, albumId, isPlayable, linkedFrom, name, previewUrl, trackNumber, type, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackSimple {\n");

        sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
        sb.append("    availableMarkets: ").append(toIndentedString(availableMarkets)).append("\n");
        sb.append("    discNumber: ").append(toIndentedString(discNumber)).append("\n");
        sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
        sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
        sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    albumId: ").append(toIndentedString(albumId)).append("\n");
        sb.append("    isPlayable: ").append(toIndentedString(isPlayable)).append("\n");
        sb.append("    linkedFrom: ").append(toIndentedString(linkedFrom)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
        sb.append("    trackNumber: ").append(toIndentedString(trackNumber)).append("\n");
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
