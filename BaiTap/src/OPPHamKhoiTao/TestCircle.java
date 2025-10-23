package OPPHamKhoiTao;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        System.out.println("Hình tròn 1: " + c1);
        System.out.println("Hình tròn 2: " + c2);

        c1.setRadius(2.0);
        System.out.println("Bán kính mới của Hình tròn 1: " + c1.getRadius());
    }
}