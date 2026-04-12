package cc.yggdrasil.study.dagger2.sample3;

import javax.inject.Singleton;

@Singleton
@dagger.Component(modules = BundleModule.class)
public interface BundleComponent {
    MyBusinessService businessService();
}
