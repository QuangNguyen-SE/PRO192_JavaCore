/*
Các bước tạo ra Binary File
*/
package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BinaryFile {
    
    /*
        Để truyền các data vào binary file
        Ta cần khởi tạo 1 dòng tên là FileOutputStream
        Để đưa data vào Stream và từ đó dịch ra binary lưu trong file
    
    *Bước 1: của Text File | Binary File là giống nhau
        File file = new File("<tên-file>");
    
    *Bước 2:
        Action |   Text File       |   Binary File
       --------|-------------------|----------------------------        
       (Write) |   PrintWriter     |   FileOutputStream
       --------|-------------------|----------------------------    
       (Read)  |   FileReader      |   FileInputStream
    
    *Bước 3:
        Action |   Text File       |   Binary File
       --------|-------------------|----------------------------        
       (Write) |   PrintWriter     |   ObjectOutputStream
       --------|-------------------|----------------------------    
       (Read)  |   BufferedReader  |   ObjectInputStream
    */
    
    public static BinaryFile getInstance(){
        return new BinaryFile();
    }
    
    public void writeBinaryFile(String str){
        //Bước 1: Tạo ra File với câu lệnh tương tự như bên Text file
        File file = new File("demoBFile.txt");
        try {
            //Bước 2: Tạo 1 vùng ram bằng class FileOutputStream 
            //đưa dữ liệu vào Stream để dịch text thành binary
            FileOutputStream fos = new FileOutputStream(file);
            //------------------------------------------------//
            //Bước 3: Đưa dòng binary vào lại file
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(str);
            fos.close();
            oos.close();
            //-----------------------------------------------//
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String readBinaryFile(){
        String data="";
        File file = new File("demoBFile.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            data = (String)ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BinaryFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}
