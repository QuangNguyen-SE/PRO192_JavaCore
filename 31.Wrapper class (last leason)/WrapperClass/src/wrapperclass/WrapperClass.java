/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

/**
 *
 * @author LENOVO
 */
public class WrapperClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithInteger();
        //playWithPool();
        playWithString();
    }

    public static void playWithInteger() {
        int num0 = 2003; //ton 1 vung ram 4 byte dat ten la num0
        //co 3 cach choi voi integer
        Integer num1 = new Integer(2003);
        Integer num2 = new Integer("2003");
        Integer num3 = 2003; //cach viet ten, gon, tu nhien nhat, new ngầm
        // gói lại thành 1 vùng new mà nhân chính là primitive
        // cách này đc gọi là đóng gói primitive - boxing a primitive value
        // wrapper class
        //Boxing: biến primitive thành OBJ

        System.out.println("num0" + num0);    //Xài trực tiếp vùng ram
        System.out.println("num1" + num1);    //Con trỏ Obj, (toString)
        System.out.println("num2" + num2);    //      .....
        System.out.println("num3" + num3);    //      .....

        int num4 = num1; //Hiện tượng mở hộp, ko phải ép kiểu 
        //Unboxing từ Obj -> Primitive
        //Mở vùng new lấy value/ nhân/ lõi 
        System.out.println("num4" + num4);
        Integer num5 = num0; // boxing, đóng gói new ngầm(2003)
        System.out.println("num5" + num5);
        num0 = 2004;
        System.out.println("num5 after num0 =2004 " + num5);
        //Nhưng nếu chúng ta cho num5=2004 thì điều gì sẽ xảy ra
        num5 = 2004;
        //liệu 2003 có biến mất hay ko?

        //2003 sẽ ko biến mất bởi vì thật chất khi ta cho num5 = 2004, nghĩa là 
        // new Integer(2004) new ngầm, nó sẽ đc lưu ở 1 vùng ram khác
        // cứ mỗi lần gán = 1 gtri mới thì sẽ là 1 new mới
        // Vùng integer ko có hàm set() chỉ có hàm get()
        // mún thay đổi gói cái bánh khác
        // vì vậy ko cho sửa, READ-ONLY: Immutable
        //xài value mãi mãi, ko sửa, ko set
    }

    public static void playWithIntegerPointer() {
        Integer num1 = new Integer("2004");
        Integer num2 = new Integer(2004);
        Integer num3 = 2004;
        Integer num4 = 2005;
        // ko so sánh 2 biến obj, bởi vì nó lưu địa chỉ, mà địa chỉ làm gì so sánh đc
        // mún so sánh 2 biến obj, ta ko dùng kiểu so sánh của biến primitive đc
        // muốn so sánh hãy vào vùng lõi, lấy gtri ra mới so sánh được
        // Muốn so sánh 2 obj/con trỏ ta phải "." để lấy value so sánh
        boolean result = num1 == num2;
        System.out.println("num1 : num2" + result);
        //muốn so sánh đc num1 và num2
        // ta phải gọi hàm
        // có 2 hàm làm đc việc này trong Integer
        // hàm boolean Equal(): có bằng hay ko, trả về true/false
        // hàm int Compareto(): so với thằng kia, trả về kiểu int.
        result = num1.equals(num2);
        System.out.println("num1 equal() num2" + result);
        System.out.println("num1 compare to num2" + num1.compareTo(num2));
        //Compare nếu trả về || -1:< || 0:= || 1:> ||
        System.out.println("num3 compare to num4" + num3.compareTo(num4));
        System.out.println("num4 compare to num3" + num4.compareTo(num3));
    }

    public static void playWithPool() {
        //Điều vi diệu sẽ xảy ra:
        Integer num1 = 100;
        Integer num2 = 100;
        //Vì sao mệnh đề này đúng, cả 2 thằng rõ ràng mang địa chỉ cơ mà?
        System.out.println("num1 : num2 " + (num1 == num2));
        // Kĩ thuật boxing của Integer cho phép so sánh trực tiếp các số
        // trong phạm vi -128 -> 127
        Integer num3 = -129;
        Integer num4 = -129;
        System.out.println("num3 : num4 " + (num3 == num4));
        //Riêng các số từ -128 -> 127 trong Boxing thì chỉ cần xài 1 vùng new chung
        // Kĩ thuật này gọi là Pool: bể bơi chứa các thằng xài vùng new chung
        // từ(-128->127);
        //Integer sẽ ko cần tạo vùng new mới, nên các biến Num1, Num2 đc xem là primitive
        // Nhưng nó ko phải primitive, nó chỉ đơn giản là đc phép gán thẳng giá trị vào biến như primitive
        //NHƯNG riêng khi ta tạo 1 vùng new mới, tức là số đó ko còn tắm chung
        Integer num5 = new Integer(100); //100 ko tắm chung hồ bơi
        //Có new là ko đc tắm chung, not in a Pool
        System.out.println("num1 vs num5 (100) " + (num1 == num5));//false

    }

    public static void playWithString() {
        //2 đứa này nhìn thì tắm chung nhưng thật ra là 2 bể bơi khác nhau
        //vì nó xài new, CÓ NEW LÀ CÓ VÙNG NHỚ MỚI
        String s1= new String("HELLO");
        String s2= new String("HELLO");
        
        //Đây là 2 biến tắm chung 1 vùng tắm tên HELLO
        // Khởi tạo 2 biến nma chỉ xài 1 cái new
        String s3="HELLO";//new ngầm
        String s4="HELLO";
        // In ra địa chỉ trỏ là biết thôi ấy mà
        
        
        String s5="Hello";
        
        //Hỏi s1 có bằng s2 ko?
            if(s1==s2)
                System.out.println("s1==s2");
            else 
                System.out.println("s1 != s2");
        //Hỏi s3 có bằng s4 ko?
            System.out.println("s3 = s4: "+(s3==s4)); 
            //Pool, trỏ cùng vùng new
        //Hỏi s4 có bằng s5 ko?
            System.out.println("s4 = s5: "+(s4==s5));
            System.out.println("s1 = s3: "+(s1==s3));
            
            //Pool phân biệt hoa thường
            //Vấn đề nếu có biến nào new trước pool, biến sau hưởng ké nếu mún xài data đó
            //Gán đi, nhưng ko đc new, xài chung, trỏ cùng vùng new heap
            //
    }
}
