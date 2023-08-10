package com.ivannikov.oop.lesson16;

public interface Figure {
    default boolean isAreaEquals(Figure figure) {
        return getArea() == figure.getArea();
    }
    double getArea();
}
