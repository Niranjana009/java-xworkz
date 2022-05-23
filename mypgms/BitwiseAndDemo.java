class BitwiseAndDemo{
	public static void main(String[] args){
		int p = 2;
		int q = 4;
		
		System.out.println((p<q) & (++p!=q) & (++p==q)); //true
						// t          t           t
		System.out.println("p:"+p); //4
		System.out.println("q:"+q); //4
	}
}