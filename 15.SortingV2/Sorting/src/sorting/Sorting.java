/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author LENOVO
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sortPriArr();
    }
    public static void sortPriArr(){
         //int [] arr = new int[]{1, -1, 5, 10, -15, -200}; 
        //2 cách viết code này như nhau
        int arr[] = {1, -1, 5, 10, -15, -200};
        System.out.println("Default sorting accending");
        for (int i : arr) 
            System.out.print(i+" ");
        System.out.println(" ");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <   arr.length; j++) {
                if(arr[j] < arr[i]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println("After Soring: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    
    }
    
}
