package DaHinh;

import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String studentID;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student[" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age;
        // Dấu ']' sẽ được thêm bởi các lớp con
    }

    public void input(Scanner sc) {
        System.out.print("Nhập Mã SV: ");
        this.studentID = sc.nextLine();
        System.out.print("Nhập Tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập Tuổi: ");
        this.age = sc.nextInt();
        sc.nextLine(); // Tiêu thụ newline
    }

    // Ghi đè equals() để so sánh 2 sinh viên dựa trên studentID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentID, student.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    // --- Nạp chồng (Overloading) ---
    public void incAge() {
        this.age++;
    }

    public void decAge() {
        this.age--;
    }

    public void incAge(int n) {
        this.age += n;
    }

    public void decAge(int n) {
        this.age -= n;
    }
    // ---------------------------------

    public Student copyObject() {
        return new Student(this.studentID, this.name, this.age);
    }

    /**
     * Phương thức này sẽ được ghi đè bởi các lớp con.
     * Đây là mấu chốt để sắp xếp đa hình trong StudentManager.
     */
    public float calculateAverage() {
        return 0.0f;
    }
}
