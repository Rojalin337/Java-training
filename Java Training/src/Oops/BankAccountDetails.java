package Oops;

public class BankAccountDetails implements IRate {

	
		String name;
		String accountType;
		String ifsc_no;
		
		BankAccountDetails() {
			System.out.println("Default constructor");
		}
		BankAccountDetails(String name){
		
			System.out.println(name  +" account is  created");
		}
		BankAccountDetails(String accountType,String ifsc_no,double initialdeposit){
			System.out.println(accountType +" "+ ifsc_no +" "+ initialdeposit);
		}
		public void setRate() { 
			System.out.println("the rate is set");
		}
		public void getRate() {
			System.out.println("the rate getting method");
		}
		

	}


