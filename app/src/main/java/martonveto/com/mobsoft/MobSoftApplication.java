package martonveto.com.mobsoft;


import android.app.Application;

import javax.inject.Inject;

import martonveto.com.mobsoft.repository.Repository;
import martonveto.com.mobsoft.ui.UIModule;


public class MobSoftApplication extends Application {

    public static MobSoftApplicationComponent injector;

    @Inject
    Repository repository;

    public void setInjector(MobSoftApplicationComponent applicationComponent){
        injector = applicationComponent;
        injector.inject(this);
        repository.open(getApplicationContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerMobSoftApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
        injector.inject(this);
        repository.open(getApplicationContext());
    }
}