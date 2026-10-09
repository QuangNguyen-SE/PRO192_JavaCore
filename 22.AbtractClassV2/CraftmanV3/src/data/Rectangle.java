/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/*
Vì Cha là abstract, tức là chỉ nói thôi, chưa làm, demo thôi.
nên nếu con ko chịu bổ sung các hàm abstract trong code của con, thì con là abstract giống cha
1 CLASS chứa hàm abstract ko code thì class đó là abstract
vì nó toàn nói điều Chung Chung, dù trong nó có vài hàm code

Class Con thừa kế Class cha, sẽ có 2 lựa chọn:
    1. Là phải giải thích ở trong class, phải cụ thể hóa code ở đây
    2. là thành abstract giống cha, vì con kế thừa cha mà ko giải thích code.
 */
public class Rectangle extends Shape {
    
    protected double width;
    protected double length;

    public Rectangle(String owner, String color, String borderColor, double width, double length) {
        super(owner, color, borderColor);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

//Nếu ko có các hàm này thì HCN phải là abstract
//Abstract là KHÁI NIỆM chưa đc cụ thể rõ ràng bên class SHAPE
    //Khi qua class HCN các hàm abstract đc định nghĩa, được chỉ đích danh bằng code
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length)*2;
    }
    
    public void seeRectangle(){
        System.out.println("See");
    }
    
    @Override
    public void paint() {
        System.out.printf("RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f\n",
                          owner, color, borderColor, length, width, getArea());
    }
    
     
}