package employee.management.system;

import java.sql.*;

public class Connections {
    
    Connection connection;
    Statement statement;

    public Connections () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employee_management_system?autoReconnect=true&useSSL=false";
            String username = "root";
            String password = "Iwsad@2020";
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}