package cc.yggdrasil.study.dagger2;

public class Engine
{
    private final String name;
    private final String model;

    public Engine(final String name, final String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel()
    {
        return model;
    }
}
