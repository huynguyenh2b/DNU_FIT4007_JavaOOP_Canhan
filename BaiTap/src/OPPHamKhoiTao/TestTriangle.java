package OPPHamKhoiTao;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(); // Tam giác đều 1.0
        Triangle t2 = new Triangle(3, 4, 5); // Tam giác vuông

        System.out.println("Tam giác 1: " + t1);
        System.out.println("Tam giác 2: " + t2);
    }
}