package Ss02;

import java.util.Scanner;

public class Bt03 {
    public static void main(String[] args) {
        int i;
        for (i = 15; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
