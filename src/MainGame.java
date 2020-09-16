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
				+ "See if you can guess my number hotshot! I'm thinking of a number between 1 and 10, and no mindreading, because thats cheating! You get as many tries as you'd like, but the more guesses you make the less I believe that you're the master guesser!\n");
		int secretNum = new Random().nextInt(11 + 1);
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
			if (guess == secretNum) {
				System.out.println(
						"\nSo it is true what everybody says. You truly are the master number guesser. You have my respects sir, I am sorry I ever doubted you. Please take my money.");
				System.exit(0);
			}
			while (guess > 1 && guess < 10 && guess != secretNum) {
				count++;
				if (count == 1) {
					System.out.println("\nThat's your first guess? HAH!\n");
					guess = input.nextInt();
				}
				if (count == 2) {
					System.out.println("\nOh come on, are you even trying???\n");
					guess = input.nextInt();
				}
				if (count == 3) {
					System.out.println("\nActually you're getting quite close... NOT!\n");
					guess = input.nextInt();
				}
				if (count == 4) {
					System.out.println("\nMy grandmother is a better guesser than you!\n");
					guess = input.nextInt();
				}
				if (count == 5) {
					System.out.println("\nOkay, now this is getting embarressing.\n");
					guess = input.nextInt();
				}
				if (count == 6) {
					System.out.println("\nYou are a fake! A sham!\n");
					guess = input.nextInt();
				}
				if (count == 7) {
					System.out.println("\nThis is pathetic. Forget I even asked!\n");
					guess = input.nextInt();
				}
				if (count == 8) {
					System.out.println("\nWow... Honestly i'm speechless.\n");
					guess = input.nextInt();
				}
				if (count == 9) {
					System.out.println(
							"\nI didn't even think it was possible to guess this many times and STILL not get the answer. You should be ashamed. I am reporting you to the number guessing authorities and you are going pay for wasting my time. HORRENDOUS!\n");
					guess = input.nextInt();
				}

			}

			switch (count + 1) {
			case 2:
				System.out.println("\nTwo guesses is all it takes hey? You're not so bad after all!");
				break;
			case 3:
				System.out.println(
						"\nHuh! Three guesses. You're just playing around huh? I bet you could guess my number in one guess if you wanted!");
				break;
			case 4:
				System.out.println("\nFour guesses. I'm not sure whether to think thats a fluke or not...");
				break;
			case 5:
				System.out.println("\nFive guesses. Lol just lol ");
				break;
			case 6:
				System.out.println("\nSix guesses! Hey not bad... JK that's really bad.");
				break;
			case 7:
				System.out.println("\nSeven guesses. I'm going to do you a favour and just walk away.");
				break;
			case 8:
				System.out.println("\nEight guesses. Eight guesses... Eight guesses. Eight...");
				break;
			case 9:
				System.out.println("\nNine guesses. Great job, you managed to guess every number BUT mine. You've got some bad luck bucko. See you around, chump.");
				break;
			}

		} catch (InputMismatchException ex) {
			System.out.println(
					"You don't even know the difference between a number and a letter. Pathetic. You are no master number guesser.");
		}

	}

}
