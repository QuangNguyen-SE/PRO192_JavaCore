/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author LENOVO
 */
public abstract class Shape {
    
    protected String owner;
    protected String color;
    protected String borderColor;
    
    //protected double a, b, c, radius;
    //ko nên để những đặc tính riêng của các obj ở đây
    //vì tính kế thừa RE-USE cho mọi obj liên quan tới class này
    // nếu để cạnh ở đây thì khác gì kêu Hình tròn là Hình vuông, hình tròn có cạnh

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }

//Khuôn thì có nguyên tắc chung 
        
    
    //Diện tích và chu vi ko được xem là đặc tính, mà là hành vi obj
    //2 hàm tính S và P để ở đâu 
    //Nhưng mà diện tích và Chu vi là 2 thằng mà trong bất kì hình nào phải có
    //vậy bắt buộc có nhưng có thì làm gì có cạnh truyền vô
    //có như ko có -> TÍNH TRỪU TƯỢNG: Polymophism;
    
    public abstract double getArea(); // t chỉ để đây - t ko nói gì thêm
    public abstract double getPerimeter(); // nói trước tính sau
    
    //abstract là đại diện những thứ vô hình ko thể thiếu
    //đại diện các thứ chung chung của obj nhưng lại khác biệt về cách hành vi
    public abstract void paint(); 
}
