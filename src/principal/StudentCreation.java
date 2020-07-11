package principal;

import student.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentCreation {
    public boolean isCreated = false;
    Scanner sc = new Scanner(System.in);

    public void createNewStudent(Connection connection, Student student) throws SQLException {
        String query = "INSERT INTO studentcorner VALUES(?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setInt(2, student.getUniversity_Roll_No());
        preparedStatement.setString(3, student.getCourse());
        preparedStatement.setInt(4, student.getContact_Number());
        isCreated = preparedStatement.executeUpdate() >= 1;
    }

    public void studentCreation(boolean isCreated) {
        if (isCreated)
            System.out.println("STUDENT SUCCESSFULLY ENTERED");
        else
            System.out.println("STUDENT NOT ENTERED INTO THE DATABASE");
    }
}
