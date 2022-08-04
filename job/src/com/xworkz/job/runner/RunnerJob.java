package com.xworkz.job.runner;

import com.xworkz.job.constant.Designation;
import com.xworkz.job.constant.Qualification;
import com.xworkz.job.dao.JobDAO;
import com.xworkz.job.dao.JobDAOImpl;
import com.xworkz.job.dto.JobDTO;

public class RunnerJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobDTO jobDTO = new JobDTO(8, Designation.NETWORKENGINEER, 300000.00D, Qualification.BCA, 57.65D, "NO");
		JobDAO jobDAO = new JobDAOImpl();
		jobDAO.saveDetails(jobDTO);
		jobDAO.findByID(2);
		JobDTO gon = jobDAO.findByID(3);
		System.out.println(gon);
		JobDTO details = jobDAO.findByIdAndDesignation(7, "NetworkEngineer");
		System.out.println(details);
		JobDTO de = jobDAO.findByIdAndDesignationAndQualification(8, "NetworkEngineer", "BCA");
		System.out.println(de);
		jobDAO.getTotal();
	}

}
