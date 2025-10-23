package KeThua;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Laptop myLaptop = new Laptop();
        myLaptop.input(sc);

        System.out.println("\nThông tin Laptop vừa nhập:");
        System.out.println(myLaptop.toString());

        sc.close();
    }
}