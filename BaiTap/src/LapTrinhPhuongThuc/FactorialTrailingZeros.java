package LapTrinhPhuongThuc;
import java.util.Scanner;

public class FactorialTrailingZeros {

    // Phương thức đếm số 0
    public static int demSo0TanCung(int n) {
        if (n < 0) {
            return 0;
        }

        int count = 0;
        // Lặp i = 5, 25, 125, ...
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int soSo0 = demSo0TanCung(n);
        System.out.println(n + "! có " + soSo0 + " chữ số 0 ở cuối.");
    }
}