import java.util.Scanner;

public class SquareChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        if (chieuDai == chieuRong) {
            System.out.println("Đây là hình vuông.");
        } else {
            System.out.println("Đây là hình chữ nhật (không phải hình vuông).");
        }

        scanner.close();
    }
}