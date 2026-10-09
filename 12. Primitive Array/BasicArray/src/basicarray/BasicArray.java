/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicarray;

/**
 *
 * @author LENOVO
 */
public class BasicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //playWithPrimitiveArray();
        playWithPrimitiveArrayV2();
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
}