package VongLap;
import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        System.out.println("Even numbers less than or equal to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
        scanner.close();
    }
}