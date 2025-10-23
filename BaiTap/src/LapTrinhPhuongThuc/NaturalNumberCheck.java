package LapTrinhPhuongThuc;
import java.util.Scanner;

public class NaturalNumberCheck {

    // Phương thức kiểm tra, trả về true (đúng) hoặc false (sai)
    public static boolean isSoTuNhien(int n) {
        return n >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        if (isSoTuNhien(n)) {
            System.out.println(n + " là số tự nhiên.");
        } else {
            System.out.println(n + " không phải là số tự nhiên.");
        }
    }
}