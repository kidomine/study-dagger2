package cc.yggdrasil.study.dagger2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


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