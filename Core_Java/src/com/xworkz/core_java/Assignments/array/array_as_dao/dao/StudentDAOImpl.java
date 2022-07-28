package com.xworkz.core_java.Assignments.array.array_as_dao.dao;

import com.xworkz.core_java.Assignments.array.array_as_dao.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO{
	
	StudentDTO[] students = new StudentDTO[10];
	int index = 0;
	@Override
	public void addStudent(StudentDTO dto) {
		//students[0] = dto;
		//System.out.println(students[0]);
		/*for (int i=0; i < students.length; i++) {
			System.out.println("INside for loop");
			if (students[i] != null && students[i].getPhNo()) {
				System.out.println(students[i]);
				students[i] = dto;
				break;
			}
		}*/
		this.students[this.index] = dto;
		this.index++;
	}

	@Override
	public StudentDTO getStudent(long phNo) {
		//int index = -1;
		
		for (int i=0; i < students.length; i++) {
			if(students[i]!= null && students[i].getPhNo() == phNo) {
				System.out.println(students[i]);
				//index = i;
				return students[i];
			}
		}
		
		return null;
		
		/*if (index == -1)
			return null;
		else
			return students[index];
		*/
	}

	@Override
	public void updateStudent(StudentDTO dto) {
		System.out.println("Inside Student DAO");
		
		
		//students.
		//for (int i=0; i < students.length; i++) {
			//Student student =studentDao.getAllStudents().get(0);
		  //    student.setName("Michael");
		      //studentDao.updateStudent(student);
				//System.out.println(students[i]);
				//index = i;
		int count = 0;
		for (int i=0; i<students.length;i++) {
			if(students[i] != null && students[i].getPhNo() == dto.getPhNo() ) {
				count++;
				students[i].setId(dto.getId());
				students[i].setName(dto.getName());
				students[i].setBatchName(dto.getBatchName());
				students[i].setPercentage(dto.getPercentage());
			}
		}
		
		if(count == 0) {
			System.out.println("student not found");
		}
	}

	@Override
	public void deleteStudent(StudentDTO dto) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i=0; i< students.length; i++) {
			if( students[i] != null && students[i].getName() == dto.getName()) {
				/*for(int j=i; j<students.length-1;j++) {
					students[j] = students[j+1];
					count++;
				}
				 break;*/
				students[i] = null;
				count++;
			}
		}	
		if(count > 0) {
			System.out.println("Student: phone Number " +dto.getName() +" " + dto.getPhNo() + " deleted from the array" );
		}
		
		else {
			System.out.println("Invalid Details");
		}
	
	}
	
	
}
		
		
	



