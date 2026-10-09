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

    /*
    Lưu ý ta có 3 cách khai báo obj có mang tính kế thừa
        1. Khai CHA new CHA (CHA đc trỏ vào mặt CHA)
        2. Khai CON new CON (CON đc trỏ vào mặt CON)
        3. Khai CHA new CON (CHA đc trỏ vào mặt CON)
    
    KO BAO GIỜ ĐƯỢC PHÉP KHAI CON NEW CHA (khai báo mất dạy) CON ko được nhảy lên đầu cha
                        "CON ko đc trỏ vào mặt CHA"
    vì vùng ram heap của CHA ko có vùng ram stack của con
    biến CON nếu new CHA thì sẽ bị dư thừa các HÀM của con vì nó ko dùng đc cho vùng ram HEAP của cha;
    new Parent sẽ ko bao giờ cần các HÀM của biến Child, vì nó ko có = ko tồn tại.
    như vậy thì biến con chấm sổ ra cái del gì khi new Parent ko cần hàm CON!!!
     */
    public static void main(String[] args) {
        playWithParentChild();
    }

    public static void playWithParentChild() {
//1. khai cha new cha        
        Parent p = new Parent("Mansion p", "!00BTC");
        p.showProfile();
        //Xổ ra cái gì là của cha, chỉ có cha mà thôi
        
//2. khai con new con
        Child c1 = new Child("Mansion c1", "100Eth", "c1 ");
        c1.showProfile();
        c1.sayHi();
        //Xổ ra cái của con và phần cha cho
        
        
//3. Khai cha new con
        Parent c2 = new Child("Mansion c2", "100$", "c2");
        c2.showProfile();
        //Được xem là cha nhưng thật ra là con;
        //Xổ ra cái gì của cha, nhưng cái của con thì bị che khuất 
        //(vì vùng ram của cha ko bao vùng ram của con, trong khi vùng ram của con lại bao cả cha)
        
        ////////RAM CỦA CON///////////
        //-----Vùng Ram của Cha-----//
        //                          //
        //      |Class CHA|         //      
        //      |.........|         //     vùng ram của con bao trọn của cha!!!
        //-----Vùng Ram của Cha-----//     cho nên khai CHA new CON thì sẽ ko thấy hàm của con
        //                          //     nhưng khai CON new CON sẽ thấy hết toàn bộ hàm của cha
        //      Class CON           //     @Override dùng để phân biệt hàm CON và CHA khi trùng tên
        //      |.......|           //
        ////////RAM CỦA CON///////////
        
        
        //Câu hỏi kiến thức: Vậy có cách nào để Khai Cha new Con nhưng vẫn thấy đc hàm của con?
        
        //Vậy kĩ thuật the dift con trỏ pointer ra đời
        //Chúng ta sẽ dùng biến tạm để kéo dãn con trỏ xuống đáy ram
        
        long c = 500000000L;
        Child tmp = (Child) c2;
        //BIẾN TẠM & Ép kiểu -> nới rộng vùng RAM ra.
        tmp.sayHi();
        
        // Hoặc // 
    
        ((Child)c2).sayHi(); // như new xong chấm luôn
        // và nếu ko  
        
    }
}
