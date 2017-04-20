package martonveto.com.mobsoft;

import javax.inject.Singleton;

import dagger.Component;
import martonveto.com.mobsoft.interactor.InteractorModule;
import martonveto.com.mobsoft.interactor.albums.AlbumsInteractor;
import martonveto.com.mobsoft.interactor.artist.ArtistInteractor;
import martonveto.com.mobsoft.interactor.details.DetailsInteractor;
import martonveto.com.mobsoft.repository.RepositoryModule;
import martonveto.com.mobsoft.ui.UIModule;
import martonveto.com.mobsoft.ui.album.list.AlbumListActivity;
import martonveto.com.mobsoft.ui.detail.DetailActivity;
import martonveto.com.mobsoft.ui.home.MainActivity;

@Singleton
@Component(modules = {UIModule.class, RepositoryModule.class, InteractorModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(DetailActivity detailActivity);
    void inject(AlbumListActivity albumListActivity);
    void inject(DetailsInteractor detailsInteractor);
    void inject(AlbumsInteractor albumsInteractor);
    void inject(ArtistInteractor artistInteractor);

}