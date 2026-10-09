
package librirary;
import util.Validation;
import data.Shelf;
import data.Book;
/**
 *
 * @author LENOVO
 */
public class Librirary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        int size =10;
        int count=0;
        String[] option = {" 1-Add "+ "2-Search "+ " 3-Sorting " + "4-Show book " + "5-Quit"};
        Menu menu = new Menu();
        Shelf tuSE= new Shelf("Brown", "Se");
        
        do{
            System.out.println("");
            System.out.println("------Menu------");
            choice = menu.getOption(option);
            switch(choice){
                    case 1:
                       tuSE.inputBook();
                       break;
                    case 2:
                        tuSE.searchById();
                        break;
                    case 3:
                        System.out.println("Run");
                        break;
                    case 4:
                        tuSE.displayBook();
                        break;
                    case 5:
                        System.out.println("Quit success!!!");
                        break;
                    default:
                        throw new NumberFormatException("Can't");
            }
        }while(choice != 5);
    }
    
}
