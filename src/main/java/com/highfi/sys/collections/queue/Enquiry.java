package com.highfi.sys.collections.queue;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"customer", "category"})
@ToString(of = {"customer", "category"})
public class Enquiry {
    @Getter
    @Setter
    Customer customer;
    @Getter
    @Setter
    Category category;

}
