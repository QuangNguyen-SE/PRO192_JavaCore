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
public class Rectangle{
    protected String owner; // protected : Chỉ truyền DATA cho SUB-CLASS
    protected String color; // protected : 
    protected double width; // protected : giấu data chỉ dùng cho nội bộ
    private double length;  // private   :
    double acreage;         // default   :  ??? TÍNH ĐA HÌNH SẼ HỌC SAU   

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
    public void paint(){
        System.out.printf("RECTANGLE ||%-15s||%-10s||%4.1f||%4.1f||%7.2f\n", 
                            owner, color, width, length, getArea());
        
    }
    public void displayRectangle(){
        System.out.println("Run");
    }
}
