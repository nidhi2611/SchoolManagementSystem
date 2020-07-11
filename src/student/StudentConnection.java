package student;

import connection.Connection;

public class StudentConnection {
    private static final String database = "jdbc:mysql://localhost:3306/studentmanagementsyatem?useTimezone=true&serverTimezone=UTC";
    private static final String username = "root";
    private static final String password = "";
    public Connection connection = null;

    public Connection getConnection() {
        return connection;
    }


}
