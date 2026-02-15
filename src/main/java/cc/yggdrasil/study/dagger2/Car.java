package cc.yggdrasil.study.dagger2;

import javax.inject.Inject;

public class Car
{
    private final Engine engine;
    private final Brand brand;

    @Inject
    public Car(final Engine engine, final Brand brand) {
        this.engine = engine;
        this.brand = brand;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public Brand getBrand()
    {
        return brand;
    }
}
