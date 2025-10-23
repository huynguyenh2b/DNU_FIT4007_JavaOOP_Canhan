package OOPCacPhuongThuc;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);

        System.out.println(c1);
        System.out.printf("Diện tích: %.2f\n", c1.getArea());
        System.out.printf("Chu vi: %.2f\n", c1.getPerimeter());
    }
}
