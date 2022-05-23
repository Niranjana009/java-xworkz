class StudentDetails{
	
	public static void main(String args[]){
		Student student1 = new Student();
		
		student1.id = "A0001";
		student1.name = "A1";
		student1.DOB = "01 Jan 2000";
		student1.age = 22;
	
	    System.out.println("\n" + "Details of Student1:" + "\n");
		//System.out.println("\r\n" + "Details of Student1:" + "\r\n");
		student1.StudentDisplay();
	
		Student student2 = new Student();
		
		student2.id = "B0002";
		student2.name = "B2";
		student2.DOB = "01 Jan 2001";
		student2.age = 21;
	
	    System.out.println("\n" + "Details of Student2:" + "\n");
		//System.out.println("\r\n" + "Details of Student2:" + "\r\n");
		student2.StudentDisplay();
		
		Student student3 = new Student();
		
		student3.id = "C0003";
		student3.name = "C3";
		student3.DOB = "01 Jan 2002";
		student3.age = 20;
	
	    System.out.println("\n" + "Details of Student3:" + "\n");
		//System.out.println("\r\n" + "Details of Student3:" + "\r\n");
		student3.StudentDisplay();
		
		Student student4 = new Student();
		
		student4.id = "D0004";
		student4.name = "D4";
		student4.DOB = "01 Jan 2003";
		student4.age = 19;
	
	    System.out.println("\n" + "Details of Student4:" + "\n");
		//System.out.println("\r\n" + "Details of Student4:" + "\r\n");
		student4.StudentDisplay();
		
		Student student5 = new Student();
		
		student5.id = "E0005";
		student5.name = "E5";
		student5.DOB = "01 Jan 2004";
		student5.age = 18;
	
	    //System.out.println("\r\n" + "Details of Student5:" + "\r\n");
		System.out.println("\n" + "Details of Student5:" + "\n");
		student5.StudentDisplay();
		
	}
	
	

}
