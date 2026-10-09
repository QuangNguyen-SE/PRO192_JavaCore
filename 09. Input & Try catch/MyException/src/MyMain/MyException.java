/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMain;

/**
 *
 * @author LENOVO
 */
public class MyException extends Exception{

    public MyException(String mess) {
        super(mess); //truyen thong diep vao lop cha exception
        //boi vi ke thua exception cho nen la ko can phai tu tao exception rieng
        // nhung van co the tu tao exception
    }

    public MyException() {
    }

    public MyException(Throwable cause) {
        super(cause);
    }
    
}
