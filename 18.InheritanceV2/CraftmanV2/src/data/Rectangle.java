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
public class Rectangle {
    private String owner;
    private String color;
    private double width;
    private double length; 
    private double acreage; //đặc điểm đc tính từ các đặc tính khác
                            // khác, từ w*l -> đặc tính dẫn xuất - derived field
                            // đơn giá *sl = thành tiền.

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }
    
    public double getArea(){
        return width * length;
    }
    public void displayRectangle(){
        System.out.printf("RECTANGLE ||%-15s||%-10s||%4.1f||%4.1f||%7.2f\n", 
                            owner, color, width, length, getArea());
        
    }
}
