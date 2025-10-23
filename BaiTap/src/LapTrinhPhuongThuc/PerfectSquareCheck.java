package LapTrinhPhuongThuc;
import java.util.Scanner;

public class PerfectSquareCheck {

    // Phương thức kiểm tra số chính phương
    public static boolean isChinhPhuong(int n) {
        if (n < 0) {
            return false;
        }
        if (n == 0) {
            return true;
        }

        // Lấy căn bậc 2
        double sqrt = Math.sqrt(n);

        // Kiểm tra xem căn bậc 2 có phải là số nguyên không
        // Bằng cách so sánh nó với phiên bản làm tròn xuống (floor)
        return (sqrt == Math.floor(sqrt));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (isChinhPhuong(n)) {
            System.out.println(n + " là số chính phương.");
        } else {
            System.out.println(n + " không phải là số chính phương.");
        }
    }
}
