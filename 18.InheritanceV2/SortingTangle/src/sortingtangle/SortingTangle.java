/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtangle;
import data.DTangle;
import data.Tangle;
import data.TangleMSG;
/**
 *
 * @author LENOVO 
 */
public class SortingTangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TangleMSG tangle= new TangleMSG();
         int choice;
        int size =10;
        int count=0;
        String[] option = {"1-Add Normal tangle\n"+ "2-Dtangle\n"+ "3-Show\n" + "4-Sorting\n" + "5-Quit\n"};
        Menu menu = new Menu();
        
        do{
            System.out.println("");
            System.out.println("------Menu------");
            choice = menu.getOption(option);
            switch(choice){
                    case 1:
                       tangle.inputNormalTangle();
                       break;
                    case 2:
                        tangle.inputDTangle();
                        break;
                    case 3:
                        tangle.display();
                        break;
                    case 4:
                        tangle.sortingArea();
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
   

