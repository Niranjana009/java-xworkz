package com.xworkz.grapes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcGrapesDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/grapes", "root", "Mysql@981");
		//System.out.println(connection);
		String deleteSQL = "delete from company_info where price = 100000";
		Statement statement = connection.createStatement();
		int noRowsAffected = statement.executeUpdate(deleteSQL);
		System.out.println(noRowsAffected);
	}

}






	
		// TODO Auto-generated method stub
		
