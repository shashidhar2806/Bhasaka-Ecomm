package com.bhasaka.ecomm.core.models;

import com.bhasaka.ecomm.core.testcontext.AppAemContext;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(AemContextExtension.class)
class DemoModelTest {
    private final AemContext context = AppAemContext.newAemContext();
    DemoModel demoModel;
    @BeforeEach
    void setUp() {
        context.addModelsForClasses(DemoModel.class);
        context.load().json("/demoModel.json", "/content");
        Resource resource = context.currentResource("/content");
        demoModel = resource.adaptTo(DemoModel.class);

    }

    @Test
    void getVal1() {
        assertEquals("val1", demoModel.getVal1());
    }
}