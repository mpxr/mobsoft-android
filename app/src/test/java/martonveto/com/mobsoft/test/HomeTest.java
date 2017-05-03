package martonveto.com.mobsoft.test;

import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import martonveto.com.mobsoft.BuildConfig;
import martonveto.com.mobsoft.utils.RobolectricDaggerTestRunner;

@RunWith(RobolectricDaggerTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class HomeTest {
}
