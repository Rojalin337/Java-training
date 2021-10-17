package Basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		String career;
		System.out.println("package is starting");
		career="Software Developer";
		System.out.println("My career : "+ career);
		//to calculate salary, we need hoursperweek*weeksperyear*rate
		int hoursPerWeek=40;
		int weeksPerYear=50;
		double rate=42.5;
		double salary = hoursPerWeek*weeksPerYear*rate;
		career="Web developer";
		System.out.print("My career is "+career +" at the rate of "+rate+" per hours "+salary+" per year.");

	}

}
