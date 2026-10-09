//biến-(variable) là 1 vùng ram được đặt tên
// định dạng, tên gọi cho 1 giá trị
// có 2 loại giá trị:
// 1-gtri đơn(single/primitive value) || 2-gtri phức tạp (complex, composite)
package varnfun;

//các loại data type trong C và java khác nhau như thê nào 
/*
     ||        C       ||      java       ||
char ||     1 bytes    ||      2 bytes    ||  
     ||     (ko có tv) || (có tiếng việt) || 
*/          

public class VarNFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithVariable();
        playWithIntegers();
    }
    public static void playWithIntegers(){
        int n=39;   //mọi con số, kí tự xuất hiện trong code là literal value (gtri thấy được)
                    // mọi con số NGUYÊN xuất hiện trong code mặc định là int
        System.out.println("n: "+ n);
        long m=3_0000_0000L; // _ PHÂN CÁCH CODE CHO DỄ ĐỌC
        System.out.println("n: "+ m);
        int status = 0xFA; // 0x là cách lưu hệ 16 (HEX)
        System.out.println("status: "+ status);
        int phone = 010; //số 0 đứng trc literal value là hệ 8
    }
    // Java ưu tiên double hơn float
    public static void playWithDouble(){
        double PI =3.14; //mọi số THỰC trong java đều mặc định là double
        System.out.println("pi: "+ PI);
        System.out.printf("pi: %.2f\n", PI); // cấm dùng %lf
        float vat= 0.1F; // "F" là ép kiểu
    }
    
    public static void playWithCharacters(){
        //2 byte cho kiểu char heng, lưu bằng mã Unicode
        char n= '$'; //kí tự dùng dấu nhấy đơn '..'
        String name = "Nguyen Minh Quang"; //loại data type phức tạp được gom lại
                                           // object data type
        System.out.println("name: " + name);
        
    }
    
    public static void playWithBoolean(){
        //C: ddunsg1, sai 0, int
        //Java: đúng(true), sai: false -> boolean: trạng thái đúng sai
        boolean marriedStatus = false;
        if(marriedStatus == true)
            System.out.println("Married");
        else
            System.out.println("Single");
    }
    
    public static void playWithVariable(){
         //biến là vùng ram đặt tên chiếm 1 số bytes nhất định.
        int age = 20;
        int a =10, b;
        b=100;
        //tốn 12 byte trong RAM
        
        //có 3 cách gõ print
        System.out.println("age: " + age); // xuống hàng
        System.out.printf("print age in c: %d\n", age); // print điền vào chỗ trống
        System.out.print("age: "+ age); // ko xuống hàng trừ khi ko dùng \n
    }
    public static void playWithIntegerList(){
        for (int i = 0; i <=10; i++) {
            System.out.println(i);;
            }
            
        }
    }

