import java.util.*;

public class MainGame {

	public static void main(String[] args) {
		// secret number guessing game, that counts how many guesses it took you
		// and if the score was good or bad

		Scanner input = new Scanner(System.in);

		// Introduction and random number selection between 1-10
		System.out.println("Hey you!" + "\n\n"
				+ "Word on the street says you're a pretty good number guesser. I beg to differ, nobody has ever guessed my number correctly in the entire history of number guessing!"
				+ "\n\n"
				+ "See if you can guess my number hotshot! I'm thinking of a number between 1 and 10, and no mindreading, because thats cheating!\n");
		int secretNum = new Random().nextInt(11 + 1);
		System.out.println(secretNum);
		// MainGame functionality
		try {

			int guess = input.nextInt();
			int count = 0;
			while (guess < 1 || guess > 10) {
				System.out.println(
						"Hey, that's not a number between 1 and 10. You can't count let alone guess my number! Try again, but for real this time...");
				guess = input.nextInt();
				count = 0;
			}
			if(guess == secretNum){
				System.out.println("So it is true what everybody says. You truly are the master number guesser. You have my respects sir, I am sorry I ever doubted you. Please take my money.");
				System.exit(0); 
			}
			while (guess > 1 && guess < 10 && guess != secretNum) {
				count++;
				if (count == 1) {
					System.out.println("That's your first guess? HAH!");
					guess = input.nextInt();
				}
				if (count == 2) {
					System.out.println("Oh come on, are you even trying???");
					guess = input.nextInt();
				}
				if (count == 3) {
					System.out.println("Actually you're getting quite close... NOT!");
					guess = input.nextInt();
				}
				if (count == 4) {
					System.out.println("My grandmother is a better guesser than you!");
					guess = input.nextInt();
				}
				if (count == 5) {
					System.out.println("Okay, now this is getting embarressing.");
					guess = input.nextInt();
				}
				if (count == 6) {
					System.out.println("You are a fake! A sham!");
					guess = input.nextInt();
				}
				if (count == 7) {
					System.out.println("This is pathetic. Forget I even asked!");
					guess = input.nextInt();
				}
				if (count == 8) {
					System.out.println("Wow... Honestly i'm speechless.");
					guess = input.nextInt();
				}
				if (count == 9) {
					System.out.println(
							"I didn't even think it was possible to guess this many times and STILL not get the answer. You should be ashamed. I am reporting you to the number guessing authorities and you are going pay for wasting my time. HORRENDOUS!");
					guess = input.nextInt();
				}

			}
			

		} catch (InputMismatchException ex) {
			System.out.println(
					"You don't even know the difference between a number and a letter. Pathetic. You are no master number guesser.");
		}

	}

}
