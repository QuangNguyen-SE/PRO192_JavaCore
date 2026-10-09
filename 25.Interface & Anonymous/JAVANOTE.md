# Ghi chú Java: Interface

## 1. Interface là gì

Interface là một **bản hợp đồng**: liệt kê các method mà class phải có, nhưng không viết cách làm. Mỗi class tự quyết định cách làm của mình.

```java
interface Animal {
    void sound();              // chỉ khai báo, không có { }
}

class Dog implements Animal {
    public void sound() {      // class tự viết phần thân
        System.out.println("Gâu gâu");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meo meo");
    }
}
```

- `interface` khai báo hợp đồng, `implements` là cam kết làm theo.
- Class phải cài đặt **đủ** mọi method trừu tượng, thiếu là lỗi biên dịch.
- Method cài đặt phải ghi `public` (vì method trong interface mặc định là `public`; nếu bỏ sẽ thành default, hẹp hơn nên báo lỗi).

## 2. Ứng dụng: viết code dùng chung cho nhiều loại

```java
static void makeSound(Animal a) {
    a.sound();                 // không cần biết là Dog hay Cat
}

makeSound(new Dog());   // Gâu gâu
makeSound(new Cat());   // Meo meo
```

Thêm `Bird` sau này chỉ cần viết class mới `implements Animal`, **không phải sửa `makeSound`** (đa hình).

Một biến kiểu interface chứa được mọi class implements nó:

```java
Animal a = new Dog();
a = new Cat();            // đổi loại, code phía dưới giữ nguyên
```

Một class implements được **nhiều** interface (Java không cho `extends` nhiều class):

```java
class Duck implements Flyable, Swimmable { ... }
```

Ứng dụng thực tế: thanh toán Momo/Visa, `List` (interface) với `ArrayList`/`LinkedList` (cách làm), callback và lambda, viết test bằng class giả, thống nhất hợp đồng khi làm việc nhóm.

## 3. Interface chứa được những gì

| Thành phần | Có thân `{ }`? | Từ khóa | Ghi chú |
|---|---|---|---|
| Method thường (abstract) | Không | Không cần | Tự động `public abstract`, class con **bắt buộc** viết |
| Hằng số | — | Không cần | Tự động `public static final`, phải gán giá trị ngay |
| `default` method (Java 8+) | Có | `default` | Class con dùng luôn hoặc ghi đè |
| `static` method (Java 8+) | Có | `static` | Gọi qua tên interface |
| `private` method (Java 9+) | Có | `private` | Dùng nội bộ trong interface |

```java
interface Payment {
    int MAX = 100;                       // hằng: public static final

    void pay(int amount);                // method thường: không thân

    default void printReceipt() {        // có thân → phải ghi default
        System.out.println("Cảm ơn bạn");
    }

    static void help() {                 // có thân, thuộc về interface
        System.out.println("Hướng dẫn");
    }
}
```

Không có trong interface: biến thường (thay đổi được), constructor, trạng thái riêng của từng object.

Method có thân mà **không** ghi `default`/`static` thì lỗi biên dịch:

```java
interface Payment {
    void pay(int amount) {      // ❌ lỗi
        ...
    }
}
```

### Vì sao phải có từ khóa `default`

- Trong interface, method không thân mặc định là "bắt buộc class con viết". `default` là tín hiệu đổi quy tắc: "method này có sẵn code, class con dùng luôn hoặc ghi đè".
- Lý do lịch sử: thêm method vào interface cũ (như `List.forEach` ở Java 8) mà không làm hỏng các class đã `implements` từ trước.

### `default` có phải static không?

**Không.** `default` là **instance method** (method của object): có `this`, gọi qua object, ghi đè được. Chỉ có **biến** trong interface là static ngầm.

| | `default` | `static` |
|---|---|---|
| Thuộc về | Object | Interface |
| Class con thừa hưởng / ghi đè | Có | Không |
| Cách gọi | `obj.printReceipt()` | `Payment.help()` |
| Có `this` | Có | Không |

### Vì sao không có `default static`

Hai từ khóa mâu thuẫn: `default` là "cách làm mặc định cho object, ghi đè được", `static` là "không gắn với object nào, không ghi đè được". Cùng lý do `abstract static` cũng không hợp lệ. Mỗi từ khóa đứng riêng thì đều hợp lý.

## 4. Interface có giống class thường không?

Gần giống abstract class hơn là class thường. Từ Java 8 interface có thể chứa code, nhưng vẫn khác ở các điểm cốt lõi:

| | Interface | Abstract class |
|---|---|---|
| Kế thừa | `implements` được nhiều interface | `extends` chỉ một |
| Trường dữ liệu | Chỉ là hằng | Có biến thường, có trạng thái |
| Constructor | Không | Có |
| Ý nghĩa | "Làm được gì" (`Flyable`, `Runnable`) | "Là cái gì" (`Animal`) |
| Mức truy cập member | Luôn `public` (trừ `private`) | Cả 4 mức |

`default` method không có biến riêng của object để dùng, nên chỉ làm việc thông qua các method khác của interface:

```java
interface Payment {
    int getBalance();
    void setBalance(int b);

    default void charge(int fee) {
        setBalance(getBalance() - fee);   // ✅ đi qua method
    }
}
```

## 5. Tạo object từ interface

`new Interface()` trơn thì **không** được. Nhưng `new Interface() { ... }` thì được, vì Java tạo một **anonymous class** implements interface đó:

```java
Operation a = new Operation();            // ❌ lỗi, interface không tạo trực tiếp được

Operation b = new Operation() {           // ✅ anonymous class
    @Override
    public int calc(int x, int y) {
        return x + y;
    }
};
```

Tương đương với việc tự viết `class TenAn implements Operation { ... }` rồi `new TenAn()`.

## 6. Interface + lambda + callback

Truyền hàm làm tham số trong Java phải thông qua interface, vì Java không có kiểu "hàm" độc lập. Interface chỉ có **đúng một** method trừu tượng gọi là *functional interface*, và dùng được lambda.

```java
interface Operation {
    int calc(int a, int b);
}

static int calc(int a, int b, Operation op) {
    return op.calc(a, b);
}

public static void main(String[] args) {
    System.out.println(calc(2, 3, (x, y) -> x + y));   // 5
    System.out.println(calc(2, 3, (x, y) -> x - y));   // -1
    System.out.println(calc(2, 3, (x, y) -> x * y));   // 6
}
```

Hiểu đơn giản:

```java
Operation op = (x, y) -> x + y;
op.calc(2, 3);   // 5
```

- `int calc(int a, int b);` chỉ là khai báo "hình dạng": nhận 2 `int`, trả 1 `int`, chưa có cách làm.
- Lambda `(x, y) -> x + y` là phần thân của `calc`: `x` là `a`, `y` là `b`.
- Tên `calc` do mình tự đặt, không phải built-in. Tên `x`, `y` cũng tùy ý, chỉ cần khớp **số lượng** và **kiểu** tham số.
- Có đúng một method trừu tượng nên Java biết lambda là thân của method nào.
- Muốn dùng lambda mà không tự khai báo, Java có sẵn `Runnable`, `Comparator`, `Function`, `Consumer`, `Supplier`, `Predicate`, `BinaryOperator`... (tên method trong đó do Java đặt, ví dụ `apply`, `test`, `run`).

### Vì sao không khai báo thẳng hàm tính toán mà phải qua interface

Khi viết tham số của `calc`, Java bắt buộc phải có **kiểu**. Method đứng một mình không phải kiểu, và Java không có kiểu `function`. Interface tạo ra cái **kiểu** đó:

```java
static int calc(int a, int b, Operation op)   // ✅ Operation là kiểu hợp lệ
```

Khi dùng lambda, không cần viết `implements`, Java tự tạo object implements giúp.

### Lỗi hay gặp: Java phân biệt hoa thường

`operation` (o thường) và `Operation` (O hoa) là hai tên khác nhau. Viết sai hoa thường thì Java đi tìm một `Operation` khác (có thể IDE tự import từ thư viện), nên gợi ý ra method không liên quan. Quy ước: tên class và interface viết hoa chữ cái đầu.

## 7. So với JavaScript

JS truyền thẳng hàm làm tham số, không cần interface:

```js
function calc(a, b, op) {
  return op(a, b);
}
calc(2, 3, (x, y) => x + y);   // 5
```

| JS | Java |
|---|---|
| Hàm là giá trị, truyền thẳng | Phải gói trong một functional interface |
| Gọi `op(a, b)` | Gọi `op.calc(a, b)` |
| `(x, y) => x + y` | `(x, y) -> x + y` |
| Không có `interface` (TypeScript mới có) | `interface` có sẵn |
