 /*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

//IMPORT LIB
import java.util.*;
import util.Validation;
import data.*;
//------//

public class main {
    
    public static void main(String[] args) {
    
        Cabinet se = new Cabinet();
        se.addAStudent();
        se.addAStudent();
        // search ko thay
        //se.searchAStudent();
        //search thay
        //se.searchAStudent();
        
        //update gpa
        se.updateGPA();
        
    }
    
}
