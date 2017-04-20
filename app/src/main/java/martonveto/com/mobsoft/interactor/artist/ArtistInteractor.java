package martonveto.com.mobsoft.interactor.artist;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.interactor.artist.events.GetAllArtistsEvent;
import martonveto.com.mobsoft.repository.Repository;

public class ArtistInteractor {

    @Inject
    Repository repository;

    @Inject
    EventBus eventBus;

    public ArtistInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void findAllArtists() {
        GetAllArtistsEvent event = new GetAllArtistsEvent();
        try {
            event.setArtists(repository.getAllArtist());
            eventBus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            eventBus.post(event);
        }
    }


}
