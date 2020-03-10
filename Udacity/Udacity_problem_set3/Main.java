
public class Main {
	private static void problem1(){
		System.out.println("problem1");
		System.out.println("float");
	}
	
	private static void problem2(){
		System.out.println("problem2");
		System.out.println("public boolean isPrime(int n);");
		
	}
	
	private static void problem3(){
		System.out.println("problem3");
		System.out.println("the first one since it doesn't have a return type");
	}
	
	private static void problem4(){
		System.out.println("problem4");
		System.out.println(absoluteValue(-5.0));
	}	
	
	public static double absoluteValue(double x) {
		if(x < 0)
			return -x;
		else 
			return x;
	}
	
	
	private static void problem5(){
		System.out.println("problem5");
		System.out.println(calculateTip(100.0));
	}
	
	public static double calculateTip(double cost){
		return cost*0.15;
	}
	
	private static void problem6(){
		System.out.println("problem6");
		System.out.println(nametagText("Eduardo"));
	}
	
	public static String nametagText(String name){
		return "Hello, my name is " + name;
	}
	
	private static void problem7(){
		System.out.println("problem7");
		printTemperature(100.0);
	}
	
	
	/**
	* Converts from Fahrenheit to Celsius degrees.
	* @param fahrenheit Temperature in degrees Fahrenheit. * @return Equivalent temperature in degrees Celsius.
	*/
	public static double fahrenheitToCelsius(double f){
		return (f-32.0)*5.0/9.0;
	}
	
	/**
	* Prints a temperature in both Fahrenheit and Celsius degrees. * @param fahrenheit Temperature in degrees Fahrenheit.
	*/
	public static void printTemperature(double f){
		System.out.println("F: " + f);
		System.out.println("C: " + fahrenheitToCelsius(f));
	}
	
	private static void problem8(){
		System.out.println("problem8");
		System.out.println(monopolyRoll());
	}
	
	
	public static int monopolyRoll(){
		return monopolyRoll(0);
	}
	
	
	public static int monopolyRoll(int total){
		int a = rollDice();
		int b = rollDice();
		int result = total + a + b;
		//i am assuming that, if the two new random integers are the same, this process repeats
		if(a==b)
			return monopolyRoll(result);
		else
			return result;
	}
	
	public static int rollDice(){
		double a = Math.random()*6 + 1;
		return (int) a;		
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
		problem8();
	}

}
