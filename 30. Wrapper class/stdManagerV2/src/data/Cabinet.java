/*
Thuat ngu CRUD:
 CRUD - C:create || R:read/retrieve || U: update || D: Delete/remove
mo ta cac chuc nang co ban cua 1 app/web/ung dung, ....
 */
package data;
import java.util.*;
import util.Validation;


public class Cabinet {
    private List<Student> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    
    //default constructor
    public Cabinet() {
        
    }
    
    //Hanh dong cua 1 cai tu la: Them ho so, tim hs, sap xep hs, update hs
    public void addAStudent(){
        String id, name;
        int yob;
        double gpa;
        do{
            System.out.println("Input student profile #" + (arr.size()+1));
            id = Validation.getString("Input id: ", "Must-String").trim().toUpperCase();
            Student stu = searchAStudent(id);
            if(stu == null){
                break;
            }
        }while(true);
        name = Validation.getName("Input name: ", "Name don't have number").trim();
        yob = Validation.getInt("Input yob: ", "Birth don't have letter");
        gpa = Validation.getDouble("Input gpa: ", "GPA don't have letter");
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("The student have been added successfully");
    }
    //Ham function
    public void printStudentList(){
        if(arr.isEmpty()){
            System.out.println("The student list is empty. Nothing to print");
            return;
        }
        System.out.println("There is/are "+ arr.size() + " student");
        for (Student student : arr) {
            System.out.print(student.toString());
        }
    }
    
    public Student searchAStudent(String id){
        if(arr.isEmpty())
            return null;
        for (int i=0; i<arr.size(); i++){
            if(arr.get(i).getId().equalsIgnoreCase(id))
                return arr.get(i);
        }
        return null;
    }
    //Ham bao ham search o tren
    //@Overload
    public void searchAStudent(){
        String keyword;
        keyword = Validation.getString("Input id to search: ", "Not Id");
        Student stu = searchAStudent(keyword);
        if (stu == null)
            System.out.println("Not found!!!");
        else{
            System.out.println("Found!!!");
            System.out.println(stu);
        }
    }
    
    public void searchPositionStudent(String id){
        Student stu = searchAStudent(id);
        
    }
    
//    public void updateGPA(){
//        String keyword;
//        double n;
//        keyword = Validation.getString("Input id to update: ", "Not Id");
//        Student stu = searchAStudent(keyword);
//        if (stu == null)
//            System.out.println("Not found!!!");
//        else{
//            System.out.println("Found here is it!!!");
//            System.out.println(stu);
//            n=Validation.getDouble("Enter a new GPA: ", "this number is invalid");
//            stu.setGpa(n);
//            System.out.println(stu);
//        }
//    }
    public void updateGPA(){
        String id;
        double n;
        id = Validation.getString("Input id to update: ", "Not Id");
        n=Validation.getDouble("Enter a new GPA: ", "this number is invalid");
        updateGPA(id, n);
        searchAStudent(id);
    }
    public void updateGPA(String id, double newGPA){
        Student stu = searchAStudent(id);
        if(stu == null){
            System.out.println("Not found!!!");
            return;
        }
        // 1.stu.setGpa(newGPA);
        updateGPA(stu, newGPA);
    }
    public void updateGPA(Student stu, double newGPA){
        stu.setGpa(newGPA);
    }
}
