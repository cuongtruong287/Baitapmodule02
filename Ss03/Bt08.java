import java.util.Scanner;

public class Bt08 {
    public static void main(String[] args) {
        Scanner bt08 = new Scanner(System.in);
        System.out.println("Moi ban nhap 1 so nguyen bat ky:");
        int n = bt08.nextInt();
        do {
            System.out.println("**PRACTICE**");
            System.out.println("1. In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)");
            System.out.println("2. In các số nhỏ hơn n và tính tổng");
            System.out.println("3. In ra các ước số chẵn của n");
            System.out.println("4. In ra các ước số lẻ và số lượng các ước lẻ của n");
            System.out.println("5. In ra ước số lẻ lớn nhất của n");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choice = bt08.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Cac so nho hon " + n + " va chia het cho 2 la: ");
                    for (int i = 2; i <= n; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Cac so nho hon " + n + " la: ");
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                    System.out.println();
                    System.out.println("Tong cua chung la: " + sum);
                    break;

                case 3:
                    int c, ct1 = 0;
                    System.out.print("Cac uoc so chan cua " + n + " la: ");
                    for (c = 2; c <= n; c++) {
                        if (n % c == 0 && c % 2 == 0){
                            ct1++;
                            System.out.print(c + " ");
                        }
                    }
                    System.out.println();
                    if (ct1 == 0) {
                        System.out.println(n + " khong co uoc so chan.");
                    }
                    break;

                case 4:
                    System.out.print("Cac uoc so le cua " + n + " la: ");
                    int ct2 = 0;
                    for (int i = 1; i <=n ; i++) {
                        if (n % i == 0 && i % 2 != 0){
                            ct2++;
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("So luong cac uoc so le cua "+ n + " la: " + ct2);
                    break;

                    // case nay chua hoan thanh:
                case 5:
                    int max = 0, j = 1;
                    for (j = 1; j <= n ; j++) {
                        if (n % j == 0 && j % 2 != 0){
                            max = j;
                        }
                    }
                    System.out.println(max);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Nhap sai. Vui long nhap lai.");
            }
        } while(true);
    }
}
