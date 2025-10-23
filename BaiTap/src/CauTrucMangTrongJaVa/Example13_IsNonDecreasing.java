package CauTrucMangTrongJaVa;
import java.util.Scanner;

public class Example13_IsNonDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean nonDecrease = true;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                nonDecrease = false;
                break;
            }
        }
        if (nonDecrease) System.out.println("Mảng không giảm");
        else System.out.println("Mảng không thỏa mãn điều kiện không giảm");
    }
}