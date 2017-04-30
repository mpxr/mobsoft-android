package martonveto.com.mobsoft.interactor.search;

import java.io.IOException;
import java.math.BigDecimal;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.interactor.search.events.SearchEvent;
import martonveto.com.mobsoft.model.Search;
import martonveto.com.mobsoft.network.SearchApi;
import retrofit2.Response;

public class SearchInteractor {

    private static final String ARTIST = "artist";

    @Inject
    SearchApi searchApi;

    @Inject
    EventBus eventBus;

    public SearchInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void search(String artist) {
        SearchEvent searchEvent = new SearchEvent();
        try {
            Response<Search> searchResult = searchApi.searchGet(artist, ARTIST, BigDecimal.TEN, BigDecimal.ZERO).execute();
            searchEvent.setSearch(searchResult.body());
            eventBus.post(searchEvent);
        } catch (IOException e) {
            searchEvent.setThrowable(e);
            eventBus.post(searchEvent);
        }
    }

}
