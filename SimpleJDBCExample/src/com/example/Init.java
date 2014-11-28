package com.example;

import java.util.HashMap;
import java.util.Map;

public class Init extends AA implements IName, IXaa {

	private int mae;
	private static String[] stats = new String[] {
			"CREATE TABLE EMPLOYEE (ID INTEGER NOT NULL, FIRSTNAME VARCHAR(40) NOT NULL, LASTNAME VARCHAR(40) NOT NULL,BIRTHDATE DATE,SALARY REAL,PRIMARY KEY (ID))",
			"INSERT INTO EMPLOYEE VALUES (110, 'Troy', 'Hammer', '1965-03-31', 102109.15)       ",
			"INSERT INTO EMPLOYEE VALUES (123, 'Michael', 'Walton', '1986-08-25', 93400.20)     ",
			"INSERT INTO EMPLOYEE VALUES (201, 'Thomas', 'Fitzpatrick', '1961-09-22', 75123.45) ",
			"INSERT INTO EMPLOYEE VALUES (101, 'Abhijit', 'Gopali', '1956-06-01', 89345.00)     ",
			"INSERT INTO EMPLOYEE VALUES (120, 'Rajiv', 'Sudahari', '1969-12-22', 68400.22)     ",
			"INSERT INTO EMPLOYEE VALUES (190, 'Patrice', 'Bergeron', '1970-09-18', 109345.00)  ",
			"INSERT INTO EMPLOYEE VALUES (111, 'Matthieu', 'Williams', '1966-05-31', 100345.15) ",
			"INSERT INTO EMPLOYEE VALUES (124, 'Michael', 'McGinn', '1979-01-25', 99400.20)     ",
			"INSERT INTO EMPLOYEE VALUES (202, 'Thomas', 'Heimer', '1967-07-22', 79123.45)      ",
			"INSERT INTO EMPLOYEE VALUES (102, 'Peter', 'Forrester', '1965-11-01', 99345.00)    ",
			"INSERT INTO EMPLOYEE VALUES (121, 'Kenny', 'Arlington', '1959-10-22', 78405.22)    ",
			"INSERT INTO EMPLOYEE VALUES (191, 'Jill', 'Molinair', '1968-08-18', 119345.00)     ",
			"INSERT INTO EMPLOYEE VALUES (129, 'Cindy', 'Colchester', '1965-03-24', 902109.15)  ",
			"INSERT INTO EMPLOYEE VALUES (133, 'Clarence', 'Dupree', '1986-08-11', 103400.20)   ",
			"INSERT INTO EMPLOYEE VALUES (211, 'Paromita', 'Sumesh', '1961-09-13', 105123.45)   ",
			"INSERT INTO EMPLOYEE VALUES (151, 'Arfat', 'Poland', '1956-06-11', 99345.00)       ",
			"INSERT INTO EMPLOYEE VALUES (130, 'David', 'OReilly', '1969-12-25', 88400.22)      ",
			"INSERT INTO EMPLOYEE VALUES (200, 'Patricia', 'Arnant', '1970-10-31', 79345.00)    "

	};

	public static void main(String[] args) throws Exception {
		System.out.println("aaa");

		String url = "jdbc:derby:EmployeeDB;create=true";
		// try (Connection con = DriverManager.getConnection(url);//
		// Statement stmt = con.createStatement();) {
		// for (String s : stats) {
		// try {
		// boolean result = stmt.execute(s);
		// System.out.println(result + " : " + s);
		// } catch (Exception e) {
		// }
		// }
		// } catch (SQLException ex) {
		// while (ex != null) {
		// System.out.println("SQLState:  " + ex.getSQLState());
		// System.out.println("Error Code:" + ex.getErrorCode());
		// System.out.println("Message:   " + ex.getMessage());
		// Throwable t = ex.getCause();
		// while (t != null) {
		// System.out.println("Cause:" + t);
		// t = t.getCause();
		// }
		// ex = ex.getNextException();
		// }
		// }

		Map<String, String> aa = new HashMap<>();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.IXaa#getMae()
	 */
	@Override
	public int getMae() {
		return mae;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.IXaa#setMae(int)
	 */
	@Override
	public void setMae(int mae) {
		this.mae = mae;
	}

}