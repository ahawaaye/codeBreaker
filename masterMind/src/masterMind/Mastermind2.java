package masterMind;

import java.util.Scanner;

public class Mastermind2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] pins = { 1, 2, 3, 4, 5, 6 };
		int[] pinsCodeMaker = { 7, 8, 9 };

		function fn = new function();

		int[] antwoordVak1 = fn.CodeGenereren();

		int[] codeMakerRijen1 = { 9, 9, 9, 9 };

		for (int poging1 = 1; poging1 <= 10; poging1++) {
			int[] codeCrackerRijvakken1 = fn.userInput();
			System.out.println("poging" + ' ' + poging1);
			// start corrective vak1

			String[] Feedback = fn.Feedback(antwoordVak1, codeCrackerRijvakken1);

			for (String feedbackString : Feedback) {

				System.out.println(feedbackString);
			}

			// alles

			boolean winning = fn.winning(antwoordVak1, codeCrackerRijvakken1);

			if (winning) {
				break;

			}

			if (poging1 == 10)
				System.out.println("helaas je hebt niet gewonnen");
		}

		// TODO Auto-generated method stub

	}

}
