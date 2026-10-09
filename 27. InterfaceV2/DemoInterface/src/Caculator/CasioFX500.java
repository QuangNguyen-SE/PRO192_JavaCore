/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caculator;
import CaculatorUtils.Caculator;
/**
 *
 * @author LENOVO
 */
public class CasioFX500 implements Caculator{
    private String model;
    
    public CasioFX500() {
        
    }

    public CasioFX500(String model) {
        this.model = model;
    }
    
    
    @Override
    public double add(double a, double b) {
        System.out.println("FX-500: a+b");
        return a+b;
    }

    @Override
    public double minor(double a, double b) {
        System.out.println("FX-500: a-b");
        return a-b;
    }

    @Override
    public double multify(double a, double b) {
        System.out.println("FX-500: a.b");
        return a*b;
    }

    @Override
    public double fraction(double a, double b) {
        System.out.println("FX-500: a/b");
        return a/b;
    }

    @Override
    public void showInfo() {
        System.out.println("THIS IS CASIO FX-500");
        
    }
    
}
