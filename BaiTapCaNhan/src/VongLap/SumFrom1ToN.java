import java.util.Scanner;

public class SumFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();
        long sum = 0; // Use long to avoid overflow for large N

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum from 1 to " + n + " is: " + sum);
        scanner.close();
    }
}