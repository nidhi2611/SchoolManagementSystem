package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewMyself {
    public ResultSet searchMe(Connection connection) throws SQLException {
        String query = "SELECT * FROM studentcorner where University_Roll_No=?;";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your university roll number");
        preparedStatement.setInt(1, sc.nextInt());
        return preparedStatement.executeQuery();
    }
}
