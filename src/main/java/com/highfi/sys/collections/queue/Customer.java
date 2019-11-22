package com.highfi.sys.collections.queue;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name"})
@ToString(of = {"name"})
public class Customer {

    public static final Customer JACK = new Customer("Jack");
    public static final Customer JILL = new Customer("Jill");
    public static final Customer MARRY = new Customer("Marry");

    @Getter
    @Setter
    String name;

    public void reply(final String message) {
        System.out.printf("%s: %s\n", name, message);
    }
}
