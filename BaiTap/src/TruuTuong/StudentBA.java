package TruuTuong;

import java.util.Scanner;

public class StudentBA extends Student {
    private float scorePm; // Quản lý dự án
    private float scoreBA; // Quản trị kinh doanh

    public StudentBA() {
        super();
    }

    public StudentBA(String masv, String name, int age, float scorePm, float scoreBA) {
        super(masv, name, age);
        this.scorePm = scorePm;
        this.scoreBA = scoreBA;
    }

    // Getters & Setters
    public float getScorePm() { return scorePm; }
    public void setScorePm(float scorePm) { this.scorePm = scorePm; }
    public float getScoreBA() { return scoreBA; }
    public void setScoreBA(float scoreBA) { this.scoreBA = scoreBA; }

    // --- Ghi đè các phương thức ---

    @Override
    public void input(Scanner sc) {
        System.out.println("--- Nhập thông tin Sinh viên BA ---");
        super.input(sc); // Gọi input của cha
        System.out.print("Nhập điểm Quản lý dự án (PM): ");
        this.scorePm = sc.nextFloat();
        System.out.print("Nhập điểm Quản trị kinh doanh (BA): ");
        this.scoreBA = sc.nextFloat();
        sc.nextLine(); // Tiêu thụ newline
    }

    @Override
    public String toString() {
        return "StudentBA[" +
                "masv='" + getMasv() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", scorePm=" + scorePm +
                ", scoreBA=" + scoreBA +
                ", avg=" + calculateAverage() +
                ']';
    }

    @Override
    public float calculateAverage() {
        return (this.scorePm + this.scoreBA) / 2;
    }
}
