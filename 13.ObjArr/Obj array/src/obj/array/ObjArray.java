/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj.array;

/**
 *
 * @author LENOVO
 */
public class ObjArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithStuArr();
    }
    public static void playWithPrimitiveArray(){
        // double vol[365]; Java cấm khai báo size mảng trong [];
        //Kể cả việc khai báo float v[10]={1, 2, 3, 4};
        //KHÔNG ĐƯỢC KHAI BÁO SIZE TRONG NGOẶC VUÔNG
        
        float v[]={1, 2, 3, 4, 5}; //mảng có 5 phần tử
        //5 phần tử này nằm trên HEAP, new ngầm, malloc
        //bên C thì phần này đc nằm trong Stack LIFO, bị kiểm soát, bị động
        //Còn bên java là nằm trên HEAP, có malloc ngầm
        
        System.out.println("The array has value of (printed by invidual: ");
        //ẤN for + tab điều kì dịu sẽ xảy ra
        for (int i = 0; i < 4; i++) {
            System.out.print(v[i]+ " ");
        }
        // Ngoài ra ta có thể chơi theo kiểu for khác
        // fore + tab điều kì dịu sẽ xảy ra
        
        //bên code dấu : tức là thuộc về, với mọi như bên toán học
        // câu "x : v" tức là Với mọi "x" thuộc mảng array "v"
        // "x" lấy từng phần tử trong mảng v;
        System.out.println(" ");
        System.out.println("Fore:");
        for (float x : v) { 
            //x = v[0]; x= v[1]; x= v[3]; ....
            //2 câu lệnh for y chang nhau
            //sout(v[i]) ==== sout(x); nó tự động đi hết mảng;
            System.out.print(x + " ");
        }
    }

    public static void playWithPrimitiveArrayV2(){
        double arr[]= new double [10]; //giống calloc bên C, 
        //bên java gọi mảng là clear hết ram trc khi dùng
        //đây là câu lệnh khai báo xin vùng ram cho mảng và NÓ NẰM Ở HEAP
        // new() là new obj
        // new[] là khai báo mảng;
        arr[0]=39;
        arr[1]=40;
        arr[2]=60;
        arr[9]=100;
        for (double x : arr) {
            System.out.print(x + "\t");
        }
        System.out.println("");
    }
    
    public static void playWithPrimitiveArrayV3(){
        int arr1[] = {5, 10, 15, 20}; //new ngầm, ko nói rõ việc new
        int arr2[] = new int [5]; // new nhưng ko gán
        int arr3[]= new int[]{5, 10, 15, 20}; // new và gán
        
        int arr[];
        arr= new int[5];
        //có nhiều biến trùng tên rồi, sau đó xài từng biến theo nhu câu!!!
        arr[0] = 5;
        arr[1] =10;
        arr[2] = 15;
        
        //arr là gì? Là 1 biến phức tạp, là biến obj, vì trỏ tới 1 vùng
        //có quyền chấm, chấm cái gì? .toString();
        //arr như biến obj vì bên trong nó có nhiều info
        //info này là phần tử của mảng
        // Vì sao arr "." đc những arr[0] không "." đc
        //arr[0] là 1 biến primitive, 1 biến đơn ko cần chấm cái qq gì
        //còn arr là tên biến đại diện cả 1 mảng như 1 obj nó chính là obj 
        //chấm để thao tác các info bên trong
        
        
    }
    
    public static void playWithStudentObj(){
        Student s1= new Student("SE183894", "Quang", 2004, 2.3);
        s1.showProfile();
        
    }
    
    public static void playWithStuArr(){
        Student s[] = new Student[10]; // new [] là mảng;
                                      //  new () là obj;
        // Theo bạn s "." sổ ra gì?
        // s nó là MẢNG ko phải là OBJ nên nó ko sổ ra OBJ mà sổ ra MẢNG
        // nếu s.showprofile thì làm gì biết show thằng student nào!! THẬT VÔ LÍ !!!
        
        s[1]=new Student("SE13", "A", 2000, 2.1);
        s[2]= new Student("SE19","B", 2000, 2.1);
        s[3]= new Student("SE17","C", 2000, 2.3);
        //Những phần tử còn lại của mảng chưa gán gtri sẽ bằng 0
        //Con trỏ của các phần tử đó sẽ trỏ tới byte đầu tiên, byte số 0
        System.out.println("The list of Students is:");
        for (Student student : s) {
            System.out.println(student);
             
        }
    }
    public static void playWithNullPoiter(){
        Student s1;
        s1 = null; // t trỏ xuống đấy nha
        s1.showProfile(); // NullPointerException 
        //Có mẹ gì đâu mà show, nó trỏ xuống vùng byte thứ 0
        // bị default với mảng primitive, bị null với mảng obj
        
    }
}   

