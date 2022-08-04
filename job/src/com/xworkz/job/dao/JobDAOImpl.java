package com.xworkz.job.dao;

import static com.xworkz.job.constant.MySqlProperties.SECRET;
import static com.xworkz.job.constant.MySqlProperties.URL;
import static com.xworkz.job.constant.MySqlProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.job.constant.Designation;
import com.xworkz.job.constant.Qualification;
import com.xworkz.job.dto.JobDTO;

public class JobDAOImpl implements JobDAO {

	public Boolean saveDetails(JobDTO jobDTO) {
		// TODO Auto-generated method stub
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String sql = "insert into job.job_application_details values (?,?,?,?,?,?)";
			PreparedStatement preStat = connection.prepareStatement(sql);
			preStat.setInt(1, jobDTO.getJid());
			preStat.setString(2, jobDTO.getDesignation().getDesignation());
			preStat.setDouble(3, jobDTO.getAnnualPackage());
			preStat.setString(4, jobDTO.getQualification().getEducation());
			preStat.setDouble(5, jobDTO.getPercentage());
			preStat.setString(6, jobDTO.getFresher());
			int noOfRowsAffected = preStat.executeUpdate();
			if (noOfRowsAffected > 0) {
				System.out.println("The Values Inserted Are :" + sql);
				System.out.println(noOfRowsAffected);
			} else {
				System.out.println("Unable to insert Data..!!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public JobDTO findByID(Integer id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String search = "select * from job.job_application_details where jid = ?";
			PreparedStatement preStat = connection.prepareStatement(search);
			preStat.setInt(1, id);
			ResultSet resultSet = preStat.executeQuery();
			while (resultSet.next()) {
				int jid = resultSet.getInt(1);
				String designation = resultSet.getString(2);
				Double ctc = resultSet.getDouble(3);
				String edu = resultSet.getNString(4);
				Double perc = resultSet.getDouble(5);
				String eLevel = resultSet.getNString(6);
				System.out.println(jid + " " + designation + " " + ctc + " " + edu + " " + perc + " " + eLevel);
				JobDTO jobDTO = new JobDTO();
				jobDTO.setJid(jid);
				jobDTO.setDesignation(Designation.getByValue(designation));
				jobDTO.setAnnualPackage(ctc);
				jobDTO.setQualification(Qualification.getByValue(edu));
				jobDTO.setPercentage(perc);
				jobDTO.setFresher(eLevel);
				return jobDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public JobDTO findByIdAndDesignation(Integer id, String designation) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String search = "select * from job.job_application_details where jid = ? AND designation = ?";
			PreparedStatement preStat = connection.prepareStatement(search);
			preStat.setInt(1, id);
			preStat.setString(2, designation);
			ResultSet resultSet = preStat.executeQuery();
			while (resultSet.next()) {
				System.out.println("inside while");
				int jid = resultSet.getInt(1);
				String desg = resultSet.getString(2);
				Double ctc = resultSet.getDouble(3);
				String edu = resultSet.getString(4);
				Double perc = resultSet.getDouble(5);
				String eLevel = resultSet.getString(6);

				JobDTO jobDTO = new JobDTO();

				jobDTO.setJid(jid);
				jobDTO.setDesignation(Designation.getByValue(desg));
				jobDTO.setAnnualPackage(ctc);
				jobDTO.setQualification(Qualification.getByValue(edu));
				jobDTO.setPercentage(perc);
				jobDTO.setFresher(eLevel);
				return jobDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public JobDTO findByIdAndDesignationAndQualification(Integer id, String designation, String qualification) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String search = "select * from job.job_application_details where jid = ? and designation = ? and qualification = ?";
			PreparedStatement pStmt = connection.prepareStatement(search);
			pStmt.setInt(1, id);
			pStmt.setString(2, designation);
			pStmt.setString(3, qualification);
			ResultSet resultSet = pStmt.executeQuery();
			while (resultSet.next()) {
				Integer jid = resultSet.getInt(1);
				String desg = resultSet.getString(2);
				Double ctc = resultSet.getDouble(3);
				String education = resultSet.getString(4);
				Double percentage = resultSet.getDouble(5);
				String level = resultSet.getString(6);

				JobDTO jobDTO = new JobDTO();
				jobDTO.setJid(jid);
				jobDTO.setDesignation(Designation.getByValue(desg));
				jobDTO.setAnnualPackage(ctc);
				jobDTO.setQualification(Qualification.getByValue(education));
				jobDTO.setPercentage(percentage);
				jobDTO.setFresher(level);
				return jobDTO;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Integer getTotal() {
		AtomicInteger atomicInteger = new AtomicInteger();
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String query = "select * from job.job_application_details";
			PreparedStatement pStmt = connection.prepareStatement(query);
			ResultSet resultset = pStmt.executeQuery();
			while (resultset.next()) {
				atomicInteger.incrementAndGet();
			}
			System.out.println(atomicInteger);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Boolean isFresherById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getMaxPercentage() {
		// TODO Auto-generated method stub
		return null;
	}

}
