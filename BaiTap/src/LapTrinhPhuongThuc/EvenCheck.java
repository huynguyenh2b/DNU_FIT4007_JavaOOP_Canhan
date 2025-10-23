package LapTrinhPhuongThuc;
import java.util.Scanner;

public class EvenCheck {

    // Phương thức kiểm tra số chẵn
    public static boolean isSoChan(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        if (isSoChan(n)) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }
    }
}