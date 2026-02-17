package cc.yggdrasil.study.dagger2.sample2;

import org.junit.jupiter.api.Test;


class VehicleServiceTest
{
    @Test
    void buildCarWithContext()
    {
        final Context context = new Context("TestContext");

        final VehicleServiceBuilderComponent component = DaggerVehicleServiceBuilderComponent.create();
        final VehicleServiceBuilder.Factory vehicleServiceBuilder = component.buildVehicleServiceBuilderFactory();

        final VehicleService vehicleService = vehicleServiceBuilder.create(context);
        vehicleService.run();
    }
}