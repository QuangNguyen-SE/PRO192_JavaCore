/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import util.Validation;
/**
 *
 * @author LENOVO
 */
public class Shelf {
    public String color;
    public String label;
    
    private Book[] bList= new Book[50]; //Vì 2 class chung 1 package nên ko cần import
    private int count=0;

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public void inputBook(){
        System.out.println("Book #"+ (count +1)+"");
        String id, author, name;
        double price;
        id=Validation.getString("ID book: ", "No spec letter or empty!!!");
        author=Validation.getName("Author: ", "Name can't have a spec letter or number or empty!!");
        name=Validation.getName("Book's name: ", "Can't empty or spec letter number here!!!");
        price= Validation.getDouble("Price: ", "No letter, just only number!!! ");
        bList[count]= new Book(id, author, name, price);
        count++;
    }
    public void displayBook(){
        for (int i = 0; i < count; i++) {
            bList[i].display();
        }
    }
    
    public void searchById(){
        String n = Validation.getString("Enter the id u want to search: ", "Invalid Input !!!");
        for (int i = 0; i < count; i++) {
            if(bList[i].getId().equalsIgnoreCase(n)){
                System.out.println("The id was found !!!");
                bList[i].display();
                return;
            }
        }
    }
    
    public void sort(){
        
    }
    
    
}
