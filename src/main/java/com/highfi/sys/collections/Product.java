package com.highfi.sys.collections;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Comparator;

import static java.util.Comparator.comparing;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name", "weight"})
@ToString(of = {"name", "weight"})
public class Product {
    public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);
    public static final Comparator<Product> BY_NAME = comparing(Product::getName);

    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    int weight;
}
