package CauTrucMangTrongJaVa;
import java.util.Scanner;

public class Example6_FirstLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Phần tử đầu tiên: " + a[0]);
        System.out.println("Phần tử cuối cùng: " + a[n - 1]);
    }
}