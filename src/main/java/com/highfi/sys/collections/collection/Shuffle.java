package com.highfi.sys.collections.collection;

import com.highfi.sys.collections.ProductFixturesMap;
import com.highfi.sys.collections.ProductMap;

import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        List<ProductMap> products = new ArrayList<>();
        products.add(ProductFixturesMap.door);
        products.add(ProductFixturesMap.floorPanel);
        products.add(ProductFixturesMap.window);
        System.out.println(products);

        Collections.shuffle(products);
        System.out.println(products);
        Collections.shuffle(products);
        System.out.println(products);
        Collections.shuffle(products);
        System.out.println(products);
    }

}
