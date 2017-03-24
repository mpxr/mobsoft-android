package martonveto.com.mobsoft;

import javax.inject.Singleton;

import dagger.Component;
import martonveto.com.mobsoft.ui.UIModule;
import martonveto.com.mobsoft.ui.main.MainActivity;

@Singleton
@Component(modules = {UIModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);

}