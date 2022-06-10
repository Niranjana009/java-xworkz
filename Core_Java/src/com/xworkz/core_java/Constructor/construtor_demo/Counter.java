package com.xworkz.core_java.Constructor.construtor_demo;

public class Counter {

		int count;
		String res;
		double counters;
		
		Counter(){
			//res = " Inside Default Constructor";
			//System.out.println("In constructer");
		}
		
		Counter(int num, double cnt){
			count = num;
			counters = cnt;
			//System.out.println("In constructer");
		}
		
		Counter(double cnt,int num, String str ){
			count = num;
			counters = cnt;
			res = str;
			//System.out.println("In constructer");
		}
}
