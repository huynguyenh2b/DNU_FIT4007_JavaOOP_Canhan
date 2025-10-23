package KeThua;



import java.util.Scanner;

public class Cat extends Animal {
    private String color;
    private String breed; // Dùng để lưu giới tính như yêu cầu

    public Cat() {
        super();
    }

    public Cat(String name, int age, String color, String breed) {
        super(name, age);
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat[" +
                super.toString() + // Dùng lại toString() của Animal
                ", color='" + color + '\'' +
                ", gender='" + breed + '\'' + // "breed" đang lưu giới tính
                ']';
    }

    // Ghi đè phương thức input() để nhập thêm thông tin của Cat
    @Override
    public void input(Scanner sc) {
        System.out.println("Nhập thông tin mèo:");
        super.input(sc); // Gọi input() của Animal để nhập tên và tuổi
        System.out.print("Nhập màu lông: ");
        this.color = sc.nextLine();
        System.out.print("Nhập giới tính (Đực/Cái): ");
        this.breed = sc.nextLine();
    }

    // Phương thức kiểm tra "cùng giới tính"
    public boolean equalBreed(Cat c) {
        // So sánh không phân biệt hoa thường
        return this.breed.equalsIgnoreCase(c.getBreed());
    }
}