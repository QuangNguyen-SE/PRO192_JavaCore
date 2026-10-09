/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMain;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author LENOVO
 */
public class ExampleAccount {
    static double money=500;
    
    public static void rutTien(double value) throws Exception{
        if(value<0)
            throw new Exception("So tien rut ko dc la so am");
        if(value > money)
            throw new MyException("So tien du ko du");
    }
    
    
    public static void displayMoney(){
        Locale lc = new Locale("VN");
        NumberFormat fm1= NumberFormat.getCurrencyInstance(lc);
        System.out.println("So du tai khoan la "+fm1.format(money));
    }
    
}
