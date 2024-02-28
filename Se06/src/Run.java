import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product1 = new Product();
        do {
            System.out.println("=============MEnu===========");
            System.out.println("1. Nhập vào ma sản phâm");
            System.out.println("2. Hiển thị thông tin ");
            System.out.println("3. Hiển thị lãi xuất");
            System.out.println("Moi ban nhap yeu cau:");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    product1.enterInfo();
                    break;
                case 2:
                    product1.showInfo();
                    break;

                case 3:
                    product1.interestRate();
                    break;

                case 4:
                    System.exit(0);

                case 5:
                    System.err.println("Nhap sai, vui long nhap lai!");
                    break;
            }
        } while (true);
    }


}
