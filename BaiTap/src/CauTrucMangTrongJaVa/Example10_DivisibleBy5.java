package CauTrucMangTrongJaVa;
import java.util.Scanner;

public class Example10_DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean found = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 5 == 0) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) System.out.println("Không tồn tại phần tử nào chia hết cho 5");
    }
}