class AirthematicOp{
	
	public static void main(String[] args){
		int a = 100;
		int b = 100;
		/*
		int opSum;
		int opSub;
		int opMul;
		double opDiv;
		double opRem;
		*/
		int opSum = a+b;
		int opSub = a-b;
		int opMul = a*b;
		double opDiv = a/b;
		double opRem = a%b;
		
		System.out.println ("\n"+"\t"+"==========Airthematic Operations==========");
		System.out.println ("\n"+"\t"+"Operands value a="+a+"\t"+"and"+"\t"+"b="+b);
		System.out.println ("\n"+"\t"+"\"Sum operations result is \""+"a+b = " +opSum);
		System.out.println ("\n"+"\t"+"\"Sub operations result is \""+"a-b = " +opSub);
		System.out.println ("\n"+"\t"+"\"Multiplication operations result is\""+" a*b = "+opMul);
		System.out.println ("\n"+"\t"+"\"Division quotient operations result is\""+" a/b = "+opDiv);
		System.out.println ("\n"+"\t"+"\"Division Remainder operations result is\""+" a%b = "+opRem);
		
	}
}