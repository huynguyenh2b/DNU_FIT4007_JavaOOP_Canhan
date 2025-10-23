
package VongLap;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer N (1-9): ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= 9) {
            System.out.println("Multiplication table for " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Please enter a number between 1 and 9.");
        }
        scanner.close();
    }
}