package com.company;
import java.math.*;

public class Circle extends Shape
{
    protected double radius;

    public Circle(double radius, String color, boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public Circle(double radius)
    {
        this.filled=false;
        this.color="blue";
        this.radius=radius;
    }
    public Circle()
    {
        this.filled=false;
        this.color="blue";
        this.radius=1;
    }
    public  double getRadius()
    {
        return radius;
    }
    public  void  setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return Math.PI *radius*radius;
    }
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    public String toString()
    {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}