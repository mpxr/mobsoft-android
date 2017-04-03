package martonveto.com.mobsoft;

import javax.inject.Singleton;

import dagger.Component;
import martonveto.com.mobsoft.ui.UIModule;
import martonveto.com.mobsoft.ui.album.list.AlbumListActivity;
import martonveto.com.mobsoft.ui.detail.DetailActivity;
import martonveto.com.mobsoft.ui.home.MainActivity;

@Singleton
@Component(modules = {UIModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(DetailActivity detailActivity);
    void inject(AlbumListActivity albumListActivity);

}