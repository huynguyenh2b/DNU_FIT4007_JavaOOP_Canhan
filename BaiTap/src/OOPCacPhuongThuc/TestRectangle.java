package OOPCacPhuongThuc;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(7, 7);

        System.out.println("--- Hình 1 ---");
        System.out.println(rect1);
        System.out.println("Diện tích: " + rect1.getArea());
        System.out.println("Chu vi: " + rect1.getPerimeter());
        System.out.println("Là hình vuông? " + rect1.isSquare());

        System.out.println("\n--- Hình 2 ---");
        System.out.println(rect2);
        System.out.println("Diện tích: " + rect2.getArea());
        System.out.println("Chu vi: " + rect2.getPerimeter());
        System.out.println("Là hình vuông? " + rect2.isSquare());
    }
}
