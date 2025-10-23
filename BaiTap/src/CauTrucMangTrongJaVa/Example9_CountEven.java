package CauTrucMangTrongJaVa;
import java.util.Scanner;

public class Example9_CountEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) count++;
        }
        System.out.println("Số lượng số chẵn: " + count);
    }
}