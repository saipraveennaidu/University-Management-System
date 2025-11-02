package University.Management.System;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
    Connection connection;
    Statement statement;
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement","root","Nani@123");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root", "Nani@123");
            // System.out.println("Connected to DB: " + connection.getCatalog());
            statement = connection.createStatement();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
