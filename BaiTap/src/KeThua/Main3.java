package KeThua;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cho phép nhập vào một đối tượng sinh viên
        Student sv1 = new Student();
        sv1.input(sc);

        System.out.println("\n-----------------------------");

        // In ra thông tin của sinh viên đó
        System.out.println("Thông tin sinh viên: " + sv1.toString());

        // Kiểm tra xem sinh viên đó có đủ 18 tuổi không?
        if (sv1.checkAge(18)) {
            System.out.println("Sinh viên đã đủ 18 tuổi.");
        } else {
            System.out.println("Sinh viên chưa đủ 18 tuổi.");
        }

        // In ra tên viết hoa của sinh viên đó
        System.out.println("Tên viết hoa: " + sv1.getUpperName());

        // Kiểm tra sinh viên đó có phải có mã sinh viên bắt đầu bằng 23IT không?
        if (sv1.checkStudentId()) {
            System.out.println("Mã SV hợp lệ (bắt đầu bằng 23IT).");
        } else {
            System.out.println("Mã SV không hợp lệ.");
        }

        sc.close();
    }
}