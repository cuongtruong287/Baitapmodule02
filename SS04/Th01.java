package SS04;

import java.util.Scanner;

public class Th01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang");
        int row = sc.nextInt();
        System.out.println("Nhap so cot cua mang");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        do {
            System.out.println("===========MENU==========");
            System.out.println("1. Nhập vào giá trị các phần tử mảng");
            System.out.println("2. In ra các phần tử mảng");
            System.out.println("3. Hiển thị dưới dạng ma trận");
            System.out.println("4. In ra đường chéo chính");
            System.out.println("5. In ra Đường chéo phụ");
            System.out.println("6. In ra đường biên");
            System.out.println("7. Thoát chường trình");
            System.out.println("Moi ban nhap lenh tu 1 - 7");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap vao cac gia tri phan tu mang: ");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("arr[%d][%d] = ", i, j);
                            matrix[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mang vua nhap la:");
                {
                    int i = 0;
                    while (i < matrix.length) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf(matrix[i][j] + " ");
                        }
                        System.out.println();
                        i++;
                    }
                }
                    break;
                case 3:
                    System.out.println("Ma tran cua ban la:");
                {
                    int i = 0;
                    while (i < matrix.length) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("%d\t", matrix[i][j]);
                        }
                        System.out.println("\n");
                        i++;
                    }
                }
                    break;

                case 4:
                    System.out.println("Duong cheo chinh");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == j) {
                                System.out.printf("%d\t", matrix[i][j]);
                            } else {
                                System.out.printf("%s\t", "");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Duong cheo phu");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i + j == matrix.length - 1) {
                                System.out.printf("%d\t", matrix[i][j]);
                            } else {
                                System.out.printf("%s\t", "");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("Duong bien la");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == 0 || i == matrix.length - 1) {
                                System.out.print(matrix[i][j] + "\t");
                            } else if (j == 0 || j == matrix[i].length - 1) {
                                System.out.printf(matrix[i][j] + "\t");
                            } else {
                                System.out.printf("\t", "");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Nhap sai. Vui long nhap lai.");
            }
        } while (true);
    }
}
