
public class Main {

	private static void problem1() {
		System.out.println("Problem 1");
		// balance will value 0 in the end, so it will print
		System.out.println("We broke even.");
	}

	private static void problem2() {
		System.out.println("Problem 2");
		System.out.println("I guess you like cats more");
	}

	private static void problem3(boolean see, boolean power) {
		System.out.println("Problem 3");
		boolean canSeePlayer = see;
		boolean playerPoweredUp = power;
		if (canSeePlayer) {
			if (!playerPoweredUp) {
				System.out.println("Attack!");
			} else {
				System.out.println("Run away!");
			}
		} else {
			System.out.println("Wander.");
		}
	}

	private static void problem4(boolean isSnowing, boolean isRaining, double temperature) {
		System.out.println("Problem 4");
		if (isSnowing || isRaining || temperature < 50.0)
			System.out.println("Let's stay home.");
		else
			System.out.println("Let's go out!");
	}

	private static void problem5(double time) {
		System.out.println("Problem 5");
		String timeOfDay;
		if (5 <= time && time < 12) {
			System.out.println("morning");
			timeOfDay = "morning";
		} else if (12 <= time && time < 20) {
			System.out.println("daytime");
			timeOfDay = "daytime";
		} else {
			System.out.println("night");
			timeOfDay = "night";
		}
	}

	private static void problem6(int dayOfTheWeek, boolean holiday) {
		System.out.println("Problem 6");
		if(!holiday && dayOfTheWeek != 6 && dayOfTheWeek != 7)
			System.out.println("Wake up at 7:00");
		else
			System.out.println("Sleep in!");
	}

	private static void problem7() {
		System.out.println("Problem 7");
		String b = "the scope of variable rewindAmount is only inside the if statement, so the last line have a problem";
		System.out.println(b);		
	}

	private static void problem8(int dayOfWeek) {
		System.out.println("Problem 8");
		//decided to do a variant of what was asked. It has the same level of dificulty 
		switch(dayOfWeek){
			case 1:
				System.out.println("Gym in the morning.");
				break;
			case 2:
				System.out.println("Class after work.");
				break;
			case 3:
				System.out.println("Meetings all day.");
				break;
			case 4:
				System.out.println("Work from home.");
				break;
			case 5:
				System.out.println("Game night after work.");
				break;
			default:
				System.out.println("Free!");
				break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem1();
		problem2();
		problem3(true, true);
		problem4(true, true, 30);
		problem5(21);
		problem6(7, false);
		problem7();
		problem8();

	}

}
