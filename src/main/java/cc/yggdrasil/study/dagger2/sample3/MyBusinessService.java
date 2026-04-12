package cc.yggdrasil.study.dagger2.sample3;

import org.osgi.framework.BundleContext;

import javax.inject.Inject;

public class MyBusinessService {
    private final String message;
    private final BundleContext context;

    @Inject
    public MyBusinessService(String message, BundleContext context) {
        this.message = message;
        this.context = context;
    }

    public void process() {
        String bsn = context.getBundle().getSymbolicName();
        System.out.println("[" + bsn + "] Processing: " + message);
    }
}
