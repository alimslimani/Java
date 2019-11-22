package com.highfi.sys.collections.collection;

import com.highfi.sys.collections.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Window", 15);

        Collection<Product> products = new ArrayList<>();
//      Add product
        products.add(door);
        products.add(floorPanel);
        products.add(window);

//      create iterator
        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() > 20) {
                System.out.println(product);
            } else {
                productIterator.remove();
            }
        }
        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(window));
        System.out.println(products.contains(door));

////          Using foreach to iterate list of products
//        When use for each, we will have a concurrentModificationException due to iteration of
//        list of products and try to modify this list
//        Exception in thread "main" java.util.ConcurrentModificationException
//        for(Product p : products){
//            if (p.getWeight() > 20) {
//                System.out.println(p);
//            } else {
//                products.remove(p);
//            }
//        }
    }

}
