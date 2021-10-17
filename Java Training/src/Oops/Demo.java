package Oops;
class Person{
	String name;
	String email;
	String phone;
	void walk() {
		System.out.println(name+"is walking");
	}
	void mail() {
		System.out.println(email+  phone);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.name="roja";
		p1.email="rd@2021.com";
		p1.phone="9675823";
		p1.walk();
		p1.mail();

	}

}
