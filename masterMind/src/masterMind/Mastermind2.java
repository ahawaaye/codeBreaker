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

		for (int poging1 = 1; poging1 <= 10; poging1++ ) {
			int[] codeCrackerRijvakken1 = fn.userInput();
			System.out.println("poging" + ' ' + poging1);
			// start corrective vak1
			
			String feedback = "Geen";

			for (int i = 0; i < antwoordVak1.length; i++) {
				if (antwoordVak1[i] == codeCrackerRijvakken1[i]) {
					feedback = "wit";
				} else {
					for (int j = 0; j < antwoordVak1.length; j++) {
						if (antwoordVak1[j] == codeCrackerRijvakken1[j] && i != j) {
							feedback = "zwart";

						}
					}
				}
			}
			// alles

			if (antwoordVak1[0] == codeCrackerRijvakken1[0] && antwoordVak1[1] == codeCrackerRijvakken1[1]
					&& antwoordVak1[2] ==codeCrackerRijvakken1[2] && antwoordVak1[3] == codeCrackerRijvakken1[3]) {

				System.out.println("je hebt gewonnen!!!!!!");
				break;

			}
			if (poging1 == 10) 
				System.out.println("helaas je hebt niet gewonnen");
			}

			// TODO Auto-generated method stub

		}
	
}
