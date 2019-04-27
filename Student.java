package App;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Student {
    String StudentID;
    String StudentName;
    String Address;
    int Phone;

    public Student(String StudentID, String StudentName, String Address, String Phone){
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.Address = Address;
        this.Phone = Phone;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
    public static ArrayList<Student> collectionOfStudent = new ArrayList<>();
    public static void main(String[] args) {
        Student student0 = new Student();
        student0.setStudentID("B01010");
        student0.setStudentName("Nguyen Tuan Anh");
        student0.setAddress("Ha noi");
        student0.setPhone(0904818238);
        collectionOfStudent.add(student0);

        Student student = new Student();
        student.setStudentID("B10394");
        student.setStudentName("Nguyen Hoang Hai");
        student.setAddress("Hai Duong");
        student.setPhone(0494949494);
        collectionOfStudent.add(student);

        try {
            boolean menu = true;
            Scanner scanner = new Scanner(System.in);
            while (menu){
                System.out.println("Nhap vao lua chon:");
                System.out.println(
                        "1. Add Student");
                System.out.println("2. Display student");
                System.out.println("3. Save");
                System.out.println("4. Exit");

                int menu = scanner.hasNextInt()?scanner.nextInt():0;
                switch (menu){
                    case 1: AddStudent();break;
                    case 2: Display(); break;
                    case 3: Save(); break;
                    case 4: Exit();break;
                    default:
                        System.out.printf("khong co lua chon dung"); menu();break;
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Student menu = new Student();


    }
    public static void AddStudent(){
        System.out.println("nhap vao id , name , adress, phone");
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        student1.setStudentID() = scanner.nextLine();
        student1.setStudentName() = scanner.nextLine();
        student1.setAddress() = scanner.nextLine();
        student1.setPhone() = scanner.nextInt();
        collectionOfStudent.add(student1);
        option();
    }
    public static void Display(){
        for (Student st :collectionOfStudent){
            System.out.println("ID"+st.StudentID+"Name"+st.StudentName+"Adress"+st.Address+"phone"+st.Phone);
            option();
        }
    }
    public static void Save(){
        try {
            PrintWriter out = new PrintWriter("student.txt");
            for(Student st:collectionOfStudent ) {
                out.println("ID: " + st.StudentID + " ,Name: " + st.StudentName + " ,Address: " + st.Address + " ,Phone: " + st.Phone);
            }
            out.close();
        } catch (Exception e) {

        }
        option;

    }
    public static void Exit(){


    }
}
