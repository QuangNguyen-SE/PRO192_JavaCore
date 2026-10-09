/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0.testing;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Testing {
    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Nhap");
        String s = sc.nextLine();
        String regex1= ".*\\d.*";
        
        if(s.matches(regex1))
            System.out.println("Contain number" + regex1);
        else 
            System.out.println("Nothing");
    }
    
}
