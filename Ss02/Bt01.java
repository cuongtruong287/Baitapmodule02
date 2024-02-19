package Ss02;

import java.util.Scanner;

public class Bt01 {
    public static void main(String[] args) {
        Scanner bt01 = new Scanner(System.in);
        int num;
        System.out.println("Moi ban nhap so bat ky");
        num = bt01.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " la so chia het cho ca 3 va 5");
        } else {
            System.out.println(num + " la so khong chia het cho ca 3 va 5");
        }
    }
}
