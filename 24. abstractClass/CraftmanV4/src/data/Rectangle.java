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
public class Rectangle extends Shape{
    
    private double w, l;

    public Rectangle(String owner, String color, double w, double l) {
        super(owner, color);
        this.w = w;
        this.l = l;
    }

    @Override
    public double getArea() {
        return w*l;
    }

    @Override
    public void paint() {
        System.out.printf("%-10s|%-10s|%-10s|%4.1f",
                        "RECTANGLE", owner, color, getArea());
    }
    
    
}
