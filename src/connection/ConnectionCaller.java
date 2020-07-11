package connection;

import principal.StudentCreation;
import student.Student;
import student.StudentConnection;

import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionCaller {
    public static void main(String args[]) throws SQLException {
        StudentConnection student = new StudentConnection();

        if (student.attemptConnection() != null) {
            System.out.println("WELCOME TO GLA UNIVERSITY");
        } else {
            System.out.println("PLEASE TRY TO RECONNECT .CONNECTION EXPIRED");
        }
        Scanner sc = new Scanner(System.in);
        StudentCreation studentCreation = new StudentCreation();
        System.out.println("enter details");
        String name = sc.nextLine();
        int university_rollno = sc.nextInt();
        sc.nextLine();
        String course = sc.nextLine();
        int con = sc.nextInt();
        Student student1 = new Student(name, university_rollno, course, con);
        studentCreation.createNewStudent(student.getConnection(), student1);
        studentCreation.studentCreation();
    }
}
