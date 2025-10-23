package OOPCacPhuongThuc;

public class Square {
    private double side;

    // Constructors
    public Square() { this.side = 1.0; }
    public Square(double side) { this.side = side; }

    // Getter/Setter
    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    // toString
    @Override
    public String toString() {
        return "Square[side=" + side + ']';
    }

    // --- CÁC PHƯƠNG THỨC MỚI ---

    /**
     * Lấy diện tích hình vuông.
     */
    public double getArea() {
        return this.side * this.side;
    }

    /**
     * Lấy chu vi hình vuông.
     */
    public double getPerimeter() {
        return 4 * this.side;
    }

    /**
     * Kiểm tra cạnh hình vuông có phải là số nguyên không.
     */
    public boolean isIntegerSquareSide() {
        // So sánh side với phiên bản làm tròn xuống của nó
        return this.side == Math.floor(this.side);
    }
}
