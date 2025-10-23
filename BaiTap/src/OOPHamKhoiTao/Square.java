package OOPHamKhoiTao;

public class Square {
    private double side;

    // Hàm khởi tạo mặc định
    public Square() {
        this.side = 1.0;
    }

    // Hàm khởi tạo có thuộc tính
    public Square(double side) {
        this.side = side;
    }

    // Getter
    public double getSide() {
        return side;
    }

    // Setter
    public void setSide(double side) {
        this.side = side;
    }

    // toString
    @Override
    public String toString() {
        return "Square[side=" + side + ']';
    }
}