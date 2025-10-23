package LapTrinhPhuongThuc;
import java.util.Scanner;

public class GCD {

    // Phương thức tìm UCLN (sử dụng giải thuật Euclid)
    public static int timUCLN(int a, int b) {
        // Đảm bảo a, b là số dương
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        int ucln = timUCLN(a, b);
        System.out.println("UCLN của " + a + " và " + b + " là: " + ucln);
    }
}