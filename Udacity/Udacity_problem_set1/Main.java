

// A pdf file containing this set of problems follows the project
public class Main {

	private static void problem1() {
		System.out.println("Problem 1");
		System.out.println("String name = 'Adam' \nBecause ' marks are used to define chars and not strings.");
	}
	
	private static void problem2(){
		System.out.println("Problem 2");
		System.out.println(10+5-2-5+10-3);
	}	
	
	private static void problem3(){
		System.out.println("Problem 3");
		
		int bankBalance = 500;
		bankBalance += 250;
		bankBalance -= 100;
		System.out.println(bankBalance);
		
	}
	
	private static void problem4(){
		System.out.println("Problem 4");		
		// 5/2     = 2
		// 2.0 * 2 = 4.0  
		System.out.println("4.0");
	}	
	
	private static void problem5(){
		System.out.println("Problem 5");
		int day = 5;
		String month = "January";
		System.out.println("I was born at " + month + " " + day);
	}	
	
	private static void problem6(){
		System.out.println("Problem 6");
		String firstName = "Eduardo";
		String lastName  = "Castanho";
		String fullName  = firstName + " " + lastName;
		System.out.println("Hello, my name is " + fullName + '.');
		System.out.println("There are " + (firstName.length() + lastName.length()) + " letters in my name.");
	}		

	private static void problem7(){
		System.out.println("Problem 7");
		double fahrenheit = 68.0; 
		double celsius    = 5.0 * (fahrenheit - 32.0) / 9.0;
		System.out.println(celsius);
	}			
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem1();
		problem2();
		problem3();
		problem4();
		problem5();
		problem6();
		problem7();
	}

}
