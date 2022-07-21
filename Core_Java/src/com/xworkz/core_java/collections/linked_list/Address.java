package com.xworkz.core_java.collections.linked_list;

public class Address {
	private String name;

	  private String street;

	  private String city;

	  private String state;

	  private String code;

	  Address(String n, String s, String c, String st, String cd) {
	    name = n;
	    street = s;
	    city = c;
	    state = st;
	    code = cd;
	  }

	  public String toString() {
	    return name + " " + street + " " + city + " " + state + " " + code;
	  }
}
