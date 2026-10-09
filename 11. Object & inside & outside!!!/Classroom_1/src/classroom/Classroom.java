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
        Student ahi=checkObjV5(); // ahihi lưu tọa độ của x;
        ahi.showInfo();
    }
    
    public static void checkObj() {
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
    
    public static void checkObjV2(){
    //Có new là có vùng nhớ mới, có 1 obj mới, cho dù obj đó có bị trùng info
    Student s1 = new Student("A", 1999); // 2 obj khác nhau
    Student s2=s1;
    s1= new Student("A", 1999); // chỉ giống về mặc thông tin
    //nếu giống nhau setName phải giống nhau;
    s1.setName("B");
    s1.showInfo();
    s2.showInfo();
    }
    
    public static void checkObjV3(){
         //Có new là có vùng nhớ mới, có 1 obj mới, cho dù obj đó có bị trùng info
    Student s1 = new Student("A", 1999); // 2 obj khác nhau
    Student s2=s1;
    s1= new Student("A", 1999); 
    s1.setName("B");
    s1.showInfo();
    s2.showInfo();
    
    // còn những cái obj ko đc trỏ tới thì hãy JVM dọn bằng cách
    System.gc(); //grabage collection;
    // tương đương với với hàm free() bên c, malloc();
    }
    
    public static void checkObjV4(){
        new Student("A", 2004).showInfo();
        //Ở đây new mà chấm đc tức là new cũng là 1 thằng giữ tọa độ
        // nhưng new xong obj sẽ chết bởi vì ko thằng nào lưu tọa độ đó
        // vậy thì ta cần 1 biến con trỏ, để lưu tọa độ đó biến con trỏ obj
        // có tọa độ là có thể chấm, có thể sờ đc vào obj đó thao túng nó
        Student x;
        x= new Student("demo", 2000);
        x.showInfo();
    }
    
    //Đây là HÀM ĐẶC BIỆT trong JAVA, loại hàm thứ 5: HÀM OBJ return OBJ;
    //HÀM trả về tọa độ của 1 obj, mà trả đc tọa độ là có thể "." là sờ đc tọa độ của obj
    public static Student checkObjV5(){
        /*
        Hàm có return chính là hàm trả về TỌA ĐỘ GIÁ TRỊ chứ ko trả về giá trị đó
        Những biến local khai báo trong hàm sau khi gọi hàm xong kết thúc việc xử lí
        Những biến đó sẽ bị khai tử, clear
        */
         Student x; // biến sẽ clear vì nó ở trong Stack
        x= new Student("demo", 2000); // nhưng obj nằm trong HEAP ko bị clear
        return x; //x đag lưu tọa độ của obj, và thảy tọa độ đó cho tên hàm! 
    }
}
