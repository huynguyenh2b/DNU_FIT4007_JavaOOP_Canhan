package CauTrucMangTrongJaVa;
import java.util.Scanner;

public class Example8_MaxAndCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0], count = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > max) max = a[i];
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == max) count++;
        }
        System.out.println("max = " + max + ", số lượng = " + count);
    }
}