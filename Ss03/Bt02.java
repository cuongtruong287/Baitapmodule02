import java.util.Scanner;

public class Bt02 {
    public static void main(String[] args) {
        Scanner bt02 = new Scanner(System.in);
        int n;
        do {
            System.out.println("So phan tu ban muon nhap vao trong mang la bao nhieu:");
            n = bt02.nextInt();
        } while (n < 0);
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap so phan tu thu " + i + ": ");
            arr[i] = bt02.nextInt();
        }
        int sum = 0, ave = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ave = sum/n;
        }
        System.out.println("Gia tri trung binh cong cua cac phan tu trong mang la: "
                + ave);
    }
}
