class ReturnTypeObj{

	static int add(int a, int b){  // a = 5, b = 6
	// greathan(int a, int b))
		//int res = a+b; // 11
		if(a>b){
			prin a
			retun a
		}
		else
			print b
		return b; // res = 11
	}
	
	public static void main(String[] args){
		/*ReturnTypeObj sum = new ReturnTypeObj();
		System.out.println(sum.add(5,4));
		*/
		int sum;
		
		sum = add(5,6); // sum = 11
		
		System.out.println(sum);
	}

}