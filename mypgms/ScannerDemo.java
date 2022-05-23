import java.util.Scanner;

class ScannerDemo {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);

    //System.out.print("Enter number name: ");
	
	//int a = input.nextInt();
	

    // takes input from the keyboard
    //String name = input.nextLine();
	System.out.println("Enter number a: ");
	int a = input.nextInt();
	int b = input.nextInt();
	int sum = a+b;
    // prints the name
    System.out.println("the a number is " + a);
	System.out.println("the b number is " + b);
	System.out.println("the Sum of two number is " + sum);
	

    // closes the scanner
    input.close();
  }
}