package OOPCacPhuongThuc;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5); // Vuông
        Triangle t2 = new Triangle(5, 5, 6); // Cân
        Triangle t3 = new Triangle(7, 7, 7); // Đều
        Triangle t4 = new Triangle(1, 2, 5); // Không hợp lệ

        System.out.println("--- Tam giác 1 (3, 4, 5) ---");
        System.out.println("Diện tích: " + t1.getArea());
        System.out.println("Vuông? " + t1.isRightTriangle());
        System.out.println("Cân? " + t1.isIsoscelesTriangle());

        System.out.println("\n--- Tam giác 2 (5, 5, 6) ---");
        System.out.println("Diện tích: " + t2.getArea());
        System.out.println("Vuông? " + t2.isRightTriangle());
        System.out.println("Cân? " + t2.isIsoscelesTriangle());

        System.out.println("\n--- Tam giác 3 (7, 7, 7) ---");
        System.out.println("Diện tích: " + t3.getArea());
        System.out.println("Cân? " + t3.isIsoscelesTriangle());
        System.out.println("Đều? " + t3.isEquilateralTriangle());

        System.out.println("\n--- Tam giác 4 (1, 2, 5) ---");
        System.out.println("Diện tích: " + t4.getArea()); // Sẽ ra -1
    }
}