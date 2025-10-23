package OOPCacPhuongThuc;

import java.util.Scanner;

public class TestStudentInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student sv1 = new Student();

        System.out.println("Nhập thông tin cho sinh viên 1:");
        sv1.input(scanner); // Gọi hàm input

        System.out.println("Thông tin SV1 vừa nhập:");
        System.out.println(sv1);

        scanner.close();
    }
}
