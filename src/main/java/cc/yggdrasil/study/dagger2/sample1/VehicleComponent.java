package cc.yggdrasil.study.dagger2.sample1;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = VehiclesModule.class)
public interface VehicleComponent
{
    Car buildCar();
}
