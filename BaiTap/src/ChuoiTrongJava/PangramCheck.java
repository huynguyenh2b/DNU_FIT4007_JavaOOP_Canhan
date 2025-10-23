package ChuoiTrongJava;
import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra pangram: ");
        String input = scanner.nextLine().toLowerCase();

        if (isPangram(input)) {
            System.out.println("Đây là chuỗi pangram.");
        } else {
            System.out.println("Đây không phải là chuỗi pangram.");
        }
    }

    public static boolean isPangram(String str) {
        if (str.length() < 26) {
            return false;
        }

        boolean[] alphabetCheck = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetCheck[c - 'a'] = true;
            }
        }

        for (boolean check : alphabetCheck) {
            if (!check) {
                return false;
            }
        }

        return true;
    }
}