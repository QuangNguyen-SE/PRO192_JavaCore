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
public class CaioFX580 extends CasioFX500 implements Caculator {

    public CaioFX580() {
        
    }
        
    public CaioFX580(String model) {
        super(model);
    }

    @Override
    public double add(double a, double b) {
        return super.add(a, b); 
    }

    @Override
    public double fraction(double a, double b) {
        return super.fraction(a, b); 
    }

    @Override
    public double minor(double a, double b) {
        return super.minor(a, b); 
    }

    @Override
    public double multify(double a, double b) {
        return super.multify(a, b); 
    }

    @Override
    public void showInfo() {
        System.out.println("ThisFX-580"); 
    }
    
    
    
}
