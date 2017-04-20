package martonveto.com.mobsoft.interactor.albums.events;

import java.util.List;

import martonveto.com.mobsoft.model.Album;

public class GetAllAlbumsEvent {

    private int code;
    private List<Album> albums;
    private Throwable throwable;

    public GetAllAlbumsEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
