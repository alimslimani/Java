package com.highfi.sys.collections;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Comparator;

import static java.util.Comparator.comparing;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id", "name", "weight"})
@ToString(of = {"id", "name", "weight"})
public class ProductMap {
    public static final Comparator<ProductMap> BY_WEIGHT = comparing(ProductMap::getWeight);
    public static final Comparator<ProductMap> BY_NAME = comparing(ProductMap::getName);

    @Getter
    @Setter
    int id;
    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    int weight;
}
