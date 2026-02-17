package cc.yggdrasil.study.dagger2.sample1;

import dagger.Provides;
import dagger.Module;

import javax.inject.Singleton;

@Module
public class VehiclesModule
{
    @Provides
    public Engine providesEngine()
    {
        return new Engine("VTEC", "1.5L");
    }

    @Singleton
    @Provides
    public Brand providesBrand()
    {
        return new Brand("Honda");
    }
}
