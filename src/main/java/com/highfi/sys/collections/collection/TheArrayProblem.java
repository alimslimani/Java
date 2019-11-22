package com.highfi.sys.collections.collection;

import com.highfi.sys.collections.Product;

import java.util.Arrays;

public class TheArrayProblem {

    /*
    * Problem of array is their length, when you create an array, you must modify his length if you want
    * add some elements
    * Or in Collections, we don't have this constraint
    * */

    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
//      create array of product
        Product[] products = {door, floorPanel};
//      print array
        System.out.println(Arrays.toString(products));
//      Add product
        Product window = new Product("Window", 15);
        products = add(window, products);
        System.out.println(Arrays.toString(products));
    }

    private static Product[] add(Product product, Product[] products) {
        int length = products.length;
        Product[] newArray = Arrays.copyOf(products, length + 1);
        newArray[length] = product;
        return newArray;
    }
}
