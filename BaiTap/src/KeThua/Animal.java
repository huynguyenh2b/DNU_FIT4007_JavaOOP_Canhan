package KeThua;

import java.util.Scanner;
import java.time.Year; // Sử dụng thư viện time hiện đại

public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }

    public void input(Scanner sc) {
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = sc.nextInt();
        sc.nextLine(); // Tiêu thụ newline
    }

    public int getYearOfBirth() {
        int currentYear = Year.now().getValue();
        return currentYear - this.age;
    }
}