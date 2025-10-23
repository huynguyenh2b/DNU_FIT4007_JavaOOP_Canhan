package LapTrinhPhuongThuc;
import java.util.Scanner;

public class SumOfTwo {

    // Phương thức tính tổng, trả về kiểu int
    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        // Gọi phương thức và lưu kết quả
        int ketQua = tinhTong(a, b);

        System.out.println("Tổng của " + a + " và " + b + " là: " + ketQua);
    }
}