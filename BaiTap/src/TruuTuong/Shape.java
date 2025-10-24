package TruuTuong;

import java.util.Scanner;

public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Các phương thức trừu tượng: Bắt buộc các lớp con phải định nghĩa lại
    public abstract float getArea();
    public abstract float getPerimeter();
    public abstract void input(Scanner sc);
    public abstract String toString();
}
