package cc.yggdrasil.study.dagger2.sample1;

import cc.yggdrasil.study.dagger2.sample2.VehicleServiceBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class VehicleComponentTest
{
    @Test
    void buildCar()
    {
        VehicleComponent component = DaggerVehicleComponent.create();

        Car carOne = component.buildCar();
        Car carTwo = component.buildCar();

        Assertions.assertNotNull(carOne);
        Assertions.assertNotNull(carTwo);
        Assertions.assertNotNull(carOne.getEngine());
        Assertions.assertNotNull(carTwo.getEngine());
        Assertions.assertNotNull(carOne.getBrand());
        Assertions.assertNotNull(carTwo.getBrand());
        Assertions.assertNotEquals(carOne.getEngine(), carTwo.getEngine());
        Assertions.assertEquals(carOne.getBrand(), carTwo.getBrand());
    }
}