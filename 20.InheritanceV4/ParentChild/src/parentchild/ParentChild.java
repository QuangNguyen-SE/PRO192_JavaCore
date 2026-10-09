/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentchild;

import data.Parent;
import data.Child;

/**
 *
 * @author LENOVO
 */
public class ParentChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithParentChild();
    }

    public static void playWithParentChild() {
        Parent p = new Parent("Mansion p", "!00BTC");
        p.showProfile();
        //Xổ ra cái gì là của cha, chỉ có cha mà thôi

        Child c1 = new Child("Mansion c1", "100Eth");
        c1.showProfile();
        c1.sayHi();
        //Xổ ra cái của con và phần cha cho

        Parent c2 = new Child("Mansion c2", "100$");
        c2.showProfile();
        //Được xem là cha nhưng thật ra là con;
        //Xổ ra cái gì của cha, nhưng cái của con thì bị che khuất
        
        
    }
}
