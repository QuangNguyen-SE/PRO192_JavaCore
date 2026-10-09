/*
Util-utility: tiện ích
 */
package fu.util;

import java.util.Scanner;
/*
Đây là Class chứa đặc điểm/ hành động/ chứa các món đồ chơi dùng chung
cho mọi nơi - vì nó ko tư hửu
Library: chứa các hàm/ biến dùng chung cho nhiều công việc khác nhau
 */
public class MyToys {
//Hành vi là static, mang tính re-use cao
// Static thường dùng cho các hàm dùng chung và mang tính re-use
// vidu như là math.sqrt(); bởi vì dùng static JVM nó chỉ dùng trên vùng nhớ đó
//mà ko phải tạo thêm những vùng nhớ khác, ko new, new là ko chơi static!!

    public static final double PI = 3.1415;
// final-biến ko cho thay đổi value trừ lần đầu tiên khai báo
// như biến constant bên C, HẰNG SỐ
    
    private static Scanner sc=new Scanner(System.in); // Nên để scanner làm global variable
    
    public static int getAnInteger(String msg) {
        int n;
//        Scanner sc= new Scanner(System.in);
        do {
            try {
                System.out.println(msg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Error!!!!");
            }
 
        } while (true);
    }
    public int getC(){
        int n;
        n= sc.nextInt();
        return n;
    }
}
