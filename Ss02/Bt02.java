package Ss02;

import java.util.Scanner;

public class Bt02 {
    public static void main(String[] args) {
        Scanner convert = new Scanner(System.in);
        int num;
        System.out.println("Hay nhap so nguyen 1 chu so");
        num = convert.nextInt();
        switch (num){
            case 0:
                System.out.println("So khong");
                break;
            case 1:
                System.out.println("So mot");
                break;
            case 2:
                System.out.println("So hai");
                break;
            case 3:
                System.out.println("So ba");
                break;
            case 4:
                System.out.println("So bon");
                break;
            case 5:
                System.out.println("So nam");
                break;
            case 6:
                System.out.println("So sau");
                break;
            case 7:
                System.out.println("So bay");
                break;
            case 8:
                System.out.println("So tam");
                break;
            case 9:
                System.out.println("So chin");
                break;
            default:
                System.out.println("Khong hop le. Hay nhap so co 1 chu so.");
                break;
        }
    }
}
