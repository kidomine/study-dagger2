package cc.yggdrasil.study.dagger2.sample3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MyBusinessServiceTest
{
    @Mock
    BundleContext mockBundleContext;

    @Mock
    private Bundle mockBundle;

    @BeforeEach
    void setup() {
        // You often need to mock the relationship between context and bundle
        when(mockBundleContext.getBundle()).thenReturn(mockBundle);
        when(mockBundle.getSymbolicName()).thenReturn("cc.yggdrasil.study.dagger2.sample3.bundle");
    }

    @Test
    void buildServiceWithContext()
    {
        BundleComponent component = DaggerBundleComponent.builder()
                                                         .bundleModule(new BundleModule(mockBundleContext))
                                                         .build();

        final MyBusinessService sut = component.businessService();
        sut.process();

        System.out.println("Bundle started successfully.");
    }
}