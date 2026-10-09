/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputchecker;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class InputChecker {

    /*
    Lệnh bị lạc chôi: khi nhập số trước chuỗi
    Lí do, nextInt() ko lấy dấu ENTER trong Buffer nên gây ra tình trạng trôi lệnh
    mà Enter lại là câu lệnh kết thúc nhập chuỗi nextLine();
    nhưng ENTER vẫn còn nằm trong buffer nên hiện tượng đã xảy ra
     */
    public static void main(String[] args) {
        inputNameV3();
    }

    public static void inputName() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Yob: ");
        yob = sc.nextInt();
        sc.nextLine(); // như fflush(stdin) bên C;
        System.out.print("address: ");
        address = sc.nextLine();

        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }

    public static void inputNameV2() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Yob: ");
        yob = Integer.parseInt(sc.nextLine());
        //sc.nextLine() là hàm trả về chuỗi nên dùng nó như 1 biến bth
        // mà ko cần phải gắn vô biến tạm để chuyền vào hàm khác.
        //Mà có thể truyền trực tiếp vô hàm
        System.out.print("address: ");
        address = sc.nextLine();

        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }

    public static void inputNameV3() {
        String name, address;
        int yob = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Yob: ");
        
        do{
        try {
            //đây là nơi chứa lệnh cà chớn
            yob = Integer.parseInt(sc.nextLine());
            break;
        } catch (Exception e) {
            //Cà chớn xảy ra, CPU sẽ chạy đến chỗ này
            //JVM ko giết app như truyền thống
            // chỗ này là chỗ xử lí hậu quả cà chớn
            //ko có cà chớn thì việc gì phải vào
            // e chính là lá thư màu đỏ định mệnh của JVM
            // Exception e = new Exception (NỘi DUNG LỖI / Lá thứ của JVM)
            // e là 1 obj, cái gì trong java cũng là obj
            // về lí e.xem lỗi, tự xử lí
            System.out.println("ONLY NUMBER-!!!");
        }
        }while(true);
        
        System.out.print("address: ");
        address = sc.nextLine();

        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
}
