package Basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle="The Lords of the Rings";
		String wordChoice="Ring";
		if(bookTitle.contains(wordChoice)) {
			System.out.println("We got the Word");
		}
		String browser="chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome is the browser");
		}
		String firstName="i have a book";
		System.out.println(firstName.substring(0,6));
		System.out.println(firstName.length());
		

	}

}
