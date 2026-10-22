package JDBC;

import java.sql.*;

public class SelectCommand {
    public static void main(String[] args) throws SQLException {
        //Create Connection
        String url="jdbc:mysql://localhost:3306/hr_db";
        String user="root";
        String password="root";
        Connection con= DriverManager.getConnection(url,user,password);
        // Create Statement
        Statement stmt = con.createStatement();
        String s="SELECT * FROM departments";
        // Execute statement and store result set
        ResultSet rs=stmt.executeQuery(s);
        while (rs.next()){
            int id=rs.getInt("department_id");
            String deptName=rs.getString("department_name");
            String location=rs.getString("location");

            System.out.println(id + "\t" + deptName + "\t" + location);
        }
        // Close connection
        con.close();
    }
}
