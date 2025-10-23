package KeThua;

import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private String nameSchool;

    public Student() {
        super();
    }

    public Student(String name, int age, String address, String studentId, String nameSchool) {
        super(name, age, address);
        this.studentId = studentId;
        this.nameSchool = nameSchool;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    @Override
    public String toString() {
        return "Student[" +
                super.toString() +
                ", studentId='" + studentId + '\'' +
                ", nameSchool='" + nameSchool + '\'' +
                ']';
    }

    @Override
    public void input(Scanner sc) {
        System.out.println("Nhập thông tin sinh viên:");
        super.input(sc); // Nhập tên, tuổi, địa chỉ
        System.out.print("Nhập mã sinh viên: ");
        this.studentId = sc.nextLine();
        System.out.print("Nhập tên trường: ");
        this.nameSchool = sc.nextLine();
    }

    public boolean checkStudentId() {
        return this.studentId.startsWith("23IT");
    }
}