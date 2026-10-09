/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

//IMPORT LIB
import java.util.*;
import util.Validation;
import data.*;
//------//

public class main {
    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        
        //Day chinh la add student*
        System.out.println("Input SE student");
        se.addAStudent();
        Cabinet ai = new Cabinet();
        System.out.println("Input AI student");
        ai.addAStudent();
        ai.addAStudent();
        
        System.out.println("List SE");
        se.printStudentList();
        
        System.out.println("List AI");
        ai.printStudentList();
        
        
    }
    
}
