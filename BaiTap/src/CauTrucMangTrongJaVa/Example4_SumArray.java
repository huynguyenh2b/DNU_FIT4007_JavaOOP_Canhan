package CauTrucMangTrongJaVa;
import java.util.Scanner;

public class Example4_SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Tổng mảng: " + sum);
    }
}