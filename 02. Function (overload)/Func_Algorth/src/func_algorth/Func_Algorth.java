/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package func_algorth;

/**
 *
 * @author LENOVO
 */
public class Func_Algorth {

    /*
    các quy tắc của HÀM mang tính RE-USE:
        1. Ko nên dùng lệnh scanf
        2. Ko nên printf kết quả (return value) các gtri trả về
        3. Nên có giá trị trả về. (ko nên sử lệnh hàm void trừ 1 số trg hợp)
    
   
    */
    public static void main(String[] args) {
        
    }
    //Vidu các 2 kiểu hàm re-use;
    public static void areaV1(int n){
        System.out.println("area: " + (n*n));
        //đây là hàm ko return
    }
    public static int areaV2(int n){
        return n*n; // đây là hàm return
    }
    //Như vậy ta nên xài hàm có return trong trường hợp này
    //bời vì hàm gắn gọn, dễ kiểm soát, ko dùng lệnh print
    
    public static boolean isPrimeV2(int n){
        if(n<2)
            return false;
        if(n==2)
            return true;
        for (int i=2; i<= Math.sqrt(n); i++)
            if(n%i==0)
                return false;
        return true;
    }
}
