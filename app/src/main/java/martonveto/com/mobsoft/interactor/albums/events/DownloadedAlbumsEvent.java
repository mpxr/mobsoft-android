package martonveto.com.mobsoft.interactor.albums.events;

import martonveto.com.mobsoft.model.AlbumSimplePage;

public class DownloadedAlbumsEvent {

    private int code;
    private AlbumSimplePage albums;
    private Throwable throwable;

    public DownloadedAlbumsEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public AlbumSimplePage getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumSimplePage albums) {
        this.albums = albums;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
