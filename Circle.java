package com.learning.sruthi.ood;

public class Circle extends GraphicIbject {

    void draw()
    {
        System.out.println("Drwaing a circle");

    }

    @Override
    void resize() {
        System.out.println("Rezing a circle");
    }
}
