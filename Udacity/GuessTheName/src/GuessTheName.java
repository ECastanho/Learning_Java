import java.util.Scanner; 
public class GuessTheName {
	private int randomnum;
	public GuessTheName(){
		System.out.println("Generating a new Guess The Name Game");
		randomnum = (int) (Math.random()*100 + 1);
		}
	public void game(){
		Scanner scan = new Scanner(System.in); 
		int guess;
		boolean won = false;
		System.out.println("Guess a number between 1 and 100");
		System.out.println("You have 10 chances of winning this game");
		for(int i = 10; i>0; i--) {
			System.out.println("Insert a Number between 1 and 100. You have " + i + " chances left");
			guess = scan.nextInt();
			if(guess == randomnum) {
				System.out.println("You won!");
				won = true;
				break;
			}else if(guess > randomnum){
				System.out.println("Not right. Your guess is too high");
			}else
				System.out.println("Not right. Your guess is too Low");
		}
		if(!won)
			System.out.println("You lost the game");
	}
}
