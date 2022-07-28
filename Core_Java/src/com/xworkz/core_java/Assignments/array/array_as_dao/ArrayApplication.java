package com.xworkz.core_java.Assignments.array.array_as_dao;

//import com.xworkz.core_java.Assignments.array.array_as_dao.dao.Student;
import com.xworkz.core_java.Assignments.array.array_as_dao.dto.StudentDTO;
import com.xworkz.core_java.Assignments.array.array_as_dao.service.StudentService;
import com.xworkz.core_java.Assignments.array.array_as_dao.service.StudentServiceImpl;

public class ArrayApplication {
	public static void main(String[] args) {
		StudentDTO dto = new StudentDTO("1","Darshan","BTM01",9123456780l,"70%");
		StudentDTO dto1 = new StudentDTO("2","arshan","BTM02",9123456781l,"80%");
		StudentService service = new StudentServiceImpl();
		
		service.addStudent(dto);
		service.addStudent(dto1);
		//service.updateStudent(dto);
		StudentDTO student = service.getStudent(9123456780l);
		StudentDTO student1 = service.getStudent(9123456781l);
		
		/*StudentDTO student2 = service.getStudent().get(2);
	    student2.setName("Michael");
	    studentDao.updateStudent(student); */
		
		System.out.println("Student Detail:");
		System.out.println(student);
		
		student.setName("Darshan boss");
		service.updateStudent(student);
		service.deleteStudent(dto);
		//System.out.println("Update student:"+ service.getStudent(9123456780l));
		//System.out.println(student1);
		//System.out.println("Updated Detail:");
		//System.out.println(student);
		
		//https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm
	}
}
