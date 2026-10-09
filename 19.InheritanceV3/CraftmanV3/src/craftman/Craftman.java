/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craftman;

import data.Disk;
import data.Rectangle;
import data.Square;

/**
 *
 * @author LENOVO
 */
public class Craftman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithSquare();
                
    }
    
    public static void sortShapes(){
        Rectangle r1 = new Rectangle("tia", "pink", 1.0, 2.0);
        Rectangle[] rectArr = new Rectangle [9];
        rectArr[0]=r1;
        rectArr[1]= new Rectangle("Ma", "pink", 3.0, 4.0);
        rectArr[2]= new Rectangle("A.hai", "blue", 3.0, 3.0);
        System.out.println("The list of rectangle");
        
        //Điều kì diệu đã xảy ra
        rectArr[3] = new Square ("G.A.Hai", "blue", 5.0);
        //2 class khác nhau khai báo chung 1 mảng vẫn rất okay.
        
        }
    
    public static void playWithSquare(){
        Square s1= new Square("cha", "Yellow", 5.0);
        s1.paint();
    }
    
    public static void cutShape(){
        Rectangle r1 = new Rectangle("tia", "pink", 1.0, 2.0);
        r1.paint();
        Square s1 = new Square("Ma", "pink", 3.0);
        
        Disk d1 = new Disk("Be Na", "pink", 2.0);
        d1.paint(); 
    }
    
}
