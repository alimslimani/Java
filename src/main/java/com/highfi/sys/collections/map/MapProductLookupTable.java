package com.highfi.sys.collections.map;

import com.highfi.sys.collections.Product;
import com.highfi.sys.collections.ProductMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable {


    private Map<Integer, ProductMap> productMap = new HashMap<>();

    @Override
    public void addProduct(ProductMap productToAdd) {
        int id = productToAdd.getId();
        if (productMap.containsKey(id)) {
            throw new IllegalArgumentException("Unable to add product, duplicate id for" + productToAdd);
        }
        productMap.put(id, productToAdd);
    }

    @Override
    public ProductMap lookupById(int id) {

        return productMap.get(id);
    }

    public void clear() {
        productMap.clear();
    }
}
