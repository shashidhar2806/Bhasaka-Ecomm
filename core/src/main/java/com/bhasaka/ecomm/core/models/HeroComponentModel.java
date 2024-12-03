package com.bhasaka.ecomm.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.List;

@Model(adaptables = Resource.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HeroComponentModel {
    @ChildResource(name = "headerCarouselItems")
    private List<CarouselItemModel> headerCarouselItemsList;

    @ChildResource(name = "productOffers")
    private List<ProductOfferModel> productOffersList;

    public List<CarouselItemModel> getHeaderCarouselItemsList() {
        return headerCarouselItemsList;
    }

    public List<ProductOfferModel> getProductOffersList() {
        return productOffersList;
    }
}
