package LapTrinhPhuongThuc;
import java.util.Scanner;

public class PangramCheck2 {

    // Phương thức kiểm tra Pangram
    public static boolean isPangram(String str) {
        String lowerStr = str.toLowerCase();

        // Nếu chuỗi ngắn hơn 26 ký tự, chắc chắn không phải
        if (lowerStr.length() < 26) {
            return false;
        }

        // Duyệt qua tất cả 26 chữ cái (a-z)
        for (char c = 'a'; c <= 'z'; c++) {
            // Nếu không tìm thấy 1 chữ cái nào
            if (lowerStr.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("Đây là chuỗi pangram.");
        } else {
            System.out.println("Đây không phải là chuỗi pangram.");
        }
    }
}