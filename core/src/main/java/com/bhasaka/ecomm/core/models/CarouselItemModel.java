package com.bhasaka.ecomm.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = {Resource.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CarouselItemModel {
    @ValueMapValue(name="itemTitle")
    private String title;

    @ValueMapValue(name = "itemDescription")
    private  String description;

    @ValueMapValue(name = "itemLink")
    private String link;

    @ValueMapValue(name="imagePath")
    private String imagePath;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getImagePath() {
        return imagePath;
    }
}
