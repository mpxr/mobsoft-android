package martonveto.com.mobsoft.network;

import martonveto.com.mobsoft.model.AlbumSimplePage;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ArtistsApi {
  
  /**
   * 
   * [Get an OldArtist&#39;s Albums](https://developer.spotify.com/web-api/get-artists-albums/)
   * @param id The Spotify ID for the artist
   * @param limit The maximum number of items to return
   * @param offset The index of the first item to return
   * @param albumType Filter by album types
   * @param market The market (an ISO 3166-1 alpha-2 country code)
   * @return Call<AlbumSimplePage>
   */
  
  @GET("artists/{id}/albums")
  Call<AlbumSimplePage> artistsAlbumIdAlbumsGet(
    @Path("id") String id, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("album_type") String albumType, @Query("market") String market
  );

  
}
