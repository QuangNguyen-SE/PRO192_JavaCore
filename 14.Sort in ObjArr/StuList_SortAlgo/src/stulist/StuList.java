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
        System.out.println("");
        System.out.println("Sorting Obj");
        sortObjArr(arr);
        for (Student student : arr) {
            System.out.println(student);
         }
    }
    
    private static void sortObjArr(Student arr[]){
        
        for (int i = 0; i < arr.length-1; i++) {
          
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].getGpa() > arr[j].getGpa()){
                    swapObjFixed(arr, i, j);
//                     Student tmpObj =arr[i] ;
//                        arr[i]=arr[j];
//                        arr[j] = tmpObj;
                }     
            }
        }
    }
    //Viết kiểu này có thể là thấy đúng nhưng thật ra là SAI
    
    private static void swapObj(Student s1, Student s2){
        Student tmpObj = s1;
        s1 = s2;
        s2 = tmpObj;    
        //Sai là bởi vì s1 và s2, chỉ copy tọa độ, r 2 thằng nó đổi cho nhau
        //chứ mảng vẫn GIỮ Y NGUYEENNNNNNNN, vậy t phải truyền Mảng và Index của nó
        //mới đổi đc
    }
    //NHƯ thế này mới là đúng nèeee
    private static void swapObjFixed(Student arr[], int i, int j){
        Student tmpObj = arr[i];
        arr[i]=arr[j];
        arr[j]=tmpObj;
    }
}
