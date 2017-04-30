package martonveto.com.mobsoft.interactor;

import dagger.Module;
import dagger.Provides;
import martonveto.com.mobsoft.interactor.albums.AlbumsInteractor;
import martonveto.com.mobsoft.interactor.details.DetailsInteractor;
import martonveto.com.mobsoft.interactor.search.SearchInteractor;

@Module
public class InteractorModule {

    @Provides
    public DetailsInteractor provideDetailsInteractor() {
        return new DetailsInteractor();
    }

    @Provides
    public AlbumsInteractor provideAlbumsInterceptor() {
        return new AlbumsInteractor();
    }

    @Provides
    public SearchInteractor provideSearchInteractor(){
        return new SearchInteractor();
    }

}
