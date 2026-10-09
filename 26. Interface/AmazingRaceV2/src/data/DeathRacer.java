/*
 Interface: là nơi tập hợp những người chung tiếng nói, hành động, giao tiếp
Cũng là hình thức gom khuôn, tập hơn các OBJ phân loại về cái gì đó, nhóm gì đó
LỎNG LẺO hơn KẾ THỪA (INHERITANCE)
vì nó ko care phần đặc điểm, di truyền dd, 
CHUNG HÀNH ĐỘNG THÌ VÀO ĐÂY CHƠI CHUNG

Motor, Dog, Cat,... IS A MEMBER OF A DEADRACER

chỉ nên chứa hành động của 1 obj !!!
 */
package data;

/*
INTERFACE là dạng class "CHA" đặc biệt, gom những đứa "Con" ko quan tâm nguồn gốc
chỉ quan tâm chung lí tưởng, hành động, giao tiếp.

Là hình thức như 1 băng nhóm xã hội đen, câu lạc bộ ăn chơi.

Chỉ chứa hàm Abstract (trước JDK 8).
(Sau JDK 9 trở lên, đc phép chứa private, hàm có code, nma khai báo phải để kiểu default, hoặc static)
vidu: "default public void...." "static void ...."

Không tạo constructor cho interface.

Biến, field trong interface MẶC ĐỊNH là 
"PUBLIC STATIC FINAL" và phải đc gán ngay giá trị khi khai báo.
vì Interface ko quan tâm các đặc điểm của sub-class.
 */



public interface DeathRacer {
    
    
    
    //interface mặc định là clb 
    //Clb có nội quy chung-ngầm hiểu là interface là abstract
    //Ko nên tư hữu hóa cái gì ở đây hết vì nó là clb chung cho các thành viên
    //(Ko nên tư hữu hóa : static/abstract 
    //Static là rất chung và giống nhau
    //abstract là chung nhưng vẫn có cá tính riêng
    
    /*
    Interface trong java là 1 class đặc biệt chỉ có các abstract methods và constant value (hằng số)
    Tất cả các hằng số được mặc định là ở dạng "public static final" và phải gắn ngay giá trị
    Tất cả các method đều ở dạng PUBLIC ABSTRACT ngay cả khi ko khai báo nó cũng mặc định
    Tương tự như lớp abstract đều ko thể khởi tạo bên trong
    
    Mục đích của Interface là gom nhóm những thằng ko liên quan lại thành cùng 1 nhóm
        Thuận tiện cho việc sắp xếp trong mảng, Khởi tạo biến con trỏ = new những thằng con mà đã đc implements nó
    
    Tối ưu code và thiết kế đơn giản hơn
        có chung hành động thì dùng interface (implements)
        có chung thuộc tính và hành vi thì dùng inheritance (extends)
    
    */
    
    //public abstract double runToDead();
    public double runToDead(); 
    
    // ko cần từ khóa "abstract" vì mặc định nó là abstract
    public void showHowToDead();
    
}




















