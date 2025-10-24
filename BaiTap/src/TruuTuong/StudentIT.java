package TruuTuong;


import java.util.Scanner;

public class StudentIT extends Student {
    private float scoreCpp;
    private float scoreJava;

    public StudentIT() {
        super();
    }

    public StudentIT(String masv, String name, int age, float scoreCpp, float scoreJava) {
        super(masv, name, age);
        this.scoreCpp = scoreCpp;
        this.scoreJava = scoreJava;
    }

    // Getters & Setters
    public float getScoreCpp() { return scoreCpp; }
    public void setScoreCpp(float scoreCpp) { this.scoreCpp = scoreCpp; }
    public float getScoreJava() { return scoreJava; }
    public void setScoreJava(float scoreJava) { this.scoreJava = scoreJava; }

    // --- Ghi đè các phương thức ---

    @Override
    public void input(Scanner sc) {
        System.out.println("--- Nhập thông tin Sinh viên IT ---");
        super.input(sc); // Gọi input của cha để nhập masv, name, age
        System.out.print("Nhập điểm C++: ");
        this.scoreCpp = sc.nextFloat();
        System.out.print("Nhập điểm Java: ");
        this.scoreJava = sc.nextFloat();
        sc.nextLine(); // Tiêu thụ newline
    }

    @Override
    public String toString() {
        return "StudentIT[" +
                "masv='" + getMasv() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", scoreCpp=" + scoreCpp +
                ", scoreJava=" + scoreJava +
                ", avg=" + calculateAverage() +
                ']';
    }

    @Override
    public float calculateAverage() {
        return (this.scoreCpp + this.scoreJava) / 2;
    }
}
