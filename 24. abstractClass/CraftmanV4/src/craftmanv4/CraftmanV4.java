/*
Như ta biết trong vùng Ram của mối quan hệ Kế-Thừa 
vùng ram của con thực chất là 1 vùng ram siêu bự

RAM của con chứa RAM của cha và các phần mở rộng OVERRIDE
Điều này càng đúng nếu ta quan sát trong Class CHA có hàm abstract hay ko!!

tức là vùng ram của con chứa 1 phần ram của cha và các phần hàm đc OVERRIDE!!!


 */
package craftmanv4;
import data.*;
/**
 *
 * @author LENOVO
 */
public class CraftmanV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public static void playWithNormalShape(){
        Rectangle r1 = new Rectangle("1", "red", 2, 3);
    }
    // Vấn đề đặt ra: Nếu như hình đó ko phải là 1 hình học bth thì sao?
    //Vidu hình đồ thị hàm số của cons, sins, mà ko có templates nào phù hợp với nó
    
    // Liên tường 1 obj ko theo bất kì quy tắc của 1 class con nào 
    //nhưng vẫn là 1 phần của class cha
    
    
    public static void playWithUnKnowShape(){
    // ĐÂY ĐC XEM LÀ 1 CLASS BIẾN DỊ, ANONYSMUS CLASS, 1 CLASS RIÊNG BIỆT
    // DÀNH CHO CÁC OBJ KO CÓ TEMPLATES PHÙ HỢP NHUNG VẪN ĐC XEM LÀ 1 PHẦN CỦA CLASS CHA
    // CLASS NÀY VỀ CƠ BẢN GIỐNG NHƯ CÁC CLASS HCN, HV, HTRON,....
    
    //NHƯ ĐÃ NÓI CLASS CON BAO GỒM CLASS CHA + OVERRIDE / ABSTRACT CLASS / EXTEND CLASS
    // VÀ ĐÂY ĐC XEM LÀ 1 CLASS CON RƠI
        Shape didang = new Shape("Hinh Do Thi", "red") {
            public double speed; // khai báo biến y chang như 1 class bth
            
            @Override
            public double getArea() {
                return 40;
            }
            
            @Override
            public void paint() {
                System.out.printf("%-10s|%-10s|%4.1f", "Di dang", owner, getArea());
            }
        }; //VIP : phải có dấu chấm phẩy vì nó đc xem là 1 câu lệnh
    }
    
    
}
