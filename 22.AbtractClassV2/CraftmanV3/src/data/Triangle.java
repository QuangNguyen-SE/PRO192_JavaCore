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
public class Triangle extends Shape{
    //di biet hoan toan voi shape
    protected double e1, e2, e3;

    public Triangle(String owner, String color, String borderColor, double e1, double e2, double e3) {
        super(owner, color, borderColor);
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public double getE1() {
        return e1;
    }

    public void setE1(double e1) {
        this.e1 = e1;
    }

    public double getE2() {
        return e2;
    }

    public void setE2(double e2) {
        this.e2 = e2;
    }

    public double getE3() {
        return e3;
    }

    public void setE3(double e3) {
        this.e3 = e3;
    }
    
    @Override
    public double getArea(){
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p-e1)*(p-e2)*(p-e3));
    }
    
    @Override
    public double getPerimeter(){
        return e1 + e2 + e3;
    }
    @Override
    public void paint(){
        System.out.printf("TRIANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f\n",
                          owner, color, borderColor, e1, e2, e3, getArea());
    }
}
