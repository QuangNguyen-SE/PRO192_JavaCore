/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stulist;

/**
 *
 * @author LENOVO
 */
import Util.Validation;
import data.Student;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StuList {
    private static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        studentArray();
    }
    public static Student studentObj(){
        System.out.print("pls Input Id here: ");
        String id = sc.nextLine();
        String name = Validation.getCharacter("Input name here: ");
        int yob = Validation.getInt("Input yob here: ");
        double gpa = Validation.getDouble("Input GPA here: ");
        return new Student(id, name, yob, gpa);
    }
    public static void studentArray(){
        int n;
        System.out.println("Pls input Number of Student is exist in class room!!");
        n= Validation.getInt("Input here: ");
        Student arr[] = new Student[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student # "+ (i+1));
            arr[i]=studentObj();
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Display here: ");
        for (Student student : arr) {
            System.out.println(student);
        }
        
    }
    
}
