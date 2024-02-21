import java.util.Scanner;

public class Bt01 {
    public static void main(String[] args) {
        Scanner bt01 = new Scanner(System.in);
        // khoi tao mang bang vong lap for
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Moi ban nhap phan tu thu "+ i + ": ");
            arr[i] = bt01.nextInt();
        }
        System.out.println("In ra cac phan tu vua nhap nhu sau:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
