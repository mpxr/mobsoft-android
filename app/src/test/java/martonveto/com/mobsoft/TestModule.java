package martonveto.com.mobsoft;

import android.content.Context;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.network.AlbumApi;
import martonveto.com.mobsoft.network.ArtistsApi;
import martonveto.com.mobsoft.network.NetworkConfig;
import martonveto.com.mobsoft.network.NetworkModule;
import martonveto.com.mobsoft.network.SearchApi;
import martonveto.com.mobsoft.ui.UIModule;
import martonveto.com.mobsoft.ui.album.list.AlbumListPresenter;
import martonveto.com.mobsoft.ui.detail.DetailPresenter;
import martonveto.com.mobsoft.ui.home.MainPresenter;
import martonveto.com.mobsoft.utils.GsonHelper;
import martonveto.com.mobsoft.utils.UiExecutor;
import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

@Module
public class TestModule {

    private final UIModule UIModule;

    private final NetworkModule NetworkModule;

    public TestModule(Context context) {
        this.UIModule = new UIModule(context);
        this.NetworkModule = new NetworkModule(context);
    }

    @Provides
    public Context provideContext() {
        return UIModule.provideContext();
    }


    @Provides
    public MainPresenter provideMainPresenter() {
        return UIModule.provideMainPresenter();
    }


    @Provides
    public DetailPresenter provideDetailPresenter(){
        return UIModule.provideDetailPresenter();
    }

    @Provides
    public AlbumListPresenter provideAlbumListPresenter(){
        return UIModule.provideAlbumListPresenter();
    }

    @Provides
    public AlbumApi provideAlbumApi(Retrofit retrofit){
        return NetworkModule.provideAlbumApi(retrofit);
    }

    @Provides
    public ArtistsApi provideArtistsApi(Retrofit retrofit){
        return NetworkModule.provideArtistsApi(retrofit);
    }

    @Provides
    public SearchApi provideSearchApi(Retrofit retrofit){
        return NetworkModule.provideSearchApi(retrofit);
    }
    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().baseUrl(NetworkConfig.SERVICE_ENDPOINT).client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonHelper.getGson())).build();
    }

    @Provides
    @Singleton
    public EventBus provideEventBus() {
        return EventBus.getDefault();
    }

    @Provides
    @Singleton
    public Executor provideNetworkExecutor() {
        return new UiExecutor();
    }

}
