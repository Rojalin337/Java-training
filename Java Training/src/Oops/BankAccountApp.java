package Oops;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountDetails b1= new BankAccountDetails();
		BankAccountDetails b2=new BankAccountDetails("saving");
		BankAccountDetails b3=new BankAccountDetails("saving","SBIN45678",2000);
		b1.setRate();
		b1.getRate();
	}
	

}
