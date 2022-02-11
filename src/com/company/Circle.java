package com.company;

public class Circle {
    private static final double PI=Math.PI;

    public static void Area(double radius){
        System.out.println("Area =>"+(PI*(radius*radius)));
    }
    public static void Circumference(double radius){
        System.out.println("Circumference =>"+PI*radius*radius);
    }
}

