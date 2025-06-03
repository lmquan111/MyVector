package hus.oop.vector;
import java.util.Random;

public class TestVector {
    private MyVector vector;

    public TestVector(MyVector vector) {
        this.vector = vector;
    }

    public static void main(String[] args) {
        /* TODO
           - Thực hiện các hàm test.
           - Lưu các kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_Vector>.txt
             (ví dụ NguyenVanA_123456_Vector.txt). Nén các file source code và file kết quả vào file zip có tên
             <Ten_MaSinhVien_Vector>.zip (ví dụ NguyenVanA_123456_Vector.zip), nộp lên classroom.
         */
    }

    public void testArrayVector() {
        /* TODO
         - Sinh ngẫu nhiên một số tự nhiên, lưu giá trị sinh ra vào biến n.
         - Tạo ra vector có kích thước n, với các phần tử được sinh ngẫu nhiên, lưu vào biến vector, sử dụng MyArrayVector.
         - Viết các các chứ năng của các vector, như thêm vào phần tử, xóa bớt phần tử, sửa giá trị các
           phần tử, cộng các vector, nhân vector với vô hướng, tích vô hướng 2 vector, chuẩn vector, ... Mỗi lần thay
           đổi vector hoặc tính toán, in các kết quả ra terminal.
        */

        Random rand = new Random();

        int n = rand.nextInt(10) + 1;
        System.out.println("Số phần tử của vector: " + n);


        MyArrayVector vector = new MyArrayVector();
        for (int i = 0; i < n; i++){

            double value = rand.nextDouble() * 10;
            vector.insert(value);

        }

        vector.remove(0);
        System.out.println("Sau khi xóa phần tử đầu tiên: " + vector.toString());

        if (vector.size() > 1) {
            vector.set(1, 42.42); 
            System.out.println("Sau khi sửa phần tử thứ 2 thành 42.42: " + vector.toString());
        }

        MyArrayVector vector2 = new MyArrayVector();
        for (int i = 0; i < vector.size(); i++){

            vector2.insert(rand.nextDouble() * 5);

        }
        System.out.println("Vector thứ hai: " + vector2.toString());

        
        MyArrayVector sum = vector.add(vector2);
        System.out.println("Tổng hai vector lưu ngoài: " + sum.toString());

        MyArrayVector sum = vector.addTo(vector2);
        System.out.println("Tổng hai vector lưu trong: " + vector.toString());

        MyArrayVector scaled = vector.scale(2.0);
        System.out.println("Vector nhân với 2.0: " + scaled.toString());

        System.out.println("Chuẩn (norm) của vector: " + vector.norm());

        System.out.println("Tích vô hướng với vector thứ hai: " + vector.dot(vector2));
    

    }

    public void testListVector() {
        /* TODO
         - Sinh ngẫu nhiên một số tự nhiên, lưu giá trị sinh ra vào biến n.
         - Tạo ra vector có kích thước n, với các phần tử được sinh ngẫu nhiên, lưu vào biến vector, sử dụng MyListVector.
         - Viết các các chứ năng của các vector, như thêm vào phần tử, xóa bớt phần tử, sửa giá trị các
           phần tử, cộng các vector, nhân vector với vô hướng, tích vô hướng 2 vector, chuẩn vector, ... Mỗi lần thay
           đổi vector hoặc tính toán, in các kết quả ra terminal.
         */

        Random rand = new Random();

        int n = rand.nextInt(10) + 1;
        System.out.println("Số phần tử của vector: " + n);


        MyArrayVector vector = new MyArrayVector();
        for (int i = 0; i < n; i++){

            double value = rand.nextDouble() * 10;
            vector.insert(value);

        }

        vector.remove(0);
        System.out.println("Sau khi xóa phần tử đầu tiên: " + vector.toString());

        if (vector.size() > 1) {
            vector.set(1, 42.42); 
            System.out.println("Sau khi sửa phần tử thứ 2 thành 42.42: " + vector.toString());
        }

        MyArrayVector vector2 = new MyArrayVector();
        for (int i = 0; i < vector.size(); i++){

            vector2.insert(rand.nextDouble() * 5);

        }
        System.out.println("Vector thứ hai: " + vector2.toString());

        
        MyArrayVector sum = vector.add(vector2);
        System.out.println("Tổng hai vector lưu ngoài: " + sum.toString());

        MyArrayVector sum = vector.addTo(vector2);
        System.out.println("Tổng hai vector lưu trong: " + vector.toString());

        MyArrayVector scaled = vector.scale(2.0);
        System.out.println("Vector nhân với 2.0: " + scaled.toString());

        System.out.println("Chuẩn (norm) của vector: " + vector.norm());

        System.out.println("Tích vô hướng với vector thứ hai: " + vector.dot(vector2));
    }
}
