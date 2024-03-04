package Bt01;

import Bt01.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("====Moi ban chon===");
            System.out.println("1. Hinh chu nhat.");
            System.out.println("2. Hinh tron.");
            System.out.println("3. Thoat.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Rectangle rectangle = new Rectangle("Red", 5.0, 10.0);
                    System.out.println("Dien tich hinh chu nhat la: " + rectangle.getArea());
                    System.out.println("Mau hien thi la: " + rectangle.display());
                    break;
                case 2:
                    Circle circle = new Circle("Yellow", 3.0);
                    System.out.println("Dien tich hinh tron la " + circle.getArea());
                    System.out.println("Mau hien thi la: " + circle.display());
                    break;
                case 3:
                    System.exit(0);

                default:
                    System.err.println("Nhap sai, vui long nhap lai!");
                    break;
            }
        } while (true);


    }
}