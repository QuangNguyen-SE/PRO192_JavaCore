/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace;

import data.*;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class AmazingRace {
     private static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        do{            
            System.out.print("Enter choice (1-Go || 0-Stop):  ");
            choice = Integer.parseInt(sc.nextLine());
            if(choice == 1)
                race(register());
        }while (choice != 0);
    }
    
    public static void race(Pet[] pet){
        for (Pet e : pet) {
            e.showRecord();
        }
        for (int i = 0; i < pet.length-1; i++) {
            for (int j = i+1; j < pet.length; j++) {
                if(pet[i].getSpeed() > pet[j].getSpeed())
                    swap(pet, i, j);
            }
        }
        System.out.println("---After sorting---");
        for (int i = 0; i < pet.length; i++) {
            pet[i].recordSpeed();
        }
    }
    
    private static void swap(Pet[] pet, int i, int j){
        Pet tmp = pet[i];
        pet[i] = pet[j];
        pet[j]=tmp;
    }
    
    public static Pet[] register(){
        Cat mew = new Cat("mew", 2024, 5.5, "><");
        Pet kitty = new Cat("Kitty", 1990, 10, ">.<");
        Dog ngaoDa = new Dog("NgoaDa", 2021, 50.0);
        Pet beTo = new Dog("Be-To", 2012, 5.0);
        Hamster ph = new Hamster("PhuongHang", 2005, 50);
        Pet luc = new Hamster("Luc", 2023, 2.0);
        
        Pet[] pet = new Pet[6];
        pet[0] = mew;
        pet[1] = kitty;
        pet[2] = ngaoDa;
        pet[3] = beTo;
        pet[4] = ph;
        pet[5] = luc;
        
        return pet;   
    }
    
    public static void showRegister(Pet[] pet){
        for (Pet e : pet) {
            e.showRecord();
        }
    }
}
