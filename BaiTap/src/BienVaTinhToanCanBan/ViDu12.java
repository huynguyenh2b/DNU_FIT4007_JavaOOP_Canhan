package BienVaTinhToanCanBan;
import java.util.Scanner;

public class ViDu12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);
    }
}
