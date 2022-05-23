class IncrementOperatorDemo{
	public static void main(String[] args){
		// Pre increment
		int a = 10;
		int b = ++a;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		System.out.println("a:"+(++a));
		System.out.println("b:"+b);
		
		//post increment
		
		int p = 100;
		
		int q = p++;
		
		
	
	}
}

/*
Assingment
	int x = 10;
	int y = x++;
	
	s.o.p (++y); // 11
	s.o.p (++x); // 12
	s.o.p (x); // 12
	s.o.p (y); // 11
	
	int m = 500;
	int n = 600;
	s.o.p (n++); // 600
	s.o.p (++m); // 501
	s.o.p (++m); // 502
	s.o.p (++n); // 602
	s.o.p (m); // 502
	s.o.p (n); // 602
*/
	
	
	