package martonveto.com.mobsoft.network;

import martonveto.com.mobsoft.model.Album;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AlbumApi {

    /**
     * [Get an OldAlbum](https://developer.spotify.com/web-api/get-album/)
     *
     * @param albumId The Spotify ID for the album
     * @param market  The market (an ISO 3166-1 alpha-2 country code)
     * @return Call<OldAlbum>
     */

    @GET("albums/{id}")
    Call<Album> albumsAlbumIdGet(
            @Path("id") String albumId, @Query("market") String market
    );


}
