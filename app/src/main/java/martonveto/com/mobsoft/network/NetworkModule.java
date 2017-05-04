package martonveto.com.mobsoft.network;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import martonveto.com.mobsoft.utils.GsonHelper;
import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

@Module
public class NetworkModule {

    @Provides
    @Singleton
    public OkHttpClient.Builder provideOkHttpClientBuilder() {
        return new OkHttpClient().newBuilder();
    }


    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder) {
        return builder.build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().baseUrl(NetworkConfig.SERVICE_ENDPOINT).client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonHelper.getGson())).build();
    }

    @Provides
    @Singleton
    public AlbumApi provideAlbumApi(Retrofit retrofit){
        return retrofit.create(AlbumApi.class);
    }

    @Provides
    @Singleton
    public ArtistsApi provideArtistsApi(Retrofit retrofit){
        return retrofit.create(ArtistsApi.class);
    }

    @Provides
    @Singleton
    public SearchApi provideSearchApi(Retrofit retrofit){
        return retrofit.create(SearchApi.class);
    }

}
