package casiocaculation;

/**
 *
 * @author LENOVO
 */

//Hôm nay chúng ta sẽ học về CALL BACK FUNCTION

public class CasioCaculation{
    public static void main(String[] args) {
        // Mục tiêu viết 1 class 1 method làm đc cả 4 phép tính cơ bản
        System.out.println(calc.caculate(2, 3, (a, b)-> a + b));
        // (a,b)-> a+b; là 1 method ANONYMOUS mà sao có thể truyền vào trong 1 method khác đc
        // Đây chính là callback function, hàm gọi ngược, java chạy tới hàm caculate nó thấy (a,b)-> a+b; 
        // java tự động gọi đến class interface operation, và thấy abstract method int apply() chưa đc khai báo thân hàm
        // nó sẽ tự động gán (a,b)-> a+b; vào thân hàm của method int apply(int a, int b); thông qua biến op
        // tức là
        // caculate(2, 3, operation op = (a, b)->a+b); đây chính là call back function.
        //(a,b)-> a+b; chính là ARROW FUNCTION, LAMBDA.
        
        calc.caculate (2,3, (a,b)->a-b);
        calc.caculate (2,3, (a,b)->a*b);
        calc.caculate (2,3, (a,b)->a/b);
        
    }
}

// 1 class bình thường
class calc{
    static int caculate(int a, int b, operation op){
        return op.apply(a, b);
    }
}

// 1 class interface bình thường
interface operation{
    int apply(int a, int b);
}