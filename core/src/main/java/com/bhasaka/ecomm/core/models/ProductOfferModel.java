package com.bhasaka.ecomm.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ProductOfferModel {
    @ValueMapValue(name = "productDiscount")
    private String discount;

    @ValueMapValue(name = "discountType")
    private String discountType;

    @ValueMapValue(name = "offerLink")
    private String link;

    @ValueMapValue(name = "imagePath")
    private String imagePath;

    public String getDiscount() {
        return discount;
    }

    public String getDiscountType() {
        return discountType;
    }

    public String getLink() {
        return link;
    }

    public String getImagePath() {
        return imagePath;
    }
}
