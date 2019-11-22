package com.highfi.sys.java8.set;

import com.highfi.sys.collections.set.ProductCatalogue;
import org.junit.Test;

import static com.highfi.sys.collections.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ProductCatalogueTest {

//    @Test
//    public void shouldOnlyHoldUniqueProducts() throws Exception {
//
//        ProductCatalogue catalogue = new ProductCatalogue();
//
//        catalogue.isSuppliedBy(bobs);
//        catalogue.isSuppliedBy(kates);
//
//        assertThat(catalogue, containsInAnyOrder(door, floorPanel));
//
//    }

    @Test
    public void shouldFindLightVanProducts() throws Exception {

        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.lightVanProducts(), containsInAnyOrder(door, floorPanel));

    }

    @Test
    public void shouldFindHeavyVanProducts() throws Exception {

        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floorPanel));

    }
}
