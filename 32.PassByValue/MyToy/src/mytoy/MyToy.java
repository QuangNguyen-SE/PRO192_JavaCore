
package mytoy;

import data.*;
import javafx.beans.binding.Bindings;


public class MyToy {
    
   
    public static void main(String[] args) {
        playWithNode();
    }
    
    public void testPointer() {
        Toy car = new Toy("car", 12.00);
        Toy bike = new Toy("bike", 9.00);
        Toy puppet = new Toy("puppet", 5.00);
        Toy tank = new Toy("tank", 15.00);
        
        Toy fake;
        fake = bike;
        
        System.out.println("Bike not change");
        System.out.println(fake);
        
        System.out.println("Bike change");
        bike.setName("Motobike");
        System.out.println(bike);
        System.out.println(fake);
        
    }
    //Normal obj array
    public static void data(){
        Toy car = new Toy("car", 12.00);
        Toy bike = new Toy("bike", 9.00);
        Toy puppet = new Toy("puppet", 5.00);
        Toy tank = new Toy("tank", 15.00);
        Toy arr[]=new Toy[4];
        arr[0]= car;
        arr[1]= bike;
        arr[2]= puppet;
        arr[3]= tank;
        for (Toy toy : arr) {
            System.out.println("Array obj"+toy);;
        }
    } 
    //Vip obj array called: linked list array
    public static void playWithNode(){
        Toy car = new Toy("car", 12.00);
        Toy bike = new Toy("bike", 9.00);
        Toy puppet = new Toy("puppet", 5.00);
        Toy tank = new Toy("tank", 15.00);
        Toy test = new Toy("test", 0.00);
        
        Store store = new Store();
        
        store.add(car);
        store.add(bike);
        store.add(puppet);
        store.add(tank);
        
        System.out.println("List:");
        store.openStore();
        System.out.println("Add first");
        store.insertFirst(test);
        store.openStore();
    }//Vip obj array called: linked list array
   
    
        
}
