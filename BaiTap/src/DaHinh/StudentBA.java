package DaHinh;

import java.util.Scanner;

public class StudentBA extends Student {
    private float scorePM; // Quản lý dự án
    private float scoreBA; // Phân tích kinh doanh

    public StudentBA() {
        super();
    }

    public StudentBA(String studentID, String name, int age, float scorePM, float scoreBA) {
        super(studentID, name, age);
        this.setScorePM(scorePM); // Dùng setter
        this.setScoreBA(scoreBA); // Dùng setter
    }

    public float getScorePM() {
        return scorePM;
    }

    public void setScorePM(float scorePM) {
        if (scorePM >= 0 && scorePM <= 10) {
            this.scorePM = scorePM;
        } else {
            this.scorePM = 0;
        }
    }

    public float getScoreBA() {
        return scoreBA;
    }

    public void setScoreBA(float scoreBA) {
        if (scoreBA >= 0 && scoreBA <= 10) {
            this.scoreBA = scoreBA;
        } else {
            this.scoreBA = 0;
        }
    }

    // --- Ghi đè (Overriding) ---
    @Override
    public String toString() {
        return super.toString() + // Gọi phương thức của lớp cha
                ", scorePM=" + scorePM +
                ", scoreBA=" + scoreBA +
                ", avg=" + calculateAverage() + // Thêm điểm trung bình
                ", type=BA]"; // Thêm loại
    }

    @Override
    public void input(Scanner sc) {
        System.out.println("--- Nhập thông tin Sinh viên BA ---");
        super.input(sc); // Gọi input của cha

        System.out.print("Nhập điểm Quản lý dự án (PM): ");
        this.setScorePM(sc.nextFloat());

        System.out.print("Nhập điểm Phân tích kinh doanh (BA): ");
        this.setScoreBA(sc.nextFloat());
        sc.nextLine(); // Tiêu thụ newline
    }

    @Override
    public Student copyObject() {
        return new StudentBA(this.getStudentID(), this.getName(), this.getAge(), this.scorePM, this.scoreBA);
    }

    @Override
    public float calculateAverage() {
        return (this.scorePM + this.scoreBA) / 2;
    }
}
