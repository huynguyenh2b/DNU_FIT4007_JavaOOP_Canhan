import java.util.Scanner;

public class TimeIncrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giờ (0-23): ");
        int h = scanner.nextInt();

        System.out.print("Nhập phút (0-59): ");
        int m = scanner.nextInt();

        if (h < 0 || h > 23 || m < 0 || m > 59) {
            System.out.println("Thời gian không hợp lệ!");
            return;
        }

        m = m + 1;

        if (m == 60) {
            m = 0;
            h = h + 1;

            if (h == 24) {
                h = 0;
            }
        }

        System.out.printf("Thời gian sau 1 phút: %02d:%02d", h, m);

        scanner.close();
    }
}