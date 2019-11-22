package com.highfi.sys.collections.collection;

import com.highfi.sys.collections.ProductFixturesMap;
import com.highfi.sys.collections.ProductMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<ProductMap> products = new ArrayList<>();
        products.add(ProductFixturesMap.door);
        products.add(ProductFixturesMap.floorPanel);
        products.add(ProductFixturesMap.window);
//        System.out.println(products);
//
//        Collections.sort(products, ProductMap.BY_NAME);
//        System.out.println(products);
//        Collections.sort(products, ProductMap.BY_WEIGHT);
//        System.out.println(products);

//        in JAVA8, sort was implemented directly in List
        System.out.println(products);
        products.sort(ProductMap.BY_NAME);
        System.out.println(products);
        products.sort(ProductMap.BY_WEIGHT);
        System.out.println(products);


    }

}
