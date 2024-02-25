package Ss05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//        Quan ly thong tin cua 1 sinh vien
//        =====Bài tâp===
//        1. Nhap vao ma sinh vien
//        2. Nhap vao ho ten
//        3. so dien thoại
//        4. Nhập vào ngày tháng năm sinh
//        5. In thông tin sinh vien
//
//        Validate dữ liệu nhập vào
//        mã sinh viên phải bắt đầu bằng chữ B sau là 3 số (VD : B200)
//        Ho ten khong chua ky tu dac biet trừ khoảng trắng có tối thiểu 10 ký tự
//        Phone Đúng định dạng Đông Lào
//        Năm sinh phải đúng dd//mm/yyyy

public class Th01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentID, studentName, studentPhone, studentBirthday;
        do {
            System.out.println("Moi ban nhap ma sinh vien:");
            studentID = scanner.nextLine();
            Pattern patternID = Pattern.compile("(B)[0-9]{3}");
            Matcher checkID = patternID.matcher(studentID);
            if (checkID.matches()){
                System.out.println("Ma sinh vien OK");
                break;
            } else {
                System.err.println("Nhap sai, vui long nhap lai.");
            }
        } while (true);

        do {
            System.out.println("Moi ban nhap Ho va Ten:");
            studentName = scanner.nextLine();
            Pattern patternName = Pattern.compile("[a-z A-Z]{10,}");
            Matcher checkName = patternName.matcher(studentName);
            if (checkName.matches()){
                System.out.println("Ho va Ten OK");
                break;
            } else {
                System.err.println("Nhap sai, vui long nhap lai.");
            }
        } while (true);

        do {
            System.out.println("Moi ban nhap so dien thoai:");
            studentPhone = scanner.nextLine();
            Pattern patternPhone = Pattern.compile("(0[3|5|7|8|9])+(\\d{8})");
            Matcher checkPhone = patternPhone.matcher(studentPhone);
            if (checkPhone.matches()){
                System.out.println("So dien thoai OK");
                break;
            } else {
                System.err.println("Nhap sai, vui long nhap lai.");
            }
        } while (true);

        do {
            System.out.println("Moi ban nhap ngay thang nam sinh:");
            studentBirthday = scanner.nextLine();
            Pattern patternBirthday;
            patternBirthday = Pattern.compile("^((0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-(19|20)\\d\\d)$");
            Matcher checkBirthday = patternBirthday.matcher(studentBirthday);
            if (checkBirthday.matches()){
                System.out.println("Ngay thang nam sinh OK");
                break;
            } else {
                System.err.println("Nhap sai, vui long nhap lai.");
            }
        } while (true);

        System.out.println("Thong tin ban vua nhap la:");
        System.out.println("Ma so sinh vien: " + studentID);
        System.out.println("Ho va ten: " + studentName);
        System.out.println("So dien thoai la: " + studentPhone);
        System.out.println("Ngay thang nam sinh: " + studentBirthday);
    }
}