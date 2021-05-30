package com.matheesh.jdbc;

import java.sql.*;

public class AppUpdateQuery {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost/javatesting";

        Connection con = DriverManager.getConnection(url, "root", "password");

        Statement statement = con.createStatement();

        String query = "INSERT INTO test(name,dept,salary) values(\"Subash\",\"IT\",30000)";

        int returnValue = statement.executeUpdate(query);

        System.out.println(returnValue);


    }
}
