package com.xworkz.core_java.Constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter cnt = new Counter();
		Counter cnt1 = new Counter(4,6);
		Counter cnt2 = new Counter(2,5,"Count");
		System.out.println(cnt.count);
		System.out.println(cnt.counters);
		System.out.println(cnt1.count);
		System.out.println(cnt1.counters);
		System.out.println(cnt1.res);
		System.out.println(cnt2.res);
	}

}
