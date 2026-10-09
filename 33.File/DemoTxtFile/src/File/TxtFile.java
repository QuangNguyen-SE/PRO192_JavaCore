/*
    Trong java có 2 file chính:
        1.Text file (file văn bản)
            -Ưu điểm: có thể chỉnh sửa trực tiếp trong file.txt
                    dễ sử dụng
            -Nhược điểm: không bảo mật thông tin vì mở ra xem là lộ
        2. Binary file (File nhị phân)
            -Ưu điểm: bảo mật thông tin trong file cao, vì các thông tin sẽ được
                    chuyển đổi thành nhị phân code
            -Nhược điểm: không chỉnh sửa trực tiếp trong file được, phải mở source ra sửa
                        Khó chỉnh sửa và dễ sai cú pháp trong quá trình chỉnh sửa
 */
package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Nên học các cách xử lí chuỗi (String, StringBuilder) trong JAVA trước khi chơi với FILE
 * Vì File đòi hỏi xử lí Chuỗi rất nhiều
 * Học WrapperClass, Collections Framework đi kèm.
 */
public class TxtFile {
   /*
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
    
    public static String readFromFile() throws IOException{
        String message="";
        //Bước 1: Tạo 1 obj file truyền url hoặc tên file vào
        File file = new File("demoFile.txt");
            //Nếu file này đã tồn tại, nó sẽ lấy file đó
            //Nếu file không tồn tại, nó sẽ tự tạo ra file đó trong folder của project này
            
        //Bước 2: Gọi FileReader
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            //FileReader là 1 thằng biên dịch, lấy data từ text file dịch qua code
            //Đây là class hỗ trợ các hàm tiện ích khi xử lí file
            //Nhưng nó chỉ xử lí TEXT FILE.
            
            //Bước 3: gọi BufferedReader để sử dụng các class tiện ích hỗ trợ trong file
            BufferedReader br = new BufferedReader(fr);
            
            while(br.ready()){ 
                //br.ready() là nó đọc 1 chuỗi kí tự đến khi gặp \n là nó sẽ chạy 1 vòng lặp khác
                //Nó sẽ chạy tới khi gặp EOF
                
                message = br.readLine(); // Br.readLine nó sẽ đọc 1 chuỗi kí tự đến \n
                //đọc từng dòng
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TxtFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return message;
    }
    
    public static void writeToFile(String message){
        //Bước 1: Tạo file object, luôn luôn tạo File OBJ khi chơi với File
        File file = new File("demoFile.txt");
        try {
            //Bước 2: Tạo fileWritter, có file reader thì sẽ có file writer
            //Nhưng ta có thể thay thế nó bằng PrintWriter
            //FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(file);
            pw.println(message); // Đây là class hỗ trợ ghi từng dòng chuỗi vào file
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TxtFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
