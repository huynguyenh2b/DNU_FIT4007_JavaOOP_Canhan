import java.util.Scanner;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();
        boolean isPowerOfTwo = false;

        if (n <= 0) {
            isPowerOfTwo = false;
        } else {
            int temp = n;
            while (temp % 2 == 0) {
                temp /= 2;
            }
            // If it's a power of two, the loop will leave temp as 1
            if (temp == 1) {
                isPowerOfTwo = true;
            }
        }

        if (isPowerOfTwo) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
        scanner.close();
    }
}