/*
Có tổng cộng 4 loại hàm:

1_ Void (KO vào){
    KO RA;
}

2_ Void (Có vào){
    KO RA;
}

3_ int/double/float/char.... (KO VÀO){
    CÓ RA (return value); *bắt buộc*
}

4_ int/double/float/char.... (CÓ VÀO){
    CÓ RA (return value); *bắt buộc*
}
*/
package func.value;

import java.util.Scanner;

/*
Hàm là 1 công thức hóa, là 1 chức năng đại diện để xử lí các giá trị và NÊN mang tính RE-USE
vidu: 
Tính diện tích các hình chữ nhật
vậy hàm ở đây chính là công thức tính hình chữ vuông đc đặt tên là diện tích
Theo toán học 
f(Cạnh)= Cạnh x Cạnh
f(Cạnh) chính là Hàm
Cạnh: là tham số chuyền vào
*/
public class FuncValue {
    
    
    public static void main(String[] args) {
        int n=getPositiveNumber();
        System.out.println("Area of retangular: " + area(n));
        /*
        OOP pass by value : truyền tham trị, truyền tham số
        Giống như CON TRỎ bên C; 
        */
    }
/*
    Hiện tượng hàm TRÙNG TÊN nhưng PHẢI KHÁC datatype/số lượng của tham số đầu vào
    được gọi là overload
    Hàm được trùng tên biến và tên hàm MIỄN LÀ nó KHÁC SỐ LƯỢNG / DATATYPE của tham số
    VIDU:
*/
    public static int getPositiveNumber(){
        //Scanner trong JAVA
        int n;
        Scanner banPhim = new Scanner(System.in);
        System.out.print("Nhap: ");
        n=banPhim.nextInt(); //nextIn trong thu muc java.until la lay du lieu trong RAM thong qua ban phim
        return n;
    }
    public static int area(int n){
        return n^2;
    }
    public static int area(int n, int b){
        return n*b;
    }
}
