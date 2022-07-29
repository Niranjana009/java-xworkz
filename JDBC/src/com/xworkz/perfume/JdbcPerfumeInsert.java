package com.xworkz.perfume;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcPerfumeInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/perfume", "root", "Mysql@981");
		//System.out.println(connection);
		String insertSQL = "insert into company_info value('4', 'Marlbouro', 'silver', '25', 'Smooth')";
		Statement statement = connection.createStatement();
		int noRowsAffected = statement.executeUpdate(insertSQL);
		System.out.println(noRowsAffected);
	}

}







	