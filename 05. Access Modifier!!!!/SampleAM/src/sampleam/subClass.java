/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleam;

import data.AccessModified;

/**
 *
 * @author LENOVO
 */
public class subClass extends AccessModified{

    public subClass(String pri, String def) {
        super(pri, def);
    }

    public void testAM(){
        //sub-class khac pakage vs parents class 
        //nhung bien protected van so dc
        // chi khi moi quan he cha-con thiet lap
        //thi ngoai cac bien pub ra thi ta choi dc voi cac bien pro
        pub=null;
        pro=null;
    }
    
   
        
        
    
            
}
