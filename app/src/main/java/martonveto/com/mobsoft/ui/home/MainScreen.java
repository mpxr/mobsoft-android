package martonveto.com.mobsoft.ui.home;

import java.util.List;

import martonveto.com.mobsoft.model.Album;
import martonveto.com.mobsoft.model.Artist;
import martonveto.com.mobsoft.model.SearchAlbums;
import martonveto.com.mobsoft.model.SearchArtists;

interface MainScreen {

    void showMessage(String text);

    void startAlbumListIntent(Artist artist);

    void showResults(SearchArtists search);

    void showSavedAlbums(List<Album> albums);
}
