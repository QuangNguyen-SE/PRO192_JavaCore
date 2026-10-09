/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtangle;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Menu {
    public int getOption(Object[] option){
        for (int i = 0; i < option.length; i++) {
            System.out.println((i+1)+"-"+option[i]);
        }
        System.out.print("Your Choose: ");
        Scanner scan= new Scanner(System.in);
        return Integer.parseInt(scan.nextLine());
    }
    public void sortMenu(){
        
    }
}
