/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.security.acl.Owner;

/*
Để mà nói thì H.Vuông là HCN đặc biệt ko có gì sai
Tam giác đều là Tam giác cân
Nhưng cả 2 câu trên đều chỉ đc nói 1 chiều

Vậy
H.Vuông là KẾ THỪA các Đặc ĐIỂM/Tính chất của HCN
Nhưng HCN ko phải là hình vuông
.
Từ khái niệm đó suy ra thuật toán KẾ THỪA INHERITANCE in JAVA
Class CHA là HCN: Parent, Super, Base
Class CON là H.Vuông: child, sub, derived
Class con kế thừa Class cha
 */

/*
Khi chơi với kế thừa, phải tôn trọng phêu gốc của con
vuông trước khi kế thừa chữ nhật nó cũng là 1 class mà 1 class là 1 phễu

*/
public class Square extends Rectangle{
    //đẩy lại toàn bộ dữ liệu lên Rectangle;
    //Nhưng vì hình vuông chỉ cần 1 cạnh đổ vào
    private double edge;
  
    public Square(String owner, String color, double edge) {
        
        super            (owner, color, edge, edge); // đây là kế thừa vì dùng lại
    //super chính là --> new Rectangle(o, c, w, l);
    }
    
    //Class con có hàm trùng tên 100% với class cha, thì đó là Override
    // đặc tính ĐA HÌNH của JAVA // 
    // Nếu overload là hàm trùng tên trong 1 Class
    // thì Override là hàm trùng tên trong 2 hay nhiều class OBJ.
    @Override
    public void paint(){
        System.out.printf("SQUARE ||%-25s||%-15s||%-4.1f||%-4.2f||", 
                            owner, color, width, getArea());
        
        //System.out.printf("SQUARE ||%-25s||%-15s||%-4.1f||%-4.2f||", 
        //                    owner, color, length, getArea());
        //
        //  Câu lệnh trên là câu lệnh sai bởi length để private, 
        //  còn width là protected
    }  
    public void displaySquare(){
        System.out.println("Co hien thag con");
    }
}











