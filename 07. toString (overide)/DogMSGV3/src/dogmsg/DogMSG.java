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
        
        //hàm SET là dùng để thay đổi dữ liệu
        //khi chơi với 1 obj ta gọi tên biến obj trc rồi mới chơi với hàm
        // khi ta chấm nghĩa là ta lấy đồ trong package ra xài
       
        chiHu.setWeight(2.0);
        chiHu.bark();
        
        // Hàm GET thường dùng để trích suất 1 data đc lưu trong biến obj
        // mà Hàm Get phải có return gtri.
        //Hàm có return nghĩa là nó cũng đc xem như 1 biến và print như 1 biến bth
        System.out.println("ChiHua"+ chiHu.getYob());
        
    }
    
}
