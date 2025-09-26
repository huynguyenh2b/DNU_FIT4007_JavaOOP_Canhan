import java.util.Scanner;

public class NaturalNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên N: ");
        int n = scanner.nextInt();

        if (n >= 0) {
            System.out.println(n + " là số tự nhiên.");
        } else {
            System.out.println(n + " không phải là số tự nhiên.");
        }

        scanner.close();
    }
}