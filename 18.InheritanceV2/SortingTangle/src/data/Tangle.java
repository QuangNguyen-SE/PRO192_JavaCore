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
public class Tangle {
    protected String name;
    protected double edge1;
    private double edge2;
    protected double edge3;

    public Tangle(String name, double edge1, double edge2, double edge3) {
        this.name = name;
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEdge1() {
        return edge1;
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }
    
    public double getArea() {
        return edge1+edge2+edge3;
    }
    
    @Override
    public String toString() {
        return "Tangle{" + "name=" + name + ", edge1=" + edge1 + ", edge2=" + edge2 + ", edge3=" + edge3 + '}';
    }
    
    public void paint(){
        System.out.printf("Normal Tangle ||%-25s||%-4.2f||", name, getArea());
    }
}
