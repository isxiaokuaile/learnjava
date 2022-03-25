package com.test.lingqiantong.ChapterExercises.test09;

public class Point {
    private double X;
    private double Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
}
class LabeledPoint extends Point{
    private String biaoqian;

    public LabeledPoint(double x, double y, String biaoqian) {
        super(x, y);
        this.biaoqian = biaoqian;
    }
}