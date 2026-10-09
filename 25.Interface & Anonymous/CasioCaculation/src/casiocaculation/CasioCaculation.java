/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casiocaculation;

import com.sun.corba.se.spi.orb.Operation;

/**
*   Hôm nay sẽ học về khái niệm callback function và ứng dụng của interface, kế thừa, đa hình.
* 
* 
 */

//Nhắc nhở thân thiện: 
// trong 1 file.java không được có 2 public class, chỉ có 1 public class và nhiều class nhưng ko được setting public cho nó
// PUBLIC class đó phải trùng tên với file.java
public class CasioCaculation {
    // Trong đây mới được phép khai báo nhiều class.ư
    
    //CLASS INTERFACE
    interface operation{ 
        
        String mess = "DANG TINH TOAN"; // Biến ở đây luôn được mặc định sẵn là PUBLIC STATIC FINAL
        //Interface muốn gắn gtri thì 1 là static final 2 là không ghi bất cứ cái gì
//        String mess2; báo lỗi vì ko được phép để không
        
        // Ngoài ra hàm mà có thân thì phải luôn ở chế độ phải có gì bên trong, và luôn mặc định là DEFAULT STATIC
        // Nếu xác định method là của riêng từng thằng thì không được phép khai báo gì bên trong -> ABSTRACT
        // Nếu xác định method phải có thân thì bắt buộc nó phải là của CHUNG -> STATIC
        static void mess2(){
            System.out.println("Hello");
        }
        // CÓ ABSTRACT thì KHÔNG STATIC và ngược lại
        
//        Muốn method có thân chỉ dành cho phiên bản java 8 trở lên
//        thì method đó phải áp dụng từ khóa DEFAULT và STATIC
        default void mess1(){
            System.out.println("Hello");
        }
        
        
        // đây chỉ là 1 interface bth
        int calc(int a, int b); // 1 method luôn luôn là public abstract NHƯNG KHỒNG STATIC.   
    }
    
    public static void main(String[] args) {
        //Interface không được new, new là vỡ alo.
        // class bth: vision v1 = new vision(); chạy bth
        // class interface: operation op = new operation(); vỡ code, ko chạy đc
        // Vậy tại sao ở đây vẫn là NEW ??
        // Thực chất interface khác với class bình thường, nó không tạo ra 1 obj operation.
        // Mà nó đang tạo ra 1 CLASS ANONYMOUS ẩn danh IMPLEMENTS operation.
        // vì vậy class đó phải khai báo giống như tạo ra 1 thằng class tương đương với vision.
        operation op= new operation() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        };
//      Đây là sự tương đồng với thằng abstract, nghĩa là biến của 1 class interface phải declare hàm bên trong interface
//      Điều này ai cũng biết đơn giản mà, vậy thằng OP chính là biến con trỏ, và new operation không khác gì là 1 obj
//      nhưng obj đặc biệt vì phải khai báo cách thức hoạt động bên trong.
//      sau khi declare nó đc sử dụng như là 1 thằng obj bình thường, obj. vẫn hiện ra hàm
        
// có cách nào rút gọn nó không?
// Được, chúng ta sẽ có 1 khái niệm mới được gọi là arrow function, LAMBDA
        operation o1 = (a, b)->{
            return a+b;
        };
    // Vậy vẫn chưa gọn
        operation lambda = (a, b)->a+b; // đây là đỉnh cao của arrow function, siêu gọn code
        // CHUYỆN LẠ HIẾM THẤY:
        // vì sao 1 biến obj được gán 1 method, 1 phép tính vào nó.
        // nó tương đương như việc này
        int a = methodIntResult();
    // Lưu ý lambda chỉ được dùng cho class interface     
    }
    private static int methodIntResult() {
        return 10;
    }
}
