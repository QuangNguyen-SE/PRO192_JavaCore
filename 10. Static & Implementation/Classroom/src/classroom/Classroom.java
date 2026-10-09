/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;
import StudentProfile.Student;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Classroom {
    
    public static void main(String[] args) {
        Student hang = new Student("An Nguyen", 2005);
        Student quang= new Student ("Quang", 2004);
        Student an= hang; // lưu biến tạm
        hang.showInfo();
        //Liệu biến obj có thể trỏ tới thằng khác hay ko?
        hang = new Student ("Hang", 2005);
        hang.showInfo();
        an.showInfo();
        
        
        //Như vậy biến obj có thể trỏ tới 1 vùng new khác, vậy còn info trước đó sẽ đi về đâu?
        // lúc này máy chủ jvm sẽ quét và dọn vùng ram, nếu phát hiện 1 obj ko ai trỏ tới
        // nó sẽ clean dọn ngay tức thì
        // vậy chúng ta sẽ cho 1 biến tạm lưu địa chỉ của thằng obj cũ;
        new Student("Dm thang nay ngoai lai", 0000).showInfo(); 
        
        
    }
    
}
