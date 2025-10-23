package OOPCacPhuongThuc;

public class TestSquare {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        Square s2 = new Square(5.5);

        System.out.println("--- Hình 1 ---");
        System.out.println(s1);
        System.out.println("Cạnh là số nguyên? " + s1.isIntegerSquareSide());

        System.out.println("\n--- Hình 2 ---");
        System.out.println(s2);
        System.out.println("Cạnh là số nguyên? " + s2.isIntegerSquareSide());
    }
}
