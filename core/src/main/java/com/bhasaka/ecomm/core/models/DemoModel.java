package com.bhasaka.ecomm.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;


@Model(adaptables = Resource.class ,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class DemoModel {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @ValueMapValue
    private String val1;

    @PostConstruct
    void acivate(){
        logger.info("Inside Activate Method");
    }

    public String getVal1() {
        return val1;
    }
}
