/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytoy;
import data.Toy;
/**
 *
 * @author LENOVO
 */
public class Store {
    Node head, tail; // Obj's pointer
    
    Store(){
        head=tail=null;
    }
    
    boolean isEmptyList(){
        return head==null;
    }
    
    public void openStore(){
        if(isEmptyList())
            System.out.println("List is empty");
        
        Node train=head;
        while(train != null){
            System.out.println(train.info);
            train=train.next;
        }
    }
    
    public void add(Toy x){
        
        Node node=new Node(x);
        
        if(isEmptyList())
            head=tail=node;
        
        tail.next=node;
        tail=node;
    }
    
    public void insertFirst(Toy x){
        if(isEmptyList())
            System.out.println("List is empty");
        Node node=new Node(x);
        node.next=head;
        head=node;
    }
    
    public void insertLast(Toy x){
        add(x);
    }
}
