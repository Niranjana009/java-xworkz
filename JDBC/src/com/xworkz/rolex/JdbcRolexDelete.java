package com.xworkz.rolex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcRolexDelete {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/rolex", "root", "Mysql@981");
		//System.out.println(connection);
		String deleteSQL = "delete from company_info where price = 25";
		Statement statement = connection.createStatement();
		int noRowsAffected = statement.executeUpdate(deleteSQL);
		System.out.println(noRowsAffected);
	}

}
