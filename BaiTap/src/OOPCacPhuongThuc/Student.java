package OOPCacPhuongThuc;

import java.util.Scanner; // Cần Scanner

public class Student {
    private String masv;
    private String name;
    private int age;

    // Constructors
    public Student() {}
    public Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    // Getters/Setters (Bỏ qua cho ngắn gọn, nhưng vẫn nên có)

    // toString
    @Override
    public String toString() {
        return "Student[masv='" + masv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age + ']';
    }

    // --- PHƯƠNG THỨC MỚI ---

    /**
     * Phương thức cho phép nhập thông tin Student từ bàn phím.
     * @param sc Đối tượng Scanner để đọc input.
     */
    public void input(Scanner sc) {
        System.out.print("Nhập mã sinh viên: ");
        this.masv = sc.nextLine();

        System.out.print("Nhập tên sinh viên: ");
        this.name = sc.nextLine();

        // Dùng Integer.parseInt(sc.nextLine()) để tránh lỗi trôi lệnh
        System.out.print("Nhập tuổi: ");
        this.age = Integer.parseInt(sc.nextLine());
    }
}