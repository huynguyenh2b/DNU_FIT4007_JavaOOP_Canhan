package KeThua;

import java.util.Scanner;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle() {
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", height=" + height +
                ']';
    }

    public void input(Scanner sc) {
        System.out.print("Nhập chiều rộng: ");
        this.width = sc.nextFloat();
        System.out.print("Nhập chiều dài: ");
        this.height = sc.nextFloat();
        sc.nextLine();
    }

    public float getArea() {
        return this.width * this.height;
    }

    public float getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
