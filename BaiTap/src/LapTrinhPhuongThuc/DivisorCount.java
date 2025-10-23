package LapTrinhPhuongThuc;
import java.util.Scanner;

public class DivisorCount {

    // Phương thức đếm số ước
    public static int demUocSo(int n) {
        if (n <= 0) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int n = scanner.nextInt();

        int soUoc = demUocSo(n);
        System.out.println("Số " + n + " có " + soUoc + " ước.");
    }
}