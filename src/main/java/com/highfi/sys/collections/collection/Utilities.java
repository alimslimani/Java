package com.highfi.sys.collections.collection;

import com.highfi.sys.collections.Product;
import com.highfi.sys.collections.ProductFixtures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilities {

    public static void main(String[] args) {
        Product door = ProductFixtures.door;
        Product floorPanel = ProductFixtures.floorPanel;
        Product windows = ProductFixtures.window;

        List<Product> products = new ArrayList<>();
        Collections.addAll(products, door, floorPanel, windows);
        System.out.println(products);
        Product min = Collections.min(products, Product.BY_NAME);
        System.out.println(min);
        Product max = Collections.max(products, Product.BY_WEIGHT);
        System.out.println(max);

    }
}
