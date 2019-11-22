package com.highfi.sys.collections.map;

import com.highfi.sys.collections.ProductFixturesMap;
import com.highfi.sys.collections.ProductMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewMaps_J8 {

    public static void main(String[] args) {
        final ProductMap defaultProduct = new ProductMap(-1, "Whatever the customer wants", 100);
        final Map<Integer, ProductMap> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixturesMap.door);
        idToProduct.put(2, ProductFixturesMap.floorPanel);
        idToProduct.put(3, ProductFixturesMap.window);

        ProductMap result = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result);


    }
}
