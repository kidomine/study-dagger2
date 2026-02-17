package cc.yggdrasil.study.dagger2.sample2;

import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;

public class VehicleServiceBuilder
{
    private final Context context;

    @AssistedInject
    public VehicleServiceBuilder(@Assisted Context context)
    {
        this.context = context;
    }

    @AssistedFactory
    public interface Factory
    {
        VehicleService create(final Context context);
    }
}
