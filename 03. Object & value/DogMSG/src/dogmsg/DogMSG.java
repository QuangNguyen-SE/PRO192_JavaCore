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
        //Lấy khuôn ra để bắt đầu đổ info
        Dog chiHu =       new Dog("Chihuahua", 2024, 1.2);
     //Lấy cái Khuôn Dog  //Đúc là new, Dog là cái Phễu
     //  value            //        obj
     // chiHu là 1 biến phức tạp được gắn value của 1 obj trong Dog
        //giống Scanner(1 dạng obj)
        
        chiHu.bark(); //mỗi hành động của obj đc gọi thông qua tên biến và "."
        Dog ngaoDa = new Dog("Ngao Da", 2023, 50.0);
        ngaoDa.bark();
    //tại 1 thời điểm 1 biến chỉ đc lưu 1 value
    //Nhưng tại sao yob/name.. lại lưu đc 2 value của ngaoDa va chiHu
    // Lí do là từ "new"
    //có new là có vùng ram mới, mà có vùng ram mới là có địa chỉ lưu các giá trị
    // cho nên khi new nghĩa là java sẽ tự tạo ra 1 vùng ram mới của 1 obj, yob, name sẽ đc làm mới hoàn toàn
    // và địa chỉ vùng Ram đó sẽ đc lưu trong biến chiHu, ngaoDa
    //mỗi lần gọi chiHu, ngaoDa là sờ vào vùng ram chứa các thông tin đó
    
    //bark(); hành động phải gắn với obj, ko gắn bik thằng nào sủa
    // Obj hành động bắt buộc gắn với obj thông qua . con trỏ
    }
    
}
