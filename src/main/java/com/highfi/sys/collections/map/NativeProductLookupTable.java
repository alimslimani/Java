package com.highfi.sys.collections.map;

import com.highfi.sys.collections.Product;
import com.highfi.sys.collections.ProductMap;

import java.util.ArrayList;
import java.util.List;

public class NativeProductLookupTable implements ProductLookupTable {


    private List<ProductMap> products = new ArrayList<>();

    @Override
    public void addProduct(ProductMap productToAdd) {
        for (ProductMap p : products) {
            if (p.getId() == productToAdd.getId()) {
                throw new IllegalArgumentException("Unable to add product, duplicate id for" + productToAdd);
            }
        }
        products.add(productToAdd);
    }

    @Override
    public ProductMap lookupById(int id) {

        for (ProductMap p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void clear() {
        products.clear();
    }
}
