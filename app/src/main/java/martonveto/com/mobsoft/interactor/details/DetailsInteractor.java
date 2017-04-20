package martonveto.com.mobsoft.interactor.details;


import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import martonveto.com.mobsoft.MobSoftApplication;
import martonveto.com.mobsoft.repository.Repository;

public class DetailsInteractor {


    @Inject
    Repository repository;

    @Inject
    EventBus eventBus;

    public DetailsInteractor() {
        MobSoftApplication.injector.inject(this);
    }
}
