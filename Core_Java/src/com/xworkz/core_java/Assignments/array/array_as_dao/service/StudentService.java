package com.xworkz.core_java.Assignments.array.array_as_dao.service;

import com.xworkz.core_java.Assignments.array.array_as_dao.dto.StudentDTO;

public interface StudentService {
	void addStudent(StudentDTO dto);
	StudentDTO getStudent(long phNo);
	void updateStudent(StudentDTO dto);
	void deleteStudent(StudentDTO dto);
}
