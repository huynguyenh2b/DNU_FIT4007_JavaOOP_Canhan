package DaHinh;

import java.util.Scanner;

public class StudentIT extends Student {
    private float scoreCPP;
    private float scoreJava;

    public StudentIT() {
        super();
    }

    public StudentIT(String studentID, String name, int age, float scoreCPP, float scoreJava) {
        super(studentID, name, age);
        this.setScoreCPP(scoreCPP); // Dùng setter để validate
        this.setScoreJava(scoreJava); // Dùng setter để validate
    }

    public float getScoreCPP() {
        return scoreCPP;
    }

    public void setScoreCPP(float scoreCPP) {
        if (scoreCPP >= 0 && scoreCPP <= 10) {
            this.scoreCPP = scoreCPP;
        } else {
            this.scoreCPP = 0; // Giá trị mặc định nếu điểm không hợp lệ
        }
    }

    public float getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(float scoreJava) {
        if (scoreJava >= 0 && scoreJava <= 10) {
            this.scoreJava = scoreJava;
        } else {
            this.scoreJava = 0; // Giá trị mặc định
        }
    }

    // --- Ghi đè (Overriding) ---
    @Override
    public String toString() {
        return super.toString() + // Gọi phương thức của lớp cha
                ", scoreCPP=" + scoreCPP +
                ", scoreJava=" + scoreJava +
                ", avg=" + calculateAverage() + // Thêm điểm trung bình
                ", type=IT]"; // Thêm loại
    }

    @Override
    public void input(Scanner sc) {
        System.out.println("--- Nhập thông tin Sinh viên IT ---");
        super.input(sc); // Gọi input của cha để nhập ID, Tên, Tuổi

        System.out.print("Nhập điểm C++: ");
        this.setScoreCPP(sc.nextFloat()); // Dùng setter để validate

        System.out.print("Nhập điểm Java: ");
        this.setScoreJava(sc.nextFloat()); // Dùng setter để validate
        sc.nextLine(); // Tiêu thụ newline
    }

    @Override
    public Student copyObject() {
        return new StudentIT(this.getStudentID(), this.getName(), this.getAge(), this.scoreCPP, this.scoreJava);
    }

    @Override
    public float calculateAverage() {
        return (this.scoreCPP + this.scoreJava) / 2;
    }
}
