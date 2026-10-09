/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.text.Annotation;
import jdk.nashorn.internal.objects.annotations.Getter;
/**
 *
 * @author LENOVO
 */
public abstract class Bike {
    int plate;
    int model;

    public Bike() {
        
    }
    
    public Bike(int plate, int model){
        this.plate = plate;
        this.model = model;
    }
    
    public abstract boolean turnOnBike();

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
    public String getBikeName(){
        return "Unknow Bike";
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bike{");
        sb.append("plate=").append(plate);
        sb.append(", model=").append(model);
        sb.append('}');
        return sb.toString();
    }

    
    
}
