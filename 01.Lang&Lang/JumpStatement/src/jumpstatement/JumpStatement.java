/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpstatement;

/*
Jump Statement: break, continous, goto, return

Break: câu lệnh thoát vòng lặp (Switch..CASE, do...while, For) gần nó nhất mà ko cần sử dụng label:

Return: là câu lệnh có 2 chức năng: trả về 1 giá trị cho hàm, và kết thúc HÀM
        kết thúc mọi câu lệnh trong hàm đó khi nó chạy tới return

Continous: là skip qua các câu lệnh bên dưới vòng lặp, và chạy vòng lặp tiếp tục cho đến khi gặp đk dừng 

 */
public class JumpStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void playWithBREAK(){
        for(int a=0;a<3;a++){
            for(int b=0; b<5; b++){
                if(b>3)
                    break; //Break là câu lệnh thoát vòng lặp gần nó nhất
            }
            System.out.println("");
        }
    }
    
    public static void breakAndLabel(){
        end: for(int a=0;a<3;a++){ 
            for(int b=0; b<5; b++){
                if(b>3)
                    break end; //Break sẽ di chuyển tới vị trí label đc gán là "end"
                    //để kết thúc vòng lặp đó, bất kể tên gì cũng đc
            }
            System.out.println("");
        }
    }
    
    public static void playWithContinous(){
        int max= 10;
        for(int i=0; i<max;i++){
            if(i<5)
                continue; // continue: sẽ lập tức bỏ qua các câu lệnh bên dưới 
                         //để tiếp tục chạy vòng lặp gần nó
            System.out.println("i"); // như vậy câu lệnh này sẽ chạy khi i >= 5
        }
    }
        
    public static void continousWithLabel(){
        loop:for(int i = 0; i<10; i++){
            for (int y=0; y<5;y++){
                if(i<5)
                    continue loop;
                System.out.println("y:"+y);
            }
            System.out.println("i: "+i);
        }            
    }
}
