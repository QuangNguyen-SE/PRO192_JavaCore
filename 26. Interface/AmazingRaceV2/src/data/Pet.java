/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author LENOVO
 */
public abstract class Pet{
    protected String name;
    protected int yob;
    protected double weigth;

    public Pet(String name, int yob, double weigth) {
        this.name = name;
        this.yob = yob;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
    
    
    
    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", yob=" + yob + ", weigth=" + weigth + '}';
    }
    
    //Class riêng của hàm pet
    public void unknowPet(){
        System.out.println("Unknow no-name pet");
    }
    
    //Class con kế thừa class pet sẽ phải triển khai 2 hàm này ko thì abstract như class Pet
    public abstract double run();
    public abstract void showRecord();
    //Đã là abstract sẽ ko có chuyện static xảy ra
    //Static là vùng nhớ dùng chung nếu hàm đó static thì chết mẹ r
    //các class dùng chung 1 vùng nhớ à
    // class ko new đc gọi thẳng là class static 
    
}
