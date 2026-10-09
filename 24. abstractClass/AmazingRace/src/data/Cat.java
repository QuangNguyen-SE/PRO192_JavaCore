/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class Cat extends Pet {
    public static final double MAX_SPEED = 50;
    public double speed;
    
    private String ribbon;

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);
        this.ribbon = ribbon;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        Random random = new Random();
        speed = random.nextDouble() * MAX_SPEED;
                       //Trả cho mình con số từ (0...1)
        return speed;               
    }
    
    @Override
    public void recordSpeed(){
        System.out.printf("%-10s|%-10s|%4.1f\n", "Cat",name, speed);
    }
    
    @Override
    public double getSpeed(){
        return speed;
    }
    
    @Override
    public void showRecord() {
        System.out.printf("%-10s|%-10s|%4d|%4.1f|%4.1f|\n", 
                           "CAT" ,name, yob, weight, speed);
    }
    
    
}
