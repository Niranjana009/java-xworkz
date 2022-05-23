class PostPre{
	public static void main(String[] args){
						int a = 10;
						int b = 20;
						int c = 30;
						
						c = a; // 10
						--a; // 9
						
						System.out.println("c" +(c++)); // 10 , c incremented to 11
						System.out.println("a" +(a++)); // 9, a incremented to 10
						System.out.println("b" +(b--)); // 20, b decremented to 19
						System.out.println("b" +(--b)+"c"+(--c)); //(18) , (10)
						System.out.println("a" +a); // 9
						System.out.println("b" +b); // 18
						System.out.println("c" +c); // 10
	}
}