/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.Scanner;
import until.Validation;
/*
đây là class Obj, làm ngăn tủ chứa 1 mảng các obj
Bởi vì khi Shelf tu1= new Shelf là sẽ sinh ra 1 vùng ram mới
mà vùng ram đó lại có 1 Array Stundet mới với [300]
như vậy 2 lần new Shelf sẽ là 2 mảng Student moi
 */
public class Shelf {
    private String label;
    private String color;
    private Student[] StuList = new Student[30];
    // Chuyện gì xảy ra NẾU để static ở chỗ khai báo list
    // toàn bộ list arr sẽ bị khai báo trùng mảng
    // nghĩa là tủ SE lại dùng chung vùng nhớ với tủ AI à!!!!
    // biến static là biến mà các obj khác đều có thể dùng chung, nếu nó bị thay đổi tất cả các obj cũng bị thay đổi
    // ko được đặt cái của riêng làm của chung, tủ SE là của sinh viên SE, tủ AI của sinh viên AI
    //nếu biến static bị thay đổi trong tủ SE thì biến đó cũng sẽ bị thay đổi trong tủ AI
    
    private static Scanner sc = new Scanner(System.in);
    private int count=0; //count là đại diện cho biến đếm và tủ hồ sơ
    //

    public Shelf(String label, String color) {
        this.label = label;
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public String getColor() {
        return color;
    }
    
    
    public void inputStudent(){
        System.out.println("Student #"+(count + 1)+": ");
        String name, id;
        int yob;
        double gpa;
        id=Validation.getString("Input a Id: ", "Invalid Id");
        name=Validation.getName("Input a NAME:", "Only Letter, no special letter or number");
        yob=Validation.getInt("Pls input year of birth: ", "Only Positive Number!!");
        gpa=Validation.getDouble("Input your GPA: ", "Only Number (3.5) !!!");
        StuList[count] = new Student(id, name, yob, gpa);
        count++;
        System.out.println("");
    }
    public void printStuList(){
        for (int i = 0; i < count; i++) {
            System.out.println("Student #"+(count+1)+":");
            StuList[i].display();
        }
    }
}
