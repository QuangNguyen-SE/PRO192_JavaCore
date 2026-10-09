/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmsg;

import data.StudentProfile;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class StudentMSG {
    Scanner sc = new Scanner(System.in);
    //Trong java cgi cung la OBJ
    private static int a; // Biến toàn cục đc sử dụng Access Modifier
    public static void main(String[] args) {
        
        saveASStudent();
    }
    public static void inputAsStudent(){
        Scanner sc = new Scanner(System.in); 
        String id, name; // Cấm dùng access Modifier trong hàm vì nó vô nghĩa!!!
        int yob;
        double gpa;
        System.out.println("Input Id:");
            id=sc.nextLine();
        System.out.println("Input name:");
            name=sc.nextLine();
        System.out.println("Yob:");
            yob=sc.nextInt();
        System.out.println("GPA:");
            gpa=sc.nextDouble();
        StudentProfile student = new StudentProfile(id, name, yob, gpa);
    }
    //hard-code: code cung ko uyen chuyen 
    public static void saveASStudent(){
        StudentProfile an = new StudentProfile("SE183894", "Chu Van An", 2002, 2.8);
        StudentProfile binh= new StudentProfile("SE190001", "Le Bao Binh", 2004, 0.4);
        
        
        //an.yob; đây là câu lệnh lỗi 
        an.getYob();
        an.showProfile();
        binh.showProfile();
        
        //sự khác nhau của 2 câu lệnh này giống như:
        /*
        int a=100;
        a; đây là câu lệnh lỗi
        a++;
        
        Bởi vì nguyên tắc lập trình là data ko được đứng 1 mình
        Phải thao tác data bằng các câu lệnh riêng;
        
        an.yob: là 1 data, ko phải 1 câu lệnh
        nhưng a.getYob; là 1 câu lệnh gọi 1 Hàm có giá trị trả về
        */
        an.setName("ko co ten");
        binh.showProfile();
        //Hàm static ăn theo thằng cuối cùng
        
           StudentProfile.sayHi();//Muốn sờ vào hàm có static thì ta nên gọi Class.Static-func
        // an.sayHi();           //Chứ ko nên gọi theo cách bình thường là OBJ.Static func
    }
}
