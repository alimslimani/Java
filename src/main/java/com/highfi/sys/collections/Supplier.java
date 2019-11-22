package com.highfi.sys.collections;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name"})
@ToString(of = {"name"})
public class Supplier {

    @Getter
    @Setter
    String name;

    public List<Product> products() {
        return new ArrayList<>();
    }

}
