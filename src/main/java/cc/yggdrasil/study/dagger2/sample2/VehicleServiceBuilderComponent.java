package cc.yggdrasil.study.dagger2.sample2;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component()
public interface VehicleServiceBuilderComponent
{
    VehicleServiceBuilder.Factory buildVehicleServiceBuilderFactory();
}
