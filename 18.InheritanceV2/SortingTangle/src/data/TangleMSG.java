/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import util.Validation;
import sortingtangle.Menu;
/**
 *
 * @author LENOVO
 */
public class TangleMSG {
    Tangle list[] = new Tangle[10];
    private int count=0;
    
    public void inputNormalTangle(){
        double edge1, edge2, edge3;
        boolean stop=true;
        
        String name=Validation.getName("Enter name pls: ", "Name dont have number!!!");
        do{
            edge1=Validation.getDouble("Enter a number of edge 1: ", "Invalid input!!!");
            edge2=Validation.getDouble("Enter a number of edge 2: ", "Invalid input!!!");
            edge3=Validation.getDouble("Enter a number of edge 3: ", "Invalid input!!!");
            if((edge1 == edge2) ||(edge2 == edge3) || (edge1 == edge3) ||(edge2==edge3)){
                System.out.println("THIS IS NORMAL TANGLE !!!");
                System.out.println("");
                if(Validation.isContinous())
                    return;
            }else
                stop=false;
           
        }while(stop);
        list[count]=new Tangle(name, edge1, edge2, edge3);
        count++;
    }
        
    public void inputDTangle(){
         double edge1, edge3;
        boolean stop=true;
        
        String name=Validation.getName("Enter name pls: ", "Name dont have number!!!");
        do{
            edge1=Validation.getDouble("Enter a number of Canh: ", "Invalid input!!!");
            edge3=Validation.getDouble("Enter a number of canh huyen: ", "Invalid input!!!");
            if(edge1 != edge3){
                stop=false;
            }else{
                System.out.println("THIS IS NORMAL TANGLE !!!");
                System.out.println("");
                if(Validation.isContinous())
                    return;
            }
        }while(stop);
        list[count]=new DTangle(name, edge1, edge3);
        count++;
    }
    public void display(){
        for (int i = 0; i < count; i++) {
            list[i].paint();
            System.out.println("");
        }
    }
    public void sortingArea(){
        Menu menu = new Menu();
        int choice;
        String[] option= {"1-Accending\n"
        +                 "2-Decending\n"
        +                 "3-Quit\n"};
        do{
            System.out.println("");
            System.out.println("------SORTING AREA------");
            choice = menu.getOption(option);
            switch(choice){
                case 1:
                    System.out.println("---ACCENDING---");
                    sortingAcc(list);
                    display();
                    break;
                case 2:
                    System.out.println("---DECENDING---");
                    sortingDecc(list);
                    display();
                    break;
                case 3:
                    System.out.println("Successfully Back off");
                    return;
                default:
                    System.out.println("Pls check input again !!!");
                    throw new NumberFormatException();
            }
        }while(choice != 3);
    }
    
    public void sortingAcc(Tangle[] arr){
        for (int i = 0; i < count-1; i++) {
            for (int j = i+1; j < count; j++) {
                if(arr[i].getArea() < arr[j].getArea()){
                    swap(arr, i, j);
                }    
            }
        }
    }
    
    public void sortingDecc(Tangle[] arr){
        for (int i = 0; i < count-1; i++) {
            for (int j = i+1; j < count; j++) {
                if(arr[i].getArea() > arr[j].getArea()){
                    swap(arr, i, j);
                }    
            }
        } 
    }
    public void swap(Tangle[]arr, int i, int j){
        Tangle tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
    

