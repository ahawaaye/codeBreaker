package masterMind;

import java.util.Scanner;

public class function {
	public int[] CodeGenereren() {
		int[] pins = { 1, 2, 3, 4, 5, 6 };
		int[] antwoordVak1 = { pins[4], pins[1], pins[5], pins[0] }; // 5 2 6 1

		return antwoordVak1;

	}

	public int[] userInput() {
		Scanner sc = new Scanner(System.in);
		int[] codeCrackerRijvakken1 = new int[4];

		for (int i = 0; i < 4; i++) {
			try {
				codeCrackerRijvakken1[i] = sc.nextInt();
			} catch (Exception ex) {
				System.out.println("Ongeldig, gebruik nummers!");
				sc.next();
				i--;
			}

		}

		return codeCrackerRijvakken1;

	}

	public String[] Feedback(int[] antwoordVak1, int[] codeCrackerRijvakken1) {

		String[] feedback = new String[4];
		for (int i = 0; i < antwoordVak1.length; i++) {
			feedback[i] = "fout";
			if (antwoordVak1[i] == codeCrackerRijvakken1[i]) {
				feedback[i] = "wit";
			} else {
				for (int j = 0; j < antwoordVak1.length; j++) {
					if (antwoordVak1[i] == codeCrackerRijvakken1[j]) {
						feedback[i] = "zwart";
						break;

					}
				}

			}

		}

		return feedback;

	}

	public function() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welkom bij Mastermind!");
		System.out.println("Raad de geheime code van 4 cijfers. Elk cijfer is tussen 1 en 6.");
		System.out.println("Je hebt 10 pogingen. Laten we beginnen!");

		return;

	}

	public boolean winning(int[] antwoordVak1, int[] codeCrackerRijvakken1) {

		if (antwoordVak1[0] == codeCrackerRijvakken1[0] && antwoordVak1[1] == codeCrackerRijvakken1[1]
				&& antwoordVak1[2] == codeCrackerRijvakken1[2] && antwoordVak1[3] == codeCrackerRijvakken1[3]) {

			System.out.println("Je hebt gewonnen!!!!!!");

			return true;

		}
		return false;

	}

}
