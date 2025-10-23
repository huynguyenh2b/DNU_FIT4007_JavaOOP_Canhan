package OOPCacPhuongThuc;

public class Rectangle {
    private double width;
    private double height;

    // Constructors
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getters and Setters
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    // toString
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + ']';
    }

    // --- CÁC PHƯƠNG THỨC MỚI ---

    /**
     * Tính diện tích hình chữ nhật.
     * @return Diện tích (double)
     */
    public double getArea() {
        return this.width * this.height;
    }

    /**
     * Tính chu vi hình chữ nhật.
     * @return Chu vi (double)
     */
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    /**
     * Kiểm tra xem đây có phải là hình vuông không.
     * @return true nếu là hình vuông, false nếu không.
     */
    public boolean isSquare() {
        // Sử dụng một sai số nhỏ (epsilon) để so sánh số thực
        double epsilon = 1e-9;
        return Math.abs(this.width - this.height) < epsilon;
    }
}
