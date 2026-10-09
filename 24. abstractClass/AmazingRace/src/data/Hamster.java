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
public class Hamster extends Pet{
    
    public static final double MAX_SPEED = 30;
    public double speed;

    public Hamster(String name, int yob, double weight) {
        super(name, yob, weight);
    }
    
     @Override
    public double run() {
       Random random = new Random();
       speed = random.nextDouble() * MAX_SPEED;
       return speed;
       //return new Random().nextDouble() * MAX_SPEED;
    }
    
    @Override
    public void recordSpeed(){
        System.out.printf("%-10s|%-10s|%4.1f\n", "Hamster", name, speed);
    }
    
    @Override
    public double getSpeed(){
        return speed;
    }
    
    @Override
    public void showRecord() {
        System.out.printf("%-10s|%-10s|%4d|%4.1f|%4.1f|\n", 
                           "Hamster" ,name, yob, weight, run());
    }
    
}
