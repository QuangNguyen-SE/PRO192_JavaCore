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
    
    public String name; //Phạm vi truy cập (access modifier) 
    
    
    private int yob;
    private double weight;
    
    
    public Dog(String name, int yob, double weight){
        this.name= name;    //đây là các vật liệu của phễu
        this.yob= yob;
        this.weight= weight;
          
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override //khác Overload (nạp chồng)
    //liên quan đến Polymorphin-tính đa hình và inheritance-kế thừa
    //Hàm này show toàn bộ thông tin của Obj
    
    public String toString() {
                    //KO ĐƯỢC ĐỔI TÊN HÀM, LÍ DO <SUPER-TYPE>
        
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        //Hàm này in ra xấu, độ lại cho đẹp
        return String.format("GoGo|%-10s|%4d|%4.1f", name, yob, weight);
        //Hàm String.format theo printf;
        
        //Những điều hay ho khi chơi với toString()
        
    }
    
}