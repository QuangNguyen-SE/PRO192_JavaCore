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
public class Cat extends Pet{
     public static final double MAX_SPEED = 40;

    public Cat(String name, int yob, double weigth) {
        super(name, yob, weigth);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("%-10s|%-15s|%4d|%4.1f|%4.1f|\n",
                            "Dog", name, weigth,run());
    }
    

}
