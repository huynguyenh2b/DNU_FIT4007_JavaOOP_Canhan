package KeThua;


import java.util.Scanner;

public class Square extends Rectangle {

    public Square() {
        super(0, 0);
    }

    // Constructor của Square chỉ cần 1 cạnh
    public Square(float side) {
        super(side, side); // Gọi cha với width = height = side
    }

    // Getter cho "side" (lấy từ width hoặc height của cha)
    public float getSide() {
        return getWidth(); // Hoặc getHeight()
    }

    // Setter cho "side" (phải set cả width và height của cha)
    public void setSide(float side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    // Ghi đè setWidth để đảm bảo tính vuông
    @Override
    public void setWidth(float width) {
        setSide(width);
    }

    // Ghi đè setHeight để đảm bảo tính vuông
    @Override
    public void setHeight(float height) {
        setSide(height);
    }

    // Ghi đè input để chỉ hỏi 1 cạnh
    @Override
    public void input(Scanner sc) {
        System.out.print("Nhập cạnh hình vuông: ");
        float side = sc.nextFloat();
        sc.nextLine();
        this.setSide(side);
    }

    // Ghi đè toString
    @Override
    public String toString() {
        return "Square[side=" + getSide() + "]";
    }
}