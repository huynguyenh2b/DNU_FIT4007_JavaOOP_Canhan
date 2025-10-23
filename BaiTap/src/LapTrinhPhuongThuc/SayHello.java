package LapTrinhPhuongThuc;
import java.util.Scanner;

public class SayHello {

    // Phương thức kiểu void, không trả về giá trị, chỉ thực hiện hành động
    public static void printHello(String ten) {
        System.out.println("Hello " + ten);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        // Gọi phương thức void
        printHello(ten);
    }
}