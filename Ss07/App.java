package Demo04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PersonAccount personAccount = new PersonAccount(123, "cuong", 100, 5);
        SavingAccount savingAccount = new SavingAccount(456, "truong", 200, 12, 7);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Moi ban chon loai giao dich");
            System.out.println("1. Hien thi thong tin tai khoan.");
            System.out.println("2. Rut tien.");
            System.out.println("3. Nap tien.");
            System.out.println("4. Hien thi thong tin tai khoan tiet kiem.");
            System.out.println("5. Kiem tra lai suat theo ky han");
            System.out.println("6. Thoat.");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thong tin tai khoan: " + personAccount);
                    break;

                case 2:
                    System.out.println("Moi ban nhap so tien muon rut:");
                    personAccount.withDraw(scanner.nextInt());
                    System.out.println("Thong tin tai khoan sau khi rut la: " + personAccount);
                    break;

                case 3:
                    System.out.println("Moi ban nhap so tien muon nap:");
                    personAccount.deposite(scanner.nextInt());
                    System.out.println("Thong tin tai khoan sau khi nap la: " + personAccount);
                    break;

                case 4:
                    System.out.println("Thong tin tai khoan tiet kiem: " + savingAccount);
                    break;

                case 5:
                    System.out.println(savingAccount.checkInterest());
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.err.println("Nhap sai, vui long nhap lai.");
            }
        } while (true);

    }
}
