package connection;

import student.StudentConnection;

import java.sql.SQLException;

public class ConnectionCaller {
    public static void main(String args[]) throws SQLException {
        StudentConnection student = new StudentConnection();

        if (student.attemptConnection() != null) {
            System.out.println("WELCOME TO GLA UNIVERSITY");
        } else {
            System.out.println("PLEASE TRY TO RECONNECT .CONNECTION EXPIRED");
        }

    }
}
