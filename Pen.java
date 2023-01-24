package com.learning.sruthi.ood;

import java.time.Month;

public class Pen {
    Color color;
    Color inkColor;
    int price;
    String type;
    String company;

    public static void main(String[] args) {
        Pen p = new Pen();
        p.color = Color.RED;
        p.inkColor = Color.BLUE;
        p.price = 1;
        p.type = "Ball";
        p.company = "Cello";
    }
}
