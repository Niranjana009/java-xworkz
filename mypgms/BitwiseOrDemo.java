class BitwiseOrDemo{
	public static void main(String args[]){
		int x = 1000;
		int y = 2000;
		
		System.out.println((x<y) | (x>y++)); //true
		System.out.println(x); //1000
		System.out.println(y); //2001
	
	}
}