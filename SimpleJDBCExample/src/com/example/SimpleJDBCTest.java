package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class SimpleJDBCTest {

	public static String method2(String a) {
		String x = "                         ";
		String y = x.substring(a.length(), x.length());
		String z = "|" + a.concat(y);
		return z;
	}

	public static void main(String[] args) {
		String url = "jdbc:derby:EmployeeDB;create=true";
		String query = "SELECT * FROM Employee";
		try (Connection con = DriverManager.getConnection(url); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

			System.out.println();
			boolean firstTime = true;
			int resultCount = 0;
			while (rs.next()) {
				if (firstTime) {
					System.out.println("_____________________________________________________________________________________________________________________");
					String columnName1 = rs.getMetaData().getColumnName(1) + "(" + rs.getMetaData().getColumnTypeName(1) + ")";
					String columnName2 = rs.getMetaData().getColumnName(2) + "(" + rs.getMetaData().getColumnTypeName(2) + ")";
					String columnName3 = rs.getMetaData().getColumnName(3) + "(" + rs.getMetaData().getColumnTypeName(3) + ")";
					String columnName4 = rs.getMetaData().getColumnName(4) + "(" + rs.getMetaData().getColumnTypeName(4) + ")";
					String columnName5 = rs.getMetaData().getColumnName(5) + "(" + rs.getMetaData().getColumnTypeName(5) + ")";
					System.out.println(method2(columnName1) + method2(columnName2) + method2(columnName3) + method2(columnName4) + method2(columnName5));
					System.out.println("_____________________________________________________________________________________________________________________");
					firstTime = false;
				}

				String last = rs.getString("LastName");
				String first = rs.getString("FirstName");
				int empID = rs.getInt("ID");
				Date birthDate = rs.getDate("BirthDate");
				float salary = rs.getFloat("Salary");
				System.out.println(method2(String.valueOf(empID)) + method2(first) + method2(last) + method2(birthDate.toString()) + method2(String.valueOf(salary)));
				System.out.println("_____________________________________________________________________________________________________________________");
				resultCount++;
			}
			System.out.println();
			System.out.println(resultCount + "records found");
		} catch (SQLException ex) {
			while (ex != null) {
				System.out.println("SQLState:  " + ex.getSQLState());
				System.out.println("Error Code:" + ex.getErrorCode());
				System.out.println("Message:   " + ex.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause:" + t);
					t = t.getCause();
				}
				ex = ex.getNextException();
			}
		}
	}
}