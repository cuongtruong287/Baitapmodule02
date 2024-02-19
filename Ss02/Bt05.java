package Ss02;

import java.util.Scanner;
public class Bt05 {
    public static void main(String[] args) {
        System.out.println("Day la cac nguyen to duoi 100:");
        for (int i = 0; i <= 100; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i%j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(i+" ");
            }
        }
    }
}