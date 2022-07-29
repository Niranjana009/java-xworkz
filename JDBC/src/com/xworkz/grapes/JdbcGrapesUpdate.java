package com.xworkz.grapes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcGrapesUpdate {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/grapes", "root", "Mysql@981");
		//System.out.println(connection);
		String updateSQL = "update company_info set price=100000 where farmName ='gili gilis'";
		Statement statement = connection.createStatement();
		int noRowsAffected = statement.executeUpdate(updateSQL);
		System.out.println(noRowsAffected);
	}

}






		
