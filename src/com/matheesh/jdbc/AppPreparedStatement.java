package com.matheesh.jdbc;

import java.sql.*;

public class AppPreparedStatement {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost/javatesting";

        Connection con = DriverManager.getConnection(url, "root", "password");

        //Cannot make column and table name dynamic
        PreparedStatement preparedStatement = con.prepareStatement("Select * from test where salary> ?");

        preparedStatement.setInt(1, 25000);

        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            System.out.println(resultSet.getString("name")+","+resultSet.getString("dept")+","+
                    resultSet.getString("salary"));
        }

    }
}
