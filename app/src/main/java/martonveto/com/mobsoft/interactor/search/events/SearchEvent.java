package martonveto.com.mobsoft.interactor.search.events;

import martonveto.com.mobsoft.model.Search;

public class SearchEvent {

    private int code;
    private Search search;
    private Throwable throwable;

    public SearchEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
