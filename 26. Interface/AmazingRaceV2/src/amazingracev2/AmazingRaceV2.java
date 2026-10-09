/*

Thế nào là INHERITANCE và INTERFACE ?

*INHERITANCE*: Là sự kế thừa các sub-class có chung hành vi, đặc điểm, chung nguồn gốc
vidu: 
    Animal
        Pet
            Dog, Cat, Hamster....
        Canivour
            Tiger, Lions, Leopard,....
        Hebivour
            Horse, Zebra,....
        Omnivour
            Monkey,...
Animal là class cha của PET, Cani, Hebi, Om,... những thằng con đều có chung sự phân nhóm
có cách hành vi của động vật.

*INTERFACE*: Là sự kết hợp của những obj, sub-class ko liên quan nhưng lại có chung hành vi nào đó
vidu:
    Cuộc đua của các con Pet: Dog, cat,...
    +
    Cuộc đua của mấy anh chạy motor exicter trộm chó.

vậy Motor và Pet là 2 sub-class khác nhau hoàn toàn nhưng lại chung 1 hành vi đó là chạy đua!!!

Interface ra đời để combine 2 sub-class khác nhau nhưng chung hành vi

** 1-Sub class chỉ có 1 class cha ruột(Inheritance) và có thể có 3-4 class dượng (Interface)**


 */
package amazingracev2;

import data.*;
import java.util.*;

/**
 *
 * @author LENOVO
 */
public class AmazingRaceV2 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void runToDead(){
        Dog d1 = new Dog("Ngao Da", 2021, 50.0);
        Pet d2 = new Dog("Vang oi", 1950, 10.0);
        DeathRacer d3 = new Dog("Nanh trang", 1901, 5.0);
        
        
        
        
        Motor m1 = new Motor("Exciter", "150cm");
        DeathRacer m2 = new Motor("Winner", "150.0cm");
        
        DeathRacer race[] ={d1, (Dog)d2, d3, m1, m2};
        
        //Nhưng nếu có 1 con cá cũng muốn tham gia cuộc đua thì sao?
        // Annonysmus Interface bắt đầu!!!
        
        // đây được gọi là phễu rỗng. 1 class Annonysmus đc phép tạo phêu rỗng
        // hoặc tự tạo phêu riêng trong class
        DeathRacer fish = new DeathRacer() {
            //Đây là phần extends của con + cha;
            //QUay lại câu chuyện, đua là đua ko cần hỏi han làm chi.
            
            public static final double MAX_SPEED = 50.0;
            
            @Override
            public double runToDead() {
                return new Random().nextDouble()*MAX_SPEED * 3;
            }

            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%4.1f|\n",
                                    "MERMAID-Racer",  runToDead());
            }
        }; //VIP
            
    }
    
    public static void playWithAno(){
        Pet xxx = new Pet("unknow animal", 2002, 3.0) {
            
            //Đây là phần anonysm class
            @Override
            public double run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
            @Override
            public void showRecord() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
    }
}
