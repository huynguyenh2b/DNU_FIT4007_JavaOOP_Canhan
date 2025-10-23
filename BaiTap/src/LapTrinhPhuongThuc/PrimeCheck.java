package LapTrinhPhuongThuc;
import java.util.Scanner;

public class PrimeCheck {

    // Phương thức kiểm tra số nguyên tố
    public static boolean isSoNguyenTo(int n) {
        // 1. Xử lý các trường hợp cơ bản
        if (n < 2) {
            return false; // Số < 2 không phải số nguyên tố
        }

        // 2. Duyệt từ 2 đến căn bậc hai của n
        // (Chỉ cần duyệt đến căn bậc 2 là đủ)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Có ước số -> không phải SNT
            }
        }

        return true; // Không tìm thấy ước nào -> là SNT
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        if (isSoNguyenTo(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
    }
}