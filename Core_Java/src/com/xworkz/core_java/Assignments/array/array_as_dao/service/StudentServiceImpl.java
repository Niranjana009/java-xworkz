package com.xworkz.core_java.Assignments.array.array_as_dao.service;

import com.xworkz.core_java.Assignments.array.array_as_dao.dao.StudentDAO;
import com.xworkz.core_java.Assignments.array.array_as_dao.dao.StudentDAOImpl;
import com.xworkz.core_java.Assignments.array.array_as_dao.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

		StudentDAO studentDAO = new StudentDAOImpl();
		
		@Override
		public void addStudent(StudentDTO dto) {
			long number = dto.getPhNo();
			int length = 0;
			//int revnum = 0;
			while(number>0) {
			    number = number/10;
				length++;
			}
			if(length == 10) {
				studentDAO.addStudent(dto);
				System.out.println(dto);
			}
			else {
				System.out.println("Invalid Phone number");
			}
		}

@Override
	public StudentDTO getStudent(long phNo) {
		return studentDAO.getStudent(phNo);
}


@Override
	public void updateStudent(StudentDTO dto) {
	
	
	System.out.println("Inside update students service impl");
	studentDAO.updateStudent(dto);
	System.out.println(dto);
	/*StudentDTO student2 = service.getStudent().get(2);
    student2.setName("Michael");
    studentDao.updateStudent(student); */
	
}

@Override
public void deleteStudent(StudentDTO dto) {
	// TODO Auto-generated method stub
	long number = dto.getPhNo();
	int count = 0;
	while (number > 0) {
		number = number / 10;
		count++;
	}
	if (count == 10) {
		studentDAO.deleteStudent(dto);
		System.out.println(dto);
	}

	else {
		System.out.println("Invalid number");
	}
}
}



