package com.highfi.sys.collections.map;

import com.highfi.sys.collections.ProductMap;

import java.util.*;

public class LookupTableComparison {
    public static final int ITERATIONS = 5;
    public static final int NUMBER_OF_PRODUCTS = 20_000;

    public static final List<ProductMap> products = generateProducts();

    private static List<ProductMap> generateProducts() {
        final List<ProductMap> products = new ArrayList<>();
        final Random weightGenerator = new Random();
        for (int i = 0; i < NUMBER_OF_PRODUCTS; i++) {
            products.add(new ProductMap(i, "Product" + i, 10 + weightGenerator.nextInt(10)));
        }
        Collections.shuffle(products);
        Collections.shuffle(products);
        Collections.shuffle(products);
        return products;
    }

    public static void main(String[] args) {

        runLookups(new MapProductLookupTable());
        runLookups(new NativeProductLookupTable());
//        Result after execution
        //        Running lookups with MapProductLookupTable
        //49 ms
        //19 ms
        //12 ms
        //14 ms
        //15 ms
        //Running lookups with NativeProductLookupTable
        //1905 ms
        //1273 ms
        //1157 ms
        //1296 ms
        //1417 ms
//        Execution of Map is so fast comparing to a List
    }

    private static void runLookups(ProductLookupTable lookupTable) {
        final List<ProductMap> products = LookupTableComparison.products;
        System.out.println("Running lookups with " + lookupTable.getClass().getSimpleName());

        for (int i = 0; i < ITERATIONS; i++) {
            final long startTime = System.currentTimeMillis();
            for (ProductMap product : products) {
                lookupTable.addProduct(product);
            }

            for (ProductMap product : products) {
                final ProductMap result = lookupTable.lookupById(product.getId());
                if (result != product) {
                    throw new IllegalStateException("Lookup Table returned wrong result for " + product);
                }
            }

            lookupTable.clear();
            System.out.println(System.currentTimeMillis() - startTime + " ms");
        }
    }
}
