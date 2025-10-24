package TruuTuong;

import java.util.Scanner;

public class Rectangle extends Shape { // Sửa lỗi chính tả "Rectangel" -> "Rectangle"
    private float width;
    private float height;

    public Rectangle() {
    }

    public Rectangle(String color, float width, float height) {
        this.setColor(color);
        this.width = width;
        this.height = height;
    }

    // Getters & Setters
    public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }
    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    // --- Ghi đè các phương thức trừu tượng ---

    @Override
    public float getArea() {
        return this.width * this.height;
    }

    @Override
    public float getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public void input(Scanner sc) {
        System.out.print("Nhập màu sắc: ");
        this.setColor(sc.nextLine());
        System.out.print("Nhập chiều rộng: ");
        this.width = sc.nextFloat();
        System.out.print("Nhập chiều cao: ");
        this.height = sc.nextFloat();
        sc.nextLine(); // Tiêu thụ newline
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "color='" + getColor() + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ']';
    }
}
