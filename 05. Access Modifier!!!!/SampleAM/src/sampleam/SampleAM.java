/*
-------ACCESS MODIFIED--------
Đôi khi trong code chúng ta cần phải bảo vệ thông tin của từng class, vì vậy khái niệm Access Modified đc ra đời

 */
package sampleam;

/*
ACCESS MODIFIED: Phương thức truy cập
Có 4 loại phương thức truy cập
-Privated: Chỉ có duy nhất class đó đc sử dụng các biến mang phương thức privated
-Default:  Chỉ có các class trong cùng 1 package sử dụng các biến mang phương thức default.
-Protected: Tương tự như default 
            NHƯNG ngoại trừ các sub-class đc kế thừa từ class cha có thể truy cập mà ko cần chung package
-Public: mọi class mọi pakage đều sờ vào đc
 */
public class SampleAM {

    /*
    VIDU dưới đây là dễ hiểu nhất
     */
    public static void main(String[] args) {
        
    }
    
}
