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
public class StudentInfo {
    private String stdID;
    private String name;
    private int yob;
    private double GPA;
    
    public StudentInfo(String stdID, String name, int yob, double GPA){
        this.stdID=stdID;
        this.name=name;
        this.yob=yob;
        this.GPA=GPA;
    }
    //Đây là hành động của 1 obj (Behavior)
    public void sayName(){
        System.out.println("Toi ten la: " + name);
    }
}

//Code ngoài class là bị lủng code
// Tất cả những thuộc tính (Data) và các hàm thao tác data(Behavior
//Nằm gọn trong 1 class được gọi là ENCAPSULATION: Tính đóng gói của 1 obj
