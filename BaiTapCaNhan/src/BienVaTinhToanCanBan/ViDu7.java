

import java.util.Scanner;

public class ViDu7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên N (ít nhất 2 chữ số): ");
        int n = sc.nextInt();
        if (Math.abs(n) < 10) {
            System.out.println("Số nhập vào phải có ít nhất 2 chữ số!");
        } else {
            int ganCuoi = Math.abs(n / 10 % 10);
            System.out.println("Chữ số gần cuối của " + n + " là: " + ganCuoi);
        }

    }
}
