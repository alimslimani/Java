package com.highfi.sys.collections.set;

import com.highfi.sys.collections.Product;
import com.highfi.sys.collections.Supplier;

import java.util.*;

import static com.highfi.sys.collections.Product.BY_NAME;
import static com.highfi.sys.collections.Product.BY_WEIGHT;

public class ProductCatalogue implements Iterable<Product> {


    private final Set<Product> products = new TreeSet<>(BY_NAME);
    private final SortedSet<Product> productSortedSet = new TreeSet<>(BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.products());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public Set<Product> lightVanProducts() {
        Product heaviestLightVanProduct = findHeaviestVanLightProducts();
        return productSortedSet.headSet(heaviestLightVanProduct);
    }

    public Set<Product> heavyVanProducts() {
        Product heaviestLightVanProduct = findHeaviestVanLightProducts();
        return productSortedSet.tailSet(heaviestLightVanProduct);
    }

    public Product findHeaviestVanLightProducts() {
        for (Product product : productSortedSet) {
            if (product.getWeight() > 20) {
                return product;
            }
        }
        return productSortedSet.last();
    }
}
