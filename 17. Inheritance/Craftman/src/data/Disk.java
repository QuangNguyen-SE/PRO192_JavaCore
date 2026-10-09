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
public class Disk {
    private String owner;
    private String color;
    private double radius;

    public Disk(String owner, String color, double radius) {
        this.owner = owner;
        this.color = color;
        this.radius = radius;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Disk{" + "owner=" + owner + ", color=" + color + ", radius=" + radius + '}';
    }
    
    public double getArea(){
        return Math.PI * Math.pow(radius, 2) ;
    }
    
    public void paint(){
         System.out.printf("DISK ||%-15s||%-10s||%4.1f||\n", owner, color, radius);
    }
}
