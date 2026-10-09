/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class DogList {
    Scanner sc= new Scanner(System.in);
    HashMap<Integer, Dog> h;
    // Map là 1 dạng table có 2 cột khóa chính
    //............................//
    //.   KEY       .   VALUE    .//
    //.             .            .//
    //............................//
    // đc gọi là KEY-VALUE 
    //Khai báo HashMap <Key, VALUE>
    //key chính là chìa khóa, còn gọi là đg dẫn để tìm tới value bên trong
    //Key ko đc phép đặt trùng, và nó luôn luôn mặc định là kiểu OBJ
    //Ép kiếu trc khi dùng
    //ở đây đã ép kiểu thành integer
    //Các Key hay còn gọi là khóa chính, mà khóa chính thì ko đc phép trùng nhau như tập hợp set
    
    public DogList(){
        h=new HashMap();
    }
    
    public void addDog(Dog d){
        h.put(d.id, d);
    }
    
    public void displayAll(){
        Collection<Dog> tmp = h.values();
        for (Dog dog : tmp) {
            System.out.println(dog);
        }
    }
    
    public Dog searchDog(int id){
        return h.get(id); //get id nay la get key
    }
    
    public Dog searchDog(String name){
        Dog curr;
        for (int i=0; i<h.size();i++){
            curr=searchDog(i);
            if(curr.name.trim().equalsIgnoreCase(name))
                return curr;
        }        
        return null;
    }
    
    public Dog SearchDog(Dog dog){
        Dog  curr;
        for (int i=0; i<h.size();i++){
            curr=searchDog(i);
            if(curr==dog)
                return curr;
        }        
        return null;
    }
    
    public void updateDog(int id){
        System.out.println("Choose menu update");
        int choice = 0;
        choice = sc.nextInt();
        switch(choice){
            case 1:{
                updateId(id);
            }
            case 2:{
                updateName(id);
            }
            default:{
                System.out.println("Out of choice");
            }
        }
    }
    

    private void updateId(int id) {
        int re;
        re=sc.nextInt();
        h.get(id).setId(re);
    }
    
    
    
    private void updateName(int id) {
        
    }
    
}
