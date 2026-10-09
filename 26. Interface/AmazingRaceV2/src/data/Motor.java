/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

/*
Gia nhập trường đua, thì ta sẽ trở thành member chứ ko phải là con
nên từ khóa gia nhập hội đua là "IMPLEMENTS" chứ ko phải là EXTEND như cha-con

TRONG JAVA, 1 CON TỐI ĐA 1 CHA, ĐƠN KẾ THỪA
            1 CON CÓ THỂ THAM GIA N CLB;

CÒN NGÔN NGỮ KHÁC VIDU NHƯ C++, 1 CON NHIỀU CHA LUÔN, ĐA KẾ THỪA!!!
 */
public class Motor implements DeathRacer{
    
    public static final double MAX_SPEED = 150;
    
    private String model;
    private String volume;

    public Motor(String model, String volume) {
        this.model = model;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + '}';
    }
    
    public double run(){
        return new Random().nextDouble() * MAX_SPEED;
    }
    
    public void showRecord(){
        System.out.printf("%-10s|%-15s|%-10s|%4.1f|\n",
                            "Motor", model, volume, run());
    }

    @Override
    public double runToDead() {
        return run()*2; 
    }

    @Override
    public void showHowToDead() {
        System.out.printf("%-10s|%-15s|%-10s|%4.1f|\n",
                            "Motor", model, volume, runToDead());
    }
}
