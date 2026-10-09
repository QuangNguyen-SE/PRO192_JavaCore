/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofile;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class DemoFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testReadFile();
        writeTxtFile();
        readTxtFile();
    }

    public static void testWriteFile() {
        
        DogList dList = new DogList();
        dList.addDog(new Dog(1, "shiba"));
        dList.addDog(new Dog(2, "Husky"));
        dList.addDog(new Dog(3, "Poodle"));
        
        ArrayList<Dog> data = new ArrayList();
        
        data.add(new Dog(1, "shiba"));
        data.add(new Dog(2, "Husky"));
        data.add(new Dog(3, "Poodle"));
        
        String fileName="DogFile.test"; 
        
        try {
            FileDAO.writeBinaryFile(fileName, data);
        } catch (Exception ex) {
            Logger.getLogger(DemoFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void testReadFile() {
        String fileName="DogFile.test";
        
        try {
            ArrayList<Dog> data=FileDAO.readBinaryFile(fileName);
            System.out.println(data);
        } catch (Exception ex) {
            Logger.getLogger(DemoFile.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          
        }
       
    }
    
    public static void writeTxtFile(){
         ArrayList<Dog> data = new ArrayList();
        
        data.add(new Dog(1, "shiba"));
        data.add(new Dog(2, "Husky"));
        data.add(new Dog(3, "Poodle"));
        
        String filename="DogDemoFile.txt";
        
        try {
            FileDAO.writeTextFile(filename, data);
        } catch (Exception ex) {
            Logger.getLogger(DemoFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readTxtFile(){
        String filename="DogDemoFile.txt";
        
        try {
            ArrayList<Dog> data=FileDAO.readTxtFile(filename);
            System.out.println(data);
        } catch (Exception ex) {
            Logger.getLogger(DemoFile.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
          
        }
       
    }
}
      
        

