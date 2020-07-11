package student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection {
    private static final String database = "jdbc:mysql://localhost:3306/studentmanagementsystem?useTimezone=true&serverTimezone=UTC";
    private static final String username = "root";
    private static final String password = "";
    public Connection connection = null;

    public Connection getConnection() {
        return connection;

    }
    public Connection attemptConnection() throws SQLException {
        connection = DriverManager.getConnection(database, username, password);
        return connection;
    }

    public Connection closeConnection() throws SQLException {
        getConnection().close();
        return getConnection();
    }
}
