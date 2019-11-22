package com.highfi.sys.collections.map;

import com.highfi.sys.collections.Product;
import com.highfi.sys.collections.ProductFixtures;
import com.highfi.sys.collections.ProductFixturesMap;
import com.highfi.sys.collections.ProductMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewMaps {

    public static void main(String[] args) {
        final Map<Integer, ProductMap> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixturesMap.door);
        idToProduct.put(2, ProductFixturesMap.floorPanel);
        idToProduct.put(3, ProductFixturesMap.window);

        System.out.println(idToProduct);

        Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);
        ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProduct);

        Collection<ProductMap> products = idToProduct.values();
        System.out.println(products);
        products.remove(ProductFixturesMap.floorPanel);
        System.out.println(products);
        System.out.println(idToProduct);

        Set<Map.Entry<Integer, ProductMap>> entries = idToProduct.entrySet();

        for (Map.Entry<Integer, ProductMap> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue(ProductFixturesMap.floorPanel);
        }
        System.out.println(idToProduct);
    }
}
