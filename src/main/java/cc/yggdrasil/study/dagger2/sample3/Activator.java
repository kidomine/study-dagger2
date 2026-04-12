package cc.yggdrasil.study.dagger2.sample3;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    private MyBusinessService service;

    @Override
    public void start(BundleContext context) throws Exception {
        // Initialize Dagger Graph
        BundleComponent component = DaggerBundleComponent.builder()
                                                         .bundleModule(new BundleModule(context))
                                                         .build();

        // Get your wired service
        this.service = component.businessService();
        this.service.process();

        System.out.println("Bundle started successfully.");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Bundle stopping.");
        this.service = null;
    }
}
