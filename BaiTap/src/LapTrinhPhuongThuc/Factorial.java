package LapTrinhPhuongThuc;
import java.util.Scanner;

public class Factorial {

    // Phương thức tính giai thừa, dùng long để tránh tràn số
    public static long tinhGiaiThua(int n) {
        if (n < 0) {
            return -1; // Không tính giai thừa số âm
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        long ketQua = 1;
        for (int i = 2; i <= n; i++) {
            ketQua *= i;
        }
        return ketQua;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();

        long ketQua = tinhGiaiThua(n);
        System.out.println(n + "! = " + ketQua);
    }
}