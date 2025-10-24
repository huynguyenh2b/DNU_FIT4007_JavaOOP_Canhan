package TruuTuong;

import java.util.Scanner;

public abstract class Student {
    private String masv;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    // Getters & Setters
    public String getMasv() { return masv; }
    public void setMasv(String masv) { this.masv = masv; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    /**
     * Phương thức 'input' này là phương thức cụ thể (concrete).
     * Các lớp con có thể @Override (ghi đè) nó để thêm hành vi.
     */
    public void input(Scanner sc) {
        System.out.print("Nhập Mã SV: ");
        this.masv = sc.nextLine();
        System.out.print("Nhập Tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập Tuổi: ");
        this.age = sc.nextInt();
        sc.nextLine(); // Tiêu thụ newline
    }

    // --- Phương thức trừu tượng ---
    // Bắt buộc lớp con phải định nghĩa lại (implement)

    public abstract String toString();
    public abstract float calculateAverage();
}
