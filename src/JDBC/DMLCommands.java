package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLCommands {

    public static void main (String[] args) throws SQLException {
        /*
        DML Commands: Insert, Update, Delete
        1) Create connection
        2) Create statement
        3) Execute the statement
        4) Close connection
        */

        // 1) Create connection
        String url="jdbc:mysql://localhost:3306/hr_db";
        String user="root";
        String password="root";
        Connection con= DriverManager.getConnection(url,user,password);

        //2) Create Statement
        Statement stmt=con.createStatement();
        String s="INSERT INTO departments VALUES (11,'IT','vancouver');";
        String s2="DELETE FROM departments WHERE department_id=11;";
        String s3="UPDATE departments SET location='Ottawa' WHERE department_name='Sales';";

        // 3) Execute Statement
        stmt.execute(s);
        stmt.execute(s2);
        stmt.execute(s3);


        // 4) Close Connection
        con.close();

        System.out.println("Query Executed!!!");


    }
}
