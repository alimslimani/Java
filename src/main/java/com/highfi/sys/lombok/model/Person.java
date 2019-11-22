package com.highfi.sys.lombok.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"firstName", "lastName"})
@ToString(of = {"firstName", "lastName", "mail", "phone", "birthday"})
public class Person implements Serializable {
    @Getter
    @Setter
    String firstName, lastName, mail, address, phone;
    @Getter
    @Setter
    Date birthday;

}
