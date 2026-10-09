/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofile;

import java.io.Serializable;
import java.util.Locale;


/**
 *
 * @author LENOVO
 */
public class Dog implements Serializable{ //Serializables là chức năng turn on mã hóa 
    
    int iDNumber;
    String name;

    public Dog() {
    }
    
    
    public Dog(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public String toString() {
        return String.format("%-4d|%10s\n", iDNumber, name);
    }
    
    public void showDogInfo(){
        System.out.printf("%-4d||%10s||", iDNumber, name);
    }

}
