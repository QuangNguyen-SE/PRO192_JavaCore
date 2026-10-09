/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author LENOVO
 */
public class Vision extends Bike {
    public static final String name ="Vision";
    private static int max_speed = 110;
    
    public Vision(){
        
    }
    
    public Vision(int plate, int model) {
        super(plate, model);
    }
    
    public int getMax_speed() {
        return max_speed;
    }
    
    public void NangNoi(int max_speed){
        Vision.max_speed=max_speed;
    }

    public static String getName() {
        return name;
    }
    @Override
    public String getBikeName(){
        return "Honda Vision";
    }
    
    @Override
    public boolean turnOnBike() {
        return false;
    }
    
    public String horn(){
        return "Beep...";
    }
}
