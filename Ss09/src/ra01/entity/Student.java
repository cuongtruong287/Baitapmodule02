package ra01.entity;

import ra01.itf.IStudent;

import java.util.Scanner;

public class Student implements IStudent {
    private String studentCode, studentName;
    private int studentAge;
    private float mathsScore, physicsScore, chemistryScore;
    private float pointAverage;

    private Boolean studentStatus;


    public Student() {
    }

    public Student(String studentCode, String studentName, int studentAge, float mathsScore, float physicsScore, float chemistryScore, float pointAverage, Boolean studentStatus) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.mathsScore = mathsScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.pointAverage = pointAverage;
        this.studentStatus = studentStatus;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public float getMathsScore() {
        return mathsScore;
    }

    public void setMathsScore(float mathsScore) {
        this.mathsScore = mathsScore;
    }

    public float getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(float physicsScore) {
        this.physicsScore = physicsScore;
    }

    public float getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(float chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public float getPointAverage() {
        return pointAverage;
    }

    public void setPointAverage(float pointAverage) {
        this.pointAverage = pointAverage;
    }

    public Boolean getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(Boolean studentStatus) {
        this.studentStatus = studentStatus;
    }

    public void pointAverage() {
        pointAverage = (mathsScore + physicsScore + chemistryScore) / 3;
        System.out.println(studentName + ": " + pointAverage);
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên");
        studentCode = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên");
        studentName = scanner.nextLine();
        System.out.println("Nhập vào tuoi sinh viên");
        studentAge = scanner.nextInt();
        System.out.println("Nhập vào diem toan cua sinh viên");
        mathsScore = scanner.nextFloat();
        System.out.println("Nhập vào diem ly cua sinh viên");
        physicsScore = scanner.nextFloat();
        System.out.println("Nhập vào diem hoa cua sinh viên");
        chemistryScore = scanner.nextFloat();

    }

    public void markPass() {
        if (pointAverage >= 5) {
            studentStatus = true;
            System.out.println(studentName + " da pass!!");
        } else {
            studentStatus = false;
            System.out.println(studentName + " thi lai!");
        }
    }

    @Override
    public void displayData() {
        System.out.println("Mã SV : " + studentCode);
        System.out.println("Họ và tên : " + studentName);
        System.out.println("Tuoi : " + studentAge);
        System.out.println("Diem Toan : " + mathsScore);
        System.out.println("Diem Ly : " + physicsScore);
        System.out.println("Diem Hoa : " + chemistryScore);
        System.out.print("Diem trung binh mon la: ");
        pointAverage();
        System.out.print("Trang thai sinh vien: ");
        markPass();
    }


}
