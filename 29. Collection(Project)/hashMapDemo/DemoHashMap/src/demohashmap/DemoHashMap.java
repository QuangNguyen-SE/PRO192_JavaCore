/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohashmap;

/**
 *
 * @author LENOVO
 */
public class DemoHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DogList ds = new DogList();
        ds.addDog(new Dog(1, "Shiba"));
        ds.addDog(new Dog(2, "Husky"));
        ds.addDog(new Dog(3, "Poodle"));
        ds.addDog(new Dog(4, "Golden"));
        ds.displayAll();
        
    }

}
