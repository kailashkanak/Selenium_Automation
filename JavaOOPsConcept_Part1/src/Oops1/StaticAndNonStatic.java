package Oops1;

public class StaticAndNonStatic {
	String name = "Kumar";
	static int age = 25;

	public static void main(String[] args) {
		// How to call static methods and variables
		//1. Direct calling
		sum();
		System.out.println(age);
		
		
		//2. calling by class name
		StaticAndNonStatic.sum();
		System.out.println(StaticAndNonStatic.age);
		
		//How to call Non-static methods and variables
		//To call Non-static methods or variables, we call by class object
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		//Can I access static method by using object reference? The answer is Yes, but it will display a warning message
		obj.sum();//It will run by displaying a warning message
		
		c zx
		

	}
	public void sendMail() {
		System.out.println("Send Mail Method");      
	}
	public static void sum() {
		System.out.println("Sum Method");
	}
	

}
