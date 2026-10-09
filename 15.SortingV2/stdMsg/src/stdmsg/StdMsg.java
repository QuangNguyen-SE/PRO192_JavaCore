/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stdmsg;
import data.Shelf;
import data.Student;
import until.Validation;
/**
 *
 * @author LENOVO
 */
public class StdMsg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shelf tuSe = new Shelf("Se", "Pink");
        System.out.println("Tu se");
        tuSe.inputStudent(); // Mỗi lần gọi là đc 1 sinh viên
        tuSe.inputStudent();
        tuSe.printStuList();
        
        //Mỗi lần new class Tủ là 1 lần new mới danh sách sinh viên
       System.out.println("Tu AI");
       Shelf tuAI = new Shelf("AI", "red");
       tuAI.inputStudent();
       tuAI.printStuList();
    }
    
}
