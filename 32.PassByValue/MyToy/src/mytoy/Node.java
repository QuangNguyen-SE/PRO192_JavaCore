/*
BẢN CHẤT CON TRỎ VÀ PASS BY VALUE:
    Mọi con trỏ trong JAVA đều đc cấp phát 1 vùng nhớ chính là STACK
    STACK là nơi con trỏ lưu chính mình và địa chỉ của OBJ đang trỏ tới
    Địa chỉ OBJ đc nằm trên vùng nhớ HEAP
    
    
 */
package mytoy;

import data.Toy;

/*
Class con trỏ tức là sao?
    
    Class con trỏ dùng để tạo và lưu value, sẽ có 2 thành phần chính trong class con trỏ
    Được gọi là info(con trỏ obj) và next(con trỏ lưu con trỏ khác)
        Node ở đây là 1 biến con trỏ nma để lưu info của 1 obj 
        Next cũng là con trỏ nhưng lưu info của 1 obj khác
    Như 1 toa tàu
        Toa tàu sẽ có 1 khoan chứa hành khách và 1 cái móc nối tới toa khác
    
 */
public class Node {
    //trong bài này ta có biến obj là Toy
    Toy info;
    Node next;
    
    public Node() {
        // Phễu rỗng
    }
    
    public Node(Toy info){
        this(info, null); // Cái phễu đổ vào cái phễu, đúc 2 lần, Involking Contrustor
        // This(parameter1, parameter2); nhận 1 vật liệu đổ qua phễu khác thành 2 vật liệu.
    }
     
    public Node(Toy info, Node next) {
        this.info = info;
        this.next = next;
    }
    
}
