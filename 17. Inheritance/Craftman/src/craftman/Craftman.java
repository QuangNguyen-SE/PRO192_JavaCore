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
        
                
    }
    
    public void playWithRam(){
        Rectangle r1 = new Rectangle("tia", "pink", 1.0, 2.0);
            
        Square s1= new Square("Hinh vuong", "Ko", 3.0);
            s1.displayRectangle();
            s1.displaySquare();
            // Như vậy khai báo thằng con, nhưng thằng con vẫn sờ đc tài sản của cha
            // và sờ đc tài Sản riêng của mình
        Rectangle r2 = new Square("Hinh Cn dac biet", "Ko", 4.0);
            r2.displayRectangle();
            
            // còn thằng r2 ko chạm đc vào tài sản của chính MÌNH !!!
            // r2. ko sổ ra displaySquare(); và các hàm bên trong Square sẽ đc giấu đi
            
            
//Giải thích:   r2 là HÌNH CHỮ NHẬT đc xem như HÌNH VUÔNG mà thôi;
//              r1 là HÌNH VUÔNG chính góc 
//Khác nhau trong cách khai báo biến OBJ sẽ dẫn đến khác nhau trong cách hành xử của obj
// Bởi vì datatype: Square là bao trọn cả Rectangle và chính nó
// trong khi Rectangle chỉ trỏ bên trong Rectangle mà thôi !!!! 
// Vùng ram của Square bự hơn nuốt trọn vùng ram của RECTANGLE


// Tuy vậy có trg hợp đặc biệt ngoại lệ đc gọi là OVERRIDE !!!!
            r2.paint();
/*
    Tuy là trỏ tới paint của class cha, NHƯNG t/c của override là bẻ hướng sang bên Square
    paint đó là hàm của Class CHA class RECTANGLE ko phải của square
    Nhưng lúc chạy nó lại xổ ra info bên Square bơi vì t/c override !!!!
*/

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
