package martonveto.com.mobsoft.interactor.artist.events;

import java.util.List;

import martonveto.com.mobsoft.model.Artist;

public class GetAllArtistsEvent {

    private int code;
    private List<Artist> artists;
    private Throwable throwable;

    public GetAllArtistsEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
