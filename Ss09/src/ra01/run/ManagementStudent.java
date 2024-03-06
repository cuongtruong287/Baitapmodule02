package ra01.run;

import ra01.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        do {
            System.out.println("********************************MENU*************************** \n" +
                    "1.\tNhập thông tin n sinh viên \n" +
                    "2.\tTính điểm trung bình sinh viên \n" +
                    "3.\tXét điểm qua cho sinh viên \n" +
                    "4.\tHiển thị thông tin sinh viên \n" +
                    "5.\tThoát \n");
            System.out.println("Moi ban chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("So sinh vien muon nhap ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.inputData();
                        list.add(student);
                    }
                    break;

                case 2:
                    System.out.println("Diem trung binh mon la: ");
                    for (Student student : list) {
                        student.pointAverage();
                    }
                    break;

                case 3:
                    System.out.println("Ket qua xet diem la:");
                    for (Student student : list) {
                        student.markPass();
                    }
                    break;

                case 4:
                    System.out.println("Thong tin sinh vien la:");
                    for (Student student : list) {
                        student.displayData();
                    }
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.err.println("Nhap sai, vui long nhap lai.");
            }
        } while (true);
    }
}
