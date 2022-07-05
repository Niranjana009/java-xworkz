package com.xworkz.core_java.Assignments.array.watches;

public class Watches {
	String brand;
	String color;
	String type;
	double price;
	
	public Watches(String brand,
				String color,String type,
				double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.type = type;

}

	@Override
	public String toString() {
		return "Watches [brand=" + brand + ", color=" + color + ", type=" + type + ", price=" + price + "]";
	}
}
