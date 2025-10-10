import java.util.Scanner;

public class FindSmallestN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer S: ");
        int s = scanner.nextInt();

        long sum = 0;
        int n = 0;

        while (sum <= s) {
            n++;
            sum += n;
        }

        System.out.println("The smallest N such that 1 + ... + N > " + s + " is: " + n);
        scanner.close();
    }
}