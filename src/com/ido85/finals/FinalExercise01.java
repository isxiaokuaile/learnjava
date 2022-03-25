package com.ido85.finals;

public class FinalExercise01 {


    public static void main(String[] args) {

    }
}

class Circle{
    private  double radius;   //半径
    private final double pai = 3.14;

    public double area() {
        return radius * radius * pai;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}