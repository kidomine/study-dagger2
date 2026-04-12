package cc.yggdrasil.study.dagger2.sample3;

import dagger.Module;
import dagger.Provides;
import org.osgi.framework.BundleContext;

import javax.inject.Singleton;

@Module
public class BundleModule {
    private final BundleContext bundleContext;

    public BundleModule(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }

    @Provides
    @Singleton
    BundleContext provideBundleContext() {
        return this.bundleContext;
    }

    @Provides
    @Singleton
    String provideWelcomeMessage() {
        return "Dagger is now OSGi-aware!";
    }
}
