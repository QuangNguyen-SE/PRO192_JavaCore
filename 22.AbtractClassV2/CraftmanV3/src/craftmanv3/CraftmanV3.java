/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craftmanv3;
import data.Shape;
import data.Disk;
import data.Rectangle;
import data.Square;
import data.Triangle;
/**
 *
 * @author LENOVO
 */
public class CraftmanV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void playWithShape() {
        Rectangle r1 = new Rectangle("Tia","Pink","Manegeta", 5, 6);
        Shape r2 = new Rectangle("Tia","Pink","Manegeta", 6, 5);
        
        Disk d1 = new Disk("Ma", "Pink", "Pink", "<3", 6);
        Shape d2 = new Disk("Ma", "Pink", "Pink", "<3", 6);
        
        //Hàm paint() là của ai?
        r1.paint(); //Con, RECTANGLE
        r2.paint(); //CHA NHƯNG KHI CHẠY LÀ CON
        d1.paint(); // CON, DISK
        d2.paint(); // CHA, SHAPE.
        //Paint() -> POLYMORPHISM, đa xạ đa hình
        
        
    }
    
    public static void sortShapes(){
        Rectangle r1 = new Rectangle("R1","Pink","Manegeta", 5, 6);
        Shape sr2 = new Rectangle("R2","Pink","Manegeta", 6, 5);
        
        Square sq1 = new Square("MA", "Green", "RED", 7);
        //Square sq2= new Rectangle("sd", color, borderColor, 0, 0); ko co chuyen khai con new cha (Bat hieu)
        Rectangle rsq2 = new Square("MA", "Green", "RED", 8);
        Shape s3 = new Square("MA", "Green", "RED", 9); 
        
        Disk d1 = new Disk("D1", "Pink", "Pink", "<3", 6);
        Shape sd2 = new Disk("D2", "Pink", "Pink", "<3", 6);
        
        Triangle t1 = new Triangle("T1", "Red", "red", 2, 3, 4);
        Shape st2 = new Triangle("t2", "Red", "red", 3, 4, 5);
        
        r1.paint();   
        sr2. paint();
        sq1.paint();
        rsq2.paint();
        s3.paint();
        d1.paint();
        sd2.paint();
        t1.paint();
        st2.paint();
        
        /*
        Hàm Paint() được gọi là TÍNH ĐA HÌNH của Java
        từ 1 hàm mà có nhiều cách thức viết code khác nhau:
        nó có thể là HV, HCN, TRÒN, TAM GIÁC.....
        KĨ Thuật này ánh xạ, đa hình thái, đa hình polymorphism
        */
        
        //Shape box[] = new Shape[9]; //9 biến shape
        Shape[] box = new Shape[] {r1, sr2, sq1, rsq2, s3, d1, sd2, t1, st2};
        for (Shape x : box) {
            x.paint();
        }
        
    }
}
