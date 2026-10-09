/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.PrintStream;
import java.util.Date;

/*
STATIC ??? - Dùng chung cho mọi thứ, cái gì là static thì cái đó là dùng chung
STATIC chỉ chơi vs STATIC
STATIC chỉ chơi vs OBJ hàm Global Value

NON-Static chơi với NON-Static và Static trong 1 số trg hợp;

đồ chung thì là của chung ko thành riêng
đồ riêng góp làm đồ chung;
*/
public class StudentProfile {
    private String id;
    public static String name;
    public int yob;
    private double gpa;
    private Date year;
    
    public StudentProfile(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%8s|%-25s|%4d|%4.1f\n", id, name, yob, gpa);
    }
    
    public void showProfile(){
        System.out.printf("%8s|%-25s|%4d|%4.1f\n", id, name, yob, gpa);
    }
    
    public int getAge(){
        return year.getYear() - yob;
    }
    
    public static void sayHi(){
        System.out.println("Say Hi");
    }
}

/*
Kiến thức căn bản về Access Modifier/ Speciafier
    Vì sao trong các biến trong HÀM ko được sử dụng Access Modifier?
        public static void main(){
            "private/public" int a; -->dây là câu lệnh sai
        }
    Bởi vì access modifier là dùng cho biến của Obj và global value (biến toàn cục)
    Còn biến nội bộ trong hàm là local value, ko nhất thiết phải dùng Access Modifier trong khi chỉ có mỗi Hàm đó sử dụng;
    vậy nên Ko có ý nghĩa gì lắm. Còn hàm có thể sử dụng Access Modifier thoải mái.
*/