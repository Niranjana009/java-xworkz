/*Ternary Operator:

shortend statement of if else,
*/
class TernaryDemo{ 
	
	public static void main(String[] agrs){
		int age = 18;
	/*
		if (age >= 18){
			System.out.println("your eligiable to vote");
		}
		else{
			System.out.println("Your not eligiable to vote");
		}
	*/
	String result = age>=18?"Your eligiable":"Your not eligiable";
	System.out.println(result);
	}
}