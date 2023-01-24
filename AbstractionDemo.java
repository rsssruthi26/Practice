package com.learning.sruthi.ood;

public class AbstractionDemo {
    public static void main(String args[])
    {
        GraphicIbject circle = new Circle();
        circle.draw();
        circle.resize();

        GraphicIbject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
    }
}
