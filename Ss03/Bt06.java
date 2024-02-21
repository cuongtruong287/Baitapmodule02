import java.util.Scanner;

public class Bt06 {
    public static void main(String[] args) {
        Scanner bt06 = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.println("Moi ban nhap so nguyen thu nhat:");
        firstNumber = bt06.nextInt();
        System.out.println("Moi ban nhap so nguyen thu hai:");
        secondNumber = bt06.nextInt();
        do {
            System.out.println("**CACULATOR**");
            System.out.println("1. Hieu 2 so");
            System.out.println("2. Tong 2 so");
            System.out.println("3. Tich 2 so");
            System.out.println("4. Thuong 2 so");
            System.out.println("5. So du trong phep chia 2 so");
            System.out.println("6. Uoc chung lon nhat");
            System.out.println("7. Boi chung nho nhat");
            System.out.println("8. Thoat");
            System.out.println("Lua chon cua ban:");
            int choice = bt06.nextInt();
            switch (choice){
                case 1:
                    int sum = firstNumber + secondNumber;
                    System.out.println("Tong cua 2 so la: " + sum);
                    break;
                case 2:
                    int dif = firstNumber - secondNumber;
                    System.out.println("Hieu cua 2 so la: " + dif);
                    break;
                case 3:
                    int pro = firstNumber * secondNumber;
                    System.out.println("Tich cua 2 so la: " + pro);
                    break;
                case 4:
                    int quo = firstNumber / secondNumber;
                    System.out.println("Thuong cua 2 so la: " + quo);
                    break;
                case 5:
                    int rem = firstNumber % secondNumber;
                    System.out.println("So du trong phep chia cua 2 so la: " + rem);
                    break;
                case 6:
                    int gCD = 1;
                    for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
                        if (firstNumber % i == 0 && secondNumber % i == 0) {
                            gCD = i;
                        }
                    }
                    System.out.println("Uoc chung lon nhat cua 2 so la: " + gCD);
                    break;
                case 7:
                    int lCM = 1;
                    if (firstNumber == secondNumber){
                        lCM = firstNumber;
                        System.out.println("Boi chung nho nhat cua 2 so la: " + lCM);
                    } else {
                        for (int i = 1; i <= firstNumber * secondNumber; i++) {
                            int ct = 0;
                            if (i % firstNumber == 0 && i % secondNumber == 0) {
                                ct++;
                            }
                            if (ct == 1){
                                lCM = i;
                            }
                        }
                        System.out.println("Boi chung nho nhat cua 2 so la: " + lCM);
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Ban da nhap sai. Vui long nhap lai.");
                    break;
            }
        } while (true);
    }
}
