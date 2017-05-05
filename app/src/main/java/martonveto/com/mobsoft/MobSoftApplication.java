package martonveto.com.mobsoft;


import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

import io.fabric.sdk.android.Fabric;
import javax.inject.Inject;

import martonveto.com.mobsoft.repository.Repository;
import martonveto.com.mobsoft.ui.UIModule;


public class MobSoftApplication extends Application {

    public static MobSoftApplicationComponent injector;

    @Inject
    Repository repository;

    private Tracker mTracker;


    public void setInjector(MobSoftApplicationComponent applicationComponent){
        injector = applicationComponent;
        injector.inject(this);
        repository.open(getApplicationContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());

        injector =
                DaggerMobSoftApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
        injector.inject(this);
        repository.open(getApplicationContext());
    }

    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }

}