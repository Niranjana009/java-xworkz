class ReturnTypeObj{

	int add(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args){
		/*ReturnTypeObj sum = new ReturnTypeObj();
		System.out.println(sum.add(5,4));
		*/
		int sum;
		sum = add(5,6);
		
		System.out.println(sum);
	}

}