package com.highfi.sys.collections.collection;

import com.highfi.sys.collections.ProductFixturesMap;
import com.highfi.sys.collections.ProductMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rotate {
    public static void main(String[] args) {
        List<ProductMap> products = new ArrayList<>();
        products.add(ProductFixturesMap.door);
        products.add(ProductFixturesMap.floorPanel);
        products.add(ProductFixturesMap.window);
        System.out.println(products);

        Collections.rotate(products,1);
        System.out.println(products);
        Collections.rotate(products,1);
        System.out.println(products);
        Collections.rotate(products,1);
        System.out.println(products);
    }

}
