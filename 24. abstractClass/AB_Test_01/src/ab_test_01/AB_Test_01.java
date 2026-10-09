/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ab_test_01;
import Model.Bicycle;
import Model.Vision;
import Model.Bike;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class AB_Test_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        * Vì sao java không cho Biến Cha nhìn thấy các hàm obj của new con. 
        * Vì trình biên dịch không biết object thật là gì. Nó chỉ biết kiểu bạn khai báo. 
        * Java chọn cách này để bắt lỗi ngay lúc biên dịch, thay vì để chương trình chạy rồi mới sập.
        */
        System.out.println("Enter choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Bike b1;
            if (choice == 1) {
                b1 = new Vision();
            } else {
                b1 = new Bicycle();
            }
        
            //b1.horn();
//       Như trg hợp trên nếu IDE cho phêp hàm cha thấy đc hàm con là điều vô lí, bởi vì biến cha chưa biết New là New của thằng nào
//      Thay vì đánh sập ngay lúc event CHOICE của người dùng, thì bắt lỗi trc khi chạy.
//      Chung quy biến của cha chỉ đc phép thấy những cái gì có mang tính kế thừa.
    }
    public static void test_2(String[] args) {
        Bike b1 = new Vision (6601, 2020);
        Vision v1 = new Vision(6078, 2026);
        b1.getBikeName();
//        Cơ chế override ở đây là gì?
//      IDE lúc chưa chạy code, nó chỉ nhìn vào thằng class Bike có cái gì thì đem cái đó hiện lên
//  hiển nhiên không có class NangNoi hay name của vision.
//      Sau khi chạy trình biên dịch IDE mơi xem là obj thật là thằng nào, nếu là thằng vision, okay chạy hàm của thằng vision.
    }
    
    public static void test_1(String[] args) {
        Vision v1 = new Vision(6078, 2026);
        v1.getPlate(); 
//      Kế thừa là kể thừa lại toàn bộ hàm của cha.
//      System.out.println(v1.getPlate());
        Bike b1 = new Vision (6601, 2020);
        // Điểm khác biệc của 2 thằng trên là gì.
        b1.getPlate();
        v1.getPlate(); // Con kế thừa cha, tức là kế thừa toàn bộ những gì cha có.
        
        // Nhưng không đồng nghĩa với việc cha cũng kế thừa của con (nói vui: vì con làm del gì có cái gì cho cha đâu mà kế thừa)
        // b1. chỉ thấy toàn class của cha
        v1.NangNoi(90); // v1. thấy toàn bộ class cha và con // đây vừa là tính kế thừa vừa là tính đóng gói
        // không có chuyện cha kế thừa con
        // UI thui chết mẹ nếu không biết bike là xe gì thì sao biết cách chạy.
        // Polymophism và override ra đời.
        
        Bike b2=new Bike(6089, 2010) {
            @Override
            public boolean turnOnBike() {
                return true;
            }
        };
    }
    
   
}//class brackets 
