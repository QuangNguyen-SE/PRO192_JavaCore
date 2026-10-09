/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        System.out.println("Input student profile #" + (arr.size()+1));
        id = Validation.getString("Input id: ", "Must-String").trim().toUpperCase();
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
    
}
