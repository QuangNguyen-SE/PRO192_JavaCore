/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author LENOVO
 */
public class Disk extends Shape {
    
    public static final double Pi=3.1415;
    private String smile;
    private double radius;

    public Disk(String owner, String color, String borderColor, String smile, double radius) {
        super(owner, color, borderColor);
        this.smile = smile;
        this.radius = radius;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2* Disk.Pi * radius;
    }

    @Override
    public void paint() {
        System.out.printf("DISK |%-10s|%-10s|%-10s|%3s|%4.1f|%7.2d|\n",
                        owner, borderColor, color, smile, radius, getArea());
    }
    
    
}
