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
public abstract class Shape {
    protected String owner;
    protected String color;
   

    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
        
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

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + '}';
    }

    public abstract double getArea();
    public abstract void paint();
    
}
