/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofile;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class DogList {
    /*
    **HashMap <Integer, Dog> h= new HashMap();** 
    ko nên khai báo new như thế này
    mà phải để new ở trong constructor sẽ hay hơn!!!
    vì khi chúng ta khai báo class DogList nếu gán new ở trên, thì vùng nhớ new sẽ đc khai sinh ra
    nma đôi khi ta chỉ cần 1 con trỏ mang hàm DogList mà thôi, vì vậy sẽ tốn vùng nhớ nhiều hơn
    */
    HashMap<Integer, Dog> hMap;

    public DogList() { //Null contructor, phễu rỗng là phễu ko thêm bất cứ cái gì vô
        hMap=new HashMap();
    }
    
    public void addDog (Dog dog){
        hMap.put(dog.iDNumber, dog);
    }
    
    public Dog searchDog(int id){
        return hMap.get(id);
    }
    
    public Dog searchDog(String name){
        Dog curr;
        for (int i=0; i<hMap.size();i++){
            curr=searchDog(i);
            if(curr.name.trim().equalsIgnoreCase(name))
                return curr;
        }        
        return null;
    }
    
    public Dog SearchDog(Dog dog){
        Dog  curr;
        for (int i=0; i<hMap.size();i++){
            curr=searchDog(i);
            if(curr==dog)
                return curr;
        }        
        return null;
    }
    
    
}
