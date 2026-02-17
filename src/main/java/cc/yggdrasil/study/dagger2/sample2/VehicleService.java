package cc.yggdrasil.study.dagger2.sample2;

import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public class VehicleService
{
    private final Context context;

    @AssistedInject
    public VehicleService(@Assisted final Context context)
    {
        this.context = context;
    }

    public void run()
    {
        System.out.println("VehicleService is running in " + context.getName());
    }
}
