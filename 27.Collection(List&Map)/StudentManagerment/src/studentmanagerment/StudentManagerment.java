/*   \||/
     |00|
     +==+   Hello
    ||||||  .....
    ||\\|| \./ \./
    |||\\| //  //
    ||||\\//\\// 
    |||||| 
    //  \\
   //    \\
  //     //
 //     //  
//     //               
 */
package studentmanagerment;

import data.*;
import java.util.*;


/**
 *
 * @author LENOVO
 */
public class StudentManagerment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public static void playWithArrayList(){
        //Student[] arr = new Student [500];
        
        //List arr = new ArrayList(); --> đây là túi hỗn loạn, đựng đủ thứ
        //Nó đựng cả Teacher, Student, Dog,... rất nhiều kiểu datatype;
        //Miễn là có tham chiếu
        
        
        List<Student> arr = new ArrayList();
        //còn đây là túi đồng nhất (generative), túi đồng nhất chỉ đựng data Student
       // Có nhiều cách khai báo 1 cái túi!!!!
      // List<Student> arr = new ArrayList<Student>();
     // List<Student> arr = new ArrayList<>();
    // Nhét đồng nhất món đồ thì mới dễ chấm, mỗi obj là mỗi chấm khác nhau for rất mệt
        
        //arr.add(new Student(...));  
        //Lưu con trỏ hoy, new Student thoải mái bên ngoài, vùng Heap
        
        Student s1 = new Student("SE1838", "An Nguyễn", 2003, 9.0);
        Student s2 = new Student("SE1838", "BINH", 2003, 6.0);
        
        arr.add(s1);
        // arr.add(s1);
        // được phép add trùng -->ko vấn đề
        //2 chàng trỏ 1 nàng
        
        arr.add(s2);
        
        arr.get(1).showProfile();
        
        //fore dùng để duyệt mảng arraylist 
        
        for (Student x : arr) {
            x.showProfile(); 
        }
        System.out.println("In xin so for truyen thong");
        // mảng thì dùng length(), danh sách mảng thì dùng size()
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }
    
    public static void sortArrListManually(){
        List<Student> arr = new ArrayList(); //đây là chiếc túi vô hạn của doreamon
        arr.add(new Student("SE1838", "A", 2003, 9.0)); //0
        arr.add(new Student("SE1709", "B", 2003, 7.6)); //1
        
        // 2 câu lệnh dưới đây y như nhau
        
//        for (int i = 0; i < arr.size(); i++) {
//            Student student = arr.get(i);
//            student.showProfile();
//        }
        // tất cả đều là 1
        for (Student student : arr) {
            student.showProfile();
        }
        Student temp = arr.get(0);
        // hàm thay đổi vi tri con trỏ trong array list là set(index con trỏ, index của con trỏ nào đó);
        // thay đổi vi tri con trỏ
        
        //  SWAP    //
        arr.set(0, arr.get(1)); // con trỏ thứ 0 sẽ copy info của 1
        arr.set(1, temp);
        //Bản chất vùng Ram HEAP "new Student()" lưu dữ liệu vẫn nằm yên
        //Chỉ có thằng con trỏ, trỏ tới heap mới thay đổi.
        
        System.out.println("The student after sort");
        for (Student student : arr) {
            student.showProfile();
        }
        
        //Remove = delete 
        arr.remove(1);
        System.out.println("After vo vi");
        for (Student student : arr) {
            student.showProfile();
        } 
    }
    
    //  Set: là 1 loại giỏ, túi, mà ko cho phép đựng trùng món
    //  tức là ko có món nào xuất hiện quá 1 lần
    //  ko cho phép trỏ trùng 1 vùng new
    //  đếm số người xem phim, lễ hội, tiệc, đếm mỗi người 1 lần
    
    // List: cứ vào là đếm
    public static void playWithSet(){
        Set<Student> arr = new HashSet();
        Student an = new Student("SE1838", "An", 2003, 9.4);
        arr.add(an);
        arr.add(new Student("SE1839", "Binh", 2003, 6.4));
        //arr.add(an); -> ko cho trỏ trùng
          
        //SET ko có hàm get() bởi vì SET đc sắp xếp theo 2 thứ tự
        // 1. sắp xếp 1 cách lộn xộn
        // 2. sắp xếp theo HASH function
        // ko giống thứ tự đưa vào, đưa 1 vào 2-3-4-5-0-...
        //LIST add trước ngồi trước, add sau ngồi sau
        //SET add trước thích ngồi đâu thì ngồi
        System.out.println("The SET list");
        for (Student student : arr) {
            student.showProfile();
        }
    }
}
