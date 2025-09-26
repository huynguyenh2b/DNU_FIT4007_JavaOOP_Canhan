import java.util.Scanner;

public class DivisorMultipleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập số c: ");
        int c = scanner.nextInt();

        if (a % b == 0 && b % c == 0) {
            System.out.println("b đồng thời là ước của a và là bội của c.");
        } else {
            System.out.println("b KHÔNG đồng thời là ước của a và là bội của c.");
        }

        scanner.close();
    }
}