package com.highfi.sys.collections.map;

import com.highfi.sys.collections.Product;
import com.highfi.sys.collections.ProductMap;

public interface ProductLookupTable {

    void addProduct(ProductMap productToAdd);

    ProductMap lookupById(int id);

    void clear();
}
