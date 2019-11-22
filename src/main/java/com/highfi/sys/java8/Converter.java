package com.highfi.sys.java8;

@FunctionalInterface
public interface Converter<F,T> {

    T convert(F from);
//    F conver(T to);

}
