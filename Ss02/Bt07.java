package Ss02;

import java.util.Scanner;

public class Bt07 {
    public static void main(String[] args) {
        Scanner bt07 = new Scanner(System.in);
        int num;
        System.out.println("Moi ban nhap so bat ky:");
        num = bt07.nextInt();
        do {
            if (num%2 == 0) {
                System.out.println(num + " la so chan.");
            } else {
                System.out.println(num + " la so le.");
            }
        } while (num <= 0);
    }
}
