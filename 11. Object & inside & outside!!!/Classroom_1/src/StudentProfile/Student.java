/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentProfile;

/**
 *
 * @author LENOVO
 */
public class Student {
    private String name;
    private int yob;
    
    public Student(String name, int yob){
        this.name=name;
        this.yob=yob;
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
    public void showInfo(){
        System.out.printf("%-25s ||%4d\n", name, yob);
    }
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", yob=" + yob + '}';
    }
    
}
