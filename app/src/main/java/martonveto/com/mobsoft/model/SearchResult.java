package martonveto.com.mobsoft.model;

import java.util.List;

public class SearchResult {

    private List<Artist> artists;

    public SearchResult() {
    }

    public SearchResult(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

}
