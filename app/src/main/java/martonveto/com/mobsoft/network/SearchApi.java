package martonveto.com.mobsoft.network;

import java.math.BigDecimal;

import martonveto.com.mobsoft.model.Search;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchApi {
  
  /**
   * Search for an Item
   * Search for an Item (album, artist, trak, playlist)
   * @param q The search query&#39;s keywords (and optional field filters and operators).
   * @param itemType A comma-separated list of item types to search across. Valid types are album, artist, playlist, and track.
   * @param limit The maximum number of results to return. Default 20. Minimum 1. Maximum 50.
   * @param offset The index of the first result to return. Default 0 (i.e., the first result). Maximum offset 100.000. Use with limit to get the next page of search results.
   * @return Call<Search>
   */
  
  @GET("search")
  Call<Search> searchGet(
    @Query("q") String q, @Query("type") String itemType, @Query("limit") BigDecimal limit, @Query("offset") BigDecimal offset
  );

  
}
