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
public class DTangle extends Tangle{

    public DTangle(String name, double edge1, double edge3) {
        super(name, edge1, edge1, edge3);
    }
    
    @Override
    public void paint(){
        System.out.printf("Double Tangle ||%-25s||%-4.2f||", name, getArea());
    }
}
