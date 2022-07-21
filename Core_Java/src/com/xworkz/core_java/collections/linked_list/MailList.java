package com.xworkz.core_java.collections.linked_list;

import java.util.LinkedList;

public class MailList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Address> ml = new LinkedList<Address>();

	    ml.add(new Address("A", "11 Ave", "U", "IL", "11111"));
	    ml.add(new Address("R", "11 Lane", "M", "IL", "22222"));
	    ml.add(new Address("T", "8 St", "C", "IL", "33333"));

	    for (Address element : ml)
	      System.out.println(element + "\n");

	  }
	}


