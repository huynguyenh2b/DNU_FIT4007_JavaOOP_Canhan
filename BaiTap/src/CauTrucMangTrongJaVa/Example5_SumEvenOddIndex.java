package CauTrucMangTrongJaVa;
import java.util.Scanner;

public class Example5_SumEvenOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i % 2 != 0 && a[i] % 2 == 0) sum += a[i];
        }
        System.out.println("Tổng các phần tử chẵn ở chỉ số lẻ: " + sum);
    }
}