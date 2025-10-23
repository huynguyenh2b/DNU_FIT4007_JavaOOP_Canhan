package LapTrinhPhuongThuc;
import java.util.Scanner;

public class SumOfSquares {

    // Phương thức tính tổng bình phương
    public static long tinhTongBinhPhuong(int n) {
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (long) i * i; // Ép kiểu long để tránh tràn số
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        long ketQua = tinhTongBinhPhuong(n);
        System.out.println("Tổng bình phương từ 1 đến " + n + " là: " + ketQua);
    }
}