
public class Main {
	
	private static void problem1() {
		System.out.println("Problem 1");
		System.out.println("10->20->40->80");
		System.out.println("The print will be 80");
	}
	
	private static int problem2(int n){
		System.out.println("Problem 2");
		int total = 1;
		if(n==0)
			return 1;
		for(int i = n; i >= 1; i--) {
			total = total * i;
		}
		return total;
	}
	
	private static int problem3(String[] stringArray, String target){
		System.out.println("Problem 3");
		for(int i = 0; i < stringArray.length; i++) {
			if(target.equals(stringArray[i])) {
				return i;
			}
		}
		return -1;
			
	}
	
	private static int problem4(double initial){
		System.out.println("Problem 4");
		int year = 0;
		double goal = 1000000;
		double money = initial;
		while(money < goal) {
			money *= 1.05;
			year++;
		}
		return year;
		
	}
	
	private static void problem5(String [] list){
		System.out.println("Problem 5");
		for(int i = list.length - 1 ; i >= 0;i--)
			System.out.println(list[i]);
	}
	
	private static int problem6(int [] a){
		System.out.println("Problem 6");
		if(a.length == 0)
			return -1;
		int max = a[0];
		int min = a[0];
		for(int i = 0 ; i < a.length; i++) {
			if(a[i]>max)
				max = a[i];
			if(a[i]<min)
				min = a[i];
		}
		return max - min;
	}
	
	private static void problem7(){
		System.out.println("Problem 7");
		System.out.println("#");
		System.out.println("##");
		System.out.println("###");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem1();
		
		int a = problem2(5);
		System.out.println(a);
		
		String [] s = {"Learning", "Java", "is", "fun."};
		int b = problem3(s, "Java");
		System.out.println(b);
		
		System.out.println(problem4(994));
		
		String [] c = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		problem5(c);
		
		int [] d = {1, 0, 2, 3, -1, 2};
		System.out.println(problem6(d));
		
		problem7();
		
	}

}
