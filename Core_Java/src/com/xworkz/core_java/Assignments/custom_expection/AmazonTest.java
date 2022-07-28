package com.xworkz.core_java.Assignments.custom_expection;


public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon item = new Amazon();
		String searchItem = "car";
		try {
			amazon.finditems(searchItem);
			
		}catch(AmazonException e){
			if(amount>50000) {
				System.out.println(e);
			}
			else {
				System.out.println(e.getMessage());
			}
		}
	}

}
