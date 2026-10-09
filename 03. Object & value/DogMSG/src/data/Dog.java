/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/*
Class là 1 cái khuôn, đổ các info vào khuôn, muốn đổ thì ta phải có PHỄU
Khuôn phải kín, và cần có PHỄU (Contructor);
đổ các vật liệu
*/
public class Dog {
    //trong khuôn sẽ chứa các data, các chi tiết, các vật liệu
    //Đây là các chi tiết cb đổ vào khuôn
    public String name; //Phạm vi truy cập (access modifier) 
    //Private, public, protected, default
    /*
    public +
    private -
    protected #
    default ~
    */
    private int yob;
    private double weight;
    
    //Đây là cái phễu
    //Phễu nhận vật liệu, nơi thao tác các data.
    // phễu là hàm đặc biệt ko gtri trả về và ko void, nó là hàm trả về tất cả thông tin của 1 obj
    //Class với phễu phải 100% giống tên với nhau
    //Class phải là chữ hoa, cái khuôn đúc ra 1 vật thể, phải có định dạng, mà định dạng là tên riêng viết HOA
    public Dog(String name, int yob, double weight){
        this.name= name;    //đây là các vật liệu của phễu
        this.yob= yob;
        this.weight= weight;
          
    }
    
//Hành động của 1 obj, tất cả mọi thứ liên quan đến class đều đc code bên trong class
// hành động của obj ko đc code trong phễu vì nó có phải là vật liệu đâu!!!
    public void bark(){
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight); // trừ 10%s là canh lề trái khoảng trắng
        //System.out.println(name + " ||\t" + yob + " ||\t" + weight);
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
}
// code bên ngoài giống khuôn bị lủng
// code bên ngoài chỉ có code 1 khuôn mới

//ENCAPSULATION: tính đóng gói của thông tin và hành động vào 1 class
//Hàm biến đi kèm với nhau đại diện, mô tả cho 1 obj
//gói mọi thứ vào class, và class tạo ra obj, obj thằng nào chơi vs thông tin thằng đó, ko va đập, ko lấn sân