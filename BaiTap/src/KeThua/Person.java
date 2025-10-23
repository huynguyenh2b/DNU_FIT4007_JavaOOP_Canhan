package KeThua;

import java.util.Scanner;
import java.time.Year;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'';
    }

    public void input(Scanner sc) {
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = sc.nextInt();
        sc.nextLine(); // Tiêu thụ newline
        System.out.print("Nhập địa chỉ: ");
        this.address = sc.nextLine();
    }

    public int getYearOfBirth() {
        return Year.now().getValue() - this.age;
    }

    public String getUpperName() {
        return this.name.toUpperCase();
    }

    public boolean checkAge(int n) {
        return this.age >= n;
    }
}