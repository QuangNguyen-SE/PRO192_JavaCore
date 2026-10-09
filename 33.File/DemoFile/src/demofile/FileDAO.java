/*
Kiến thức cơ bản về FILE: 
File có 2 thành phần chính được gọi là: Write và Read
Cơ chế hoạt động của nó là:

**Write File** 
Khi chúng ta sử dụng câu lệnh Write FILE, ghi data vào tập tin tức là ta printf nó vô tập tin
Vậy Java sẽ giúp chúng ta tạo ra 1 vùng nhớ đệm gọi là FILE BUFFER, và STREAM là luồng DATA
FILE BUFFER giúp chúng ta ghi data theo 2 dạng CHARACTER hoặc NUMBER
STREAM sẽ xử lí tách luồng thông tin đó và đổi ra dạng NHỊ PHÂN (0 và 1) Binary File;
VÀ NÓ ĐƯỢC GỌI LÀ  q.trình SERIABLE (mã hóa);
sau đó đc JAVA tự động tạo file và lưu thông tin vào FILE, 1 cách tự động, JAVA CORE sẽ hiểu thêm

**READ FILE**
Ngược lại chúng ta sẽ lấy data từ file truyền vào máy
ngược lại với các quá trình ở trên
được gọi là DE-SERIABLE (giải mã)

*/
package demofile;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
/**
 *
 * @author LENOVO
 */
public class FileDAO {
    
    //SERIABLES
    public static void writeBinaryFile(String fileName, ArrayList<Dog> data) 
            throws Exception{
        
        FileOutputStream f = new FileOutputStream(fileName); //(mảng chuyển obj thành 1 dãy binary)
        ObjectOutputStream oFile = new ObjectOutputStream(f); //(mảng nhận tt của obj)
        /*
        Trong bộ nhớ đã tạo ra 2 mảng là FIleOutput và ObjectOutput
        ObjectOutput được dùng cho việc ghi các thông tin obj vào mảng
        và mảng đó sẽ tham chiếu tới mảng thứ 2 được gọi là File-Output
        mảng File-Output đc dùng để mã hóa SERIABLE các thông tin obj
        thành 1 dãy nhị phân phức tạp
        */
        
        oFile.writeObject(data);
        f.close(); oFile.close();
        
    }
    
    public static ArrayList readBinaryFile(String fileName)
            throws Exception {
        FileInputStream f = new FileInputStream(fileName);
        ObjectInputStream of = new ObjectInputStream(f);
        ArrayList<Dog> data = (ArrayList<Dog>)of.readObject();
        f.close();
        of.close();
        return data;
    }
    
    public static void writeTextFile(String filename, ArrayList<Dog> data) 
            throws Exception{
        PrintWriter w = new PrintWriter (filename);
        for (Dog dog : data) {
            w.print(dog.toString());
        }
        w.close();
    }
    
//    public static ArrayList<Dog> readTxtFile(String filename)
//            throws Exception{
//        FileReader f = new FileReader(filename);
//        BufferedReader bf = new BufferedReader(f);
//        ArrayList<Dog> list= new ArrayList();
//        while(bf.ready()){
//            String s=bf.readLine();
//            String[] tmp = s.trim().split("\\|");
//            
//            if(tmp.length == 2)
//                list.add(new Dog(Integer.parseInt(tmp[0].trim()),tmp[1].trim()));
//        }
//        return list;
//    }
    
    public static ArrayList<Dog> readTxtFile(String filename)
            throws Exception{
        FileReader f = new FileReader(filename);
        BufferedReader br = new BufferedReader(f);
        ArrayList<Dog> list= new ArrayList();
        String line="";
        line = br.readLine();
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
        String[] tmp = line.trim().split("\\|");    
        list.add(new Dog(Integer.parseInt(tmp[0].trim()),tmp[1].trim()));    
        }
        return list;
    }
}