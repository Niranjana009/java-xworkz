package com.xworkz.bar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sound.midi.SysexMessage;

import static com.xworkz.bar.constants.MysqlProperties.SECRET;
import static com.xworkz.bar.constants.MysqlProperties.URL;
import static com.xworkz.bar.constants.MysqlProperties.USERNAME;

import com.xworkz.bar.dto.BarDTO;

public class BarDAOImpl implements BarDAO{

	@Override
	public boolean save(BarDTO barDTO) {
		
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());
			String insertSql = "insert into bars.bar_info value("+ barDTO.getId() + ","
																+ "'"+ barDTO.getName() + "','" 
																+ barDTO.getLocation()+"','"
																+ barDTO.getType().getName() +"',"
																+ barDTO.getAvgCollectionPerDay()+","
																+ ""+barDTO.getCollectionsPerMonth()+")";
			
			Statement statement = connection.createStatement();
			
			int rowsAffected = statement.executeUpdate(insertSql);
			
			System.out.println(rowsAffected);
			
			if (rowsAffected>0) {
					System.out.println("Data is save:"+insertSql);
			}else {
				System.out.println("Data is not saved");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
				
		return false;
	}
	

}
