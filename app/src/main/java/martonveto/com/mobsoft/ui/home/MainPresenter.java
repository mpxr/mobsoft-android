package martonveto.com.mobsoft.ui.home;

import martonveto.com.mobsoft.ui.Presenter;

public class MainPresenter extends Presenter<MainScreen> {

    public MainPresenter() {
    }

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void showDetails() {
        screen.startDetailIntent();
    }

    public void showAlbumList() {
        screen.startAlbumListIntent();
    }
}