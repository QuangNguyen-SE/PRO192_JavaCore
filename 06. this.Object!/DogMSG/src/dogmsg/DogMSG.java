/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogmsg;

import data.Dog;

/**
 *
 * @author LENOVO
 */
public class DogMSG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int a=100;
        //printf("a: %d\n", a); --> in ra 100
        //printf("a address: %u\n", &a) --> in ra dia chi vidu 6000...0
        // int *p = &a; --> p lưu tạo độ của a, p là BIẾN CON TRỎ
        //printf("p has value of %u\n", p) --> địa chỉ giống y thằng a
        // nếu thay %u thành %p thì p sẽ in địa chỉ con trỏ
        // printf("p value is: %d\n", *p) -->100
        
        // như vậy biến chiHua là biến con trỏ lưu tọa độ vùng ram của 1 obj Dog
        //nó ko lưu thông tin mà là tọa độ của Obj đó, và đc đặt tên phân biệt với các con trỏ khác
        // new trong Java tương đương với * bên C
        // Mỗi lần new là 1 vùng Ram mới 
        //Cái khuôn thì để trong vùng Ram Stack, còn thông tin hay info của 1 obj đc để trong vùng HEAP, NEW tương ứng với int *c = int *malloc();
        Dog chiHu =  new Dog("Chihuahua", 2024, 1.2);
     
        Dog ngaoDa = new Dog("Ngao Da", 2023, 50.0);
        
        //Show toàn bộ info của Obj thông qua toString()
        // 1 obj có vô số hành động
        System.out.println("toString() show all info: ");
        //System.out.println(chiHu.toString());
        //System.out.println(ngaoDa.toString());
        
        
        //Những điều hay ho khi chơi với toString()
    
        System.out.println(chiHu); //gọi thầm tên em
        //trên lí thuyết tên biến obj là biến con trỏ in ra địa chỉ
        //Nhưng Java sẽ gọi qua toString đó là override 
        //toString gọi qua 2 cách
        // 1 là gọi thông qua "."
        // 2 là gọi trực tiếp chỉ cần tên obj
        System.out.println(ngaoDa);
        
        // nếu hàm toString bị xóa, nó sẽ in ra địa chỉ biến obj
        // Hash number, nén toàn bộ data thành 1 con số.
         
    }
    
}
