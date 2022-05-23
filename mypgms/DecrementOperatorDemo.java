class DecrementOperatorDemo{
	public static void main(String args[]){
		//pre decrement
		
		int  a = 10;
		int b = --a;
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		
		System.out.println("a :" + (--a));
		System.out.println("b :" + b);
		
		//post decrement
		int x = 100;
		x--; //99
		int y = x; //99
		
		System.out.println("x :" + (x--)); //99
		System.out.println("b :" + (--y)); //98
		
	}
}