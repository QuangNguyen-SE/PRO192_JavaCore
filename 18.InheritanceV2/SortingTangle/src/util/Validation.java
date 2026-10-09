/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;
import java.io.CharConversionException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String msg, String err) {
        int n;
        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println(err);
                System.out.println("Input again: ");
            }
        } while (true);
    }

    public static double getDouble(String msg, String err) {
        double n;
        do {
            try {
                System.out.print(msg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println(err);
                System.out.println("Input again: ");
            }
        } while (true);
    }

    public static String getString(String msg, String err) {
        String s = "string";
        do {
            try {
                System.out.print(msg);
                s = sc.nextLine();
                if (checkSpaceString(s)) {
                    return s;
                }
            } catch (Exception e) {
                System.out.println(err);
                System.out.print("Input again: ");
            }

        } while (true);
    }

    public static String getName(String msg, String err) {
        String name;
        do {
            try {
                System.out.print(msg);
                name = sc.nextLine();
                if (checkDigit(name) && checkSpaceString(name)) 
                    return name;
                System.out.println(err);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(err);
                System.out.print("Input again: ");
            }
        } while (true);
    }

    private static boolean checkSpaceString(String s) {
        //cách hoạt động của hàm isEmpty là nếu chuỗi.lenght == 0 thì sẽ trả về true;
        //tự làm hoặc sử dụng hàm có sẵn trong jvm
        if (s.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
    private static boolean checkDigit(String s){
        String regEx=".*\\d.*";
        if(s.matches(regEx))
            return false;
        else
            return true;
    }
    
     public static boolean isContinous(){
        do{             
            System.out.println("0-Back || 1- Continuos");
            int n = Validation.getInt("Enter here: ", "Out of order");
            if(n==1)
                return false;
            else if(n==0)
                return true;
        }while (true);
    }
}