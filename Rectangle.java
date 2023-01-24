package com.learning.sruthi.ood;

public class Rectangle extends GraphicIbject {

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    void resize() {
        System.out.println("Resizing a rectangle");
    }
}
