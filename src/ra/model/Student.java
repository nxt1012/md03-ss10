package ra.model;

import ra.service.StudentService;

import java.util.Scanner;

public class Student implements StudentService {
    private int studentId;
    private String studentName;
    private String address;
    private String phone;
    private boolean gender;
    private double mark;

    public Student() {
    }

    public Student(int studentId, String studentName, String address, String phone, boolean gender, double mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.mark = mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public void input() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Vui lòng nhập vào Id học sinh");
            this.studentId = Integer.parseInt(sc.nextLine());

            System.out.println("Vui lòng nhập vào tên học sinh");
            this.studentName = sc.nextLine();

            System.out.println("Vui lòng nhập vào địa chỉ học sinh");
            this.address = sc.nextLine();

            System.out.println("Vui lòng nhập vào số điện thoại học sinh");
            this.phone = sc.nextLine();

            System.out.println("Vui lòng nhập vào giới tính học sinh (true/false)");
            this.gender = Boolean.parseBoolean(sc.nextLine());

            System.out.println("Vui lòng nhập vào điểm số học sinh");
            this.mark = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.printf("Mã học sinh: %d - Tên học sinh: %s - Địa chỉ: %s - Điện thoại: %s - Giới tính: %s - Điểm: %.2f\n", studentId, studentName, address, phone, gender? "Nam" : "Nữ", mark);
    }
}
