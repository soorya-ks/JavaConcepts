package com.matheesh.jdbc;

import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost/javatesting";
        Connection conn = DriverManager.getConnection(url,"root", "password");

        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from test");

        while(resultSet.next()){
            System.out.println(resultSet.getString("name")+","+resultSet.getString("dept"));
        }

    }
}
