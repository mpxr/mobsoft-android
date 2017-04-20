package martonveto.com.mobsoft.interactor.albums.events;

import martonveto.com.mobsoft.model.Album;

public class RemoveAlbumEvent {

    private int code;
    private Album album;
    private Throwable throwable;


    public RemoveAlbumEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
