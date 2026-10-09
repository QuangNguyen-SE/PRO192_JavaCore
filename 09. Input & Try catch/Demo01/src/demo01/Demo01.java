/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo01;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Demo01 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double gpa = 0;
        try {
            System.out.print("Nhap gpa: ");
            gpa=inputGPA();
        } catch (Exception e) {
            System.out.println("GPA ko lon hon 10 va be hon 0");
        }
        
        System.out.println(gpa);
        
    }

    public static void playWithTryCatchThrow(String[] args) {
        int n;
        do {
            try {
                System.out.print("Nhap n: ");
                n = sc.nextInt();
                if (n < 0) {
                    throw new NumberFormatException();
                }
                //Câu lệnh throw sẽ ném 1 mã lỗi vào vị trí mà mình muốn nó sẽ chạy đến
                // nếu nhập n<0, mã lỗi sẽ bị ném vào /*E2*/
                //các câu lệnh trong /*E2*/ sẽ đc thực thi
                if (n == 0)//Null
                {
                    throw new Exception("Vi n = 0 cho nen bi bat vao day");
                }
/*E1*/      } catch (InputMismatchException e1) {
                //e1 ở đây đóng vai trò như 1 con trỏ, class InputMisMatch là 1 class có sẵn trong thư viện JDM
                //Khi 1 dòng lệnh bị sai, app bị chết ở đâu, máy chủ JDM sẽ cung cấp 1 mã số đc mã hóa
                // mã số đó lưu các thông tin như: dòng lệnh thứ mấy bị lỗi, là lỗi gì,...
                // đc mã hóa và trả về con trỏ, e1 sẽ nhận mã lỗi đó và đưa vào thư viện InputMisMatch để xử lí
                System.out.println("Lỗi sai kí tự");
                return;
/*E2*/      } catch (NumberFormatException e2) {
                System.out.println("vì số nhập bé hơn 0 nên mã lỗi đc ném vào e2");
                return;
/*E3*/      } catch (Exception e3) {
                System.out.println("Mọi loại lỗi sẽ đc vào đây");
                System.out.println(e3.getMessage()); //Chứng minh e1, e2, e3 là con trỏ và có thể "." để xài hàm 
                return;
            }
        } while (true);
        //trong 1 câu lệnh try...catch sẽ có nhiều catch (bắt lỗi) các mã lỗi system 
        // Thông thường chúng ta sẽ ko cần nhiều catch nhưng nếu muôn ctrinh có thể tb mã lỗi 1 cách rõ ràng hơn
        // ta sẽ dùng nhiều catch hơn
        // Hoặc ta chỉ cần 1 catch duy nhất để bắt mã lỗi chung chung đó là
        // catch(Exception e) đây là câu bắt lỗi chung chung, và ta nên đặt câu catch này ở dưới đáy của dòng lệnh try...catch
        //bởi vì 1 khi nó ddc khai báo ở đầu, thì các câu lệnh catch khác ko chạy đc trừ khi có câu lệnh throw(ném xuống)
        // vì mọi lỗi input nó sẽ bắt lại hết và đó là lí do catch(Exception e) nên nằm ở cuối đáy xã hội.

        //throw tức là ném, mà ném thì phải có catch(bắt lại)
        // ném cái gì bắt cái đó
        // throw ném mã lỗi NumberFormat thì catch phải bắt lỗi NumberFormat.
        // nếu có ném(throw) mà ko có bắt(catch) thì vỡ mặt ngay, app đỏ lè.
    }
    
    public static void playWithFinally(String[] args) {
        int n;
        do {
            try {  
                System.out.print("Nhap n: ");
                n = sc.nextInt();
                if (n < 0) {
                    throw new NumberFormatException();
                }
                if (n == 0)//Null
                {
                    throw new Exception("Vi n = 0 cho nen bi bat vao day");
                }
            } catch (InputMismatchException e1) {
                
                System.out.println("Lỗi sai kí tự");
                return;
            } catch (NumberFormatException e2) {
                System.out.println("vì số nhập bé hơn 0 nên mã lỗi đc ném vào e2");
                return;
            } catch (Exception e3) {
                System.out.println("Mọi loại lỗi sẽ đc vào đây");
                System.out.println(e3.getMessage()); //Chứng minh e1, e2, e3 là con trỏ và có thể "." để xài hàm 
                return;
            }finally{
                System.out.println("Các câu lệnh chung sẽ đc chạy ở đây vidu như là f.close()");
                // finally sẽ là câu lệnh thực hiện cuối cùng sau khi try catch có bắt đc lỗi hay là ko
                //tức là sau khi try..catch chạy xong, finally sẽ luôn chạy các câu lệnh chung chung
                // vidu, câu lệnh khi đóng file: f.close();
                //và ở đây ko nên xài câu lệnh return vì nó sẽ phá vỡ vòng lập try..catch
                //Nhưng đang demo nên xài vidu tạm
                // như ta thấy ở trên cả 3 dòng lệnh catch đều xài return để thoát vòng lập
            }
        } while (true);
    }
    
    public static int inputNumber() throws Exception{
        // Method cũng có thể ném 1 mã lỗi exception về ngược lại Hàm nào gọi đến nào
        // tất nhiên nếu có hàm ném thì phải có hàm bắt
        //Vậy tại sao ta lại sẽ dụng Method để ném mã lỗi mà ko dùng try..catch
        // Vì đôi khi 1 method có thể dùng chung cho nhiều hàm
        // Nhưng đôi khi mỗi hàm muốn tự thông báo riêng thì phải dùng method throws
        // vidu rõ nhất ở hàm nhập điểm thi và nhập giá tiền
        // nhập điểm thi khi nhập sai số sẽ tự có thông báo riêng và cách xử lí riêng của hàm đó
        int n;
        n=sc.nextInt();
        if(n<0) //câu lệnh này đc tạo ra bởi vì cho 2 hàm nhập GPA và Giá tiền ở dưới
            //Con số number (GPA, giá tiền) này ko thể âm đc, nên cgi chung đặc điểm thì nên đẻ ở hàm input này
            throw new Exception(); //bắt đầu ném mã lỗi nếu thỏa điều kiện
        //lên trên hàm throws
        return n;
    }
    ///////////////////////////////////////////////////////////
    
    public static double inputGPA() throws Exception{
        //GPA khác giá tiền và giống giá tiền
        //giống: chúng đều thuộc con số lớn hơn 0
        //khác: GPA chỉ giới hạn từ 0-10
        double n;
        n=inputNumber();
        if(n<0 || n>10)
            throw new Exception();
        return n;
    }
    
    public static void inputPrince(){
        double n;
        do{
            System.out.println("Moi nhap gia tien");
            try {
                n=inputNumber();
            } catch (Exception ex) {
                System.out.println("Giá tiền ko thể bé hơn 0");
            }
        }while(true);
    }
    
}