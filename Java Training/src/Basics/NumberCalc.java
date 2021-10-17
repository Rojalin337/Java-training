package Basics;

public class NumberCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the program is starting");
		printName();
		int num1=34;
		int num2=4;
		addNumbers(num1,num2);
		System.out.println(multipleNumbers(num1,num2));
	}
	static void printName() {
		System.out.println("My name is roja");
	}
	static void addNumbers(int x, int y) {
		int sum = x+y;
		System.out.println("The sum of "+ x +" and "+ y + " "+sum);
		
	}
	static int multipleNumbers(int x, int y) {
		return x*y;
		
	}
	


}
