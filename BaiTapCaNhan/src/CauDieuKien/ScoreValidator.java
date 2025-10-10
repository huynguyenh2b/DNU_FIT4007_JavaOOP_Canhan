package CauDieuKien;

import java.util.Scanner;

public class ScoreValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm số: ");
        double score = scanner.nextDouble();

        if (score >= 0 && score <= 10) {
            System.out.println("Điểm số hợp lý.");
        } else {
            System.out.println("Điểm số không hợp lý.");
        }

        scanner.close();
    }
}