
import java.util.Scanner;

public class ViDu9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b (khác 0): ");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("Không thể chia cho 0!");
        } else {
            double kq = (double)a / (double)b;
            System.out.println(a + " / " + b + " = " + kq);
        }

    }
}
