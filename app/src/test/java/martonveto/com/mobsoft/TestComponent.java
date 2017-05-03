package martonveto.com.mobsoft;

import javax.inject.Singleton;

import dagger.Component;
import martonveto.com.mobsoft.interactor.InteractorModule;
import martonveto.com.mobsoft.repository.TestRepositoryModule;

@Singleton
@Component(modules = {TestModule.class, InteractorModule.class, TestRepositoryModule.class})
public interface TestComponent extends MobSoftApplicationComponent {
}