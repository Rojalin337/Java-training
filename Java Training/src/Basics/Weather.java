package Basics;

public class Weather {

	public static void main(String[] args) {
		// This program will give suggestions what to wear based on climate.
		int temperature=5;
	  String sunCondition="Overcast";
		if(temperature > 40) {
			System.out.print("it is summer and wear loose dress");
		}
		else if((temperature>60 ) && (sunCondition=="Sunny")) {
			System.out.println("it is rainy ,little bit cold wear some full sleeves.");
			System.out.print("wear sunglasses");
		}
		else {
			System.out.println("the winter season");
		}
		System.out.println("the program is ending");

	}

}
