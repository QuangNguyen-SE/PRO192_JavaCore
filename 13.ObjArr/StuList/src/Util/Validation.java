/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String msg) {
        int n;
        do{
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            }catch(NumberFormatException e){
                System.out.print("Pls input positive number again here: ");
            }
        }while(true);
}

    public static double getDouble(String msg){
        double n;
        do{
            try{
                System.out.print(msg);
                n=Double.parseDouble(sc.nextLine());
                return n;
            }catch(NumberFormatException e){
                System.out.print("Input float number again here: ");
            }
        }while(true);
    }
    
    public static String getCharacter(String msg){
        String n;
        do {            
            try {
                System.out.print(msg);
                n=sc.nextLine();
                return n;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Input only character no Number again!!! ");
                System.out.print("Enter again, here: ");
            }
        } while (true);
    }
    
}
