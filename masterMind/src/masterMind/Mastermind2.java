package masterMind;

import java.util.Scanner;

public class Mastermind2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] pins = { 1, 2, 3, 4, 5, 6 };
		int[] pinsCodeMaker = { 7, 8, 9 };

		function fn = new function();

		int[] antwoordVak1 = fn.CodeGenereren();

		for (int poging = 1; poging <= 10; poging++) {
			System.out.println("poging" + ' ' + poging);
			int[] codeCrackerRijvakken = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };

			int codeMakerRij1Vak1 = 9;
			int codeMakerRij1Vak2 = 9;
			int codeMakerRij1Vak3 = 9;
			int codeMakerRij1Vak4 = 9;

			// start corrective vak1
			if (codeCrackerRijvakken[0] == antwoordVak1[0]) {

				codeMakerRij1Vak1 = antwoordVak1[1];
				System.out.println("vak1: juist (witPin)");

			} else if (codeCrackerRijvakken[0] == antwoordVak1[1] || codeCrackerRijvakken[0] == antwoordVak1[2]
					|| codeCrackerRijvakken[0] == antwoordVak1[3]) {

				codeMakerRij1Vak1 = pinsCodeMaker[2];
				System.out.println("vak1: juiste kleur, verkeerde vak (zwartPin) ");
			} else {
				System.out.println("vak1: fout");
			}

			// vak2
			if (codeCrackerRijvakken[1] == antwoordVak1[1]) {
				codeMakerRij1Vak2 = pinsCodeMaker[2];
				System.out.println("vak2: juist (witPin)");
			} else if (codeCrackerRijvakken[1] == antwoordVak1[0] || codeCrackerRijvakken[1] == antwoordVak1[2]
					|| codeCrackerRijvakken[1] == antwoordVak1[3]) {
				codeMakerRij1Vak2 = pinsCodeMaker[0];
				System.out.println("vak2: jusite kleur, verkeerde vak (zwartPin)");
			} else {
				System.out.println("vak2: fout");
			}

			// vak 3
			if (codeCrackerRijvakken[2] == antwoordVak1[2]) {
				codeMakerRij1Vak3 = pinsCodeMaker[2];
				System.out.println("vak3: juist (witPin)");
			} else if (codeCrackerRijvakken[2] == antwoordVak1[0] || codeCrackerRijvakken[2] == antwoordVak1[1]
					|| codeCrackerRijvakken[2] == antwoordVak1[3]) {
				codeMakerRij1Vak2 = pinsCodeMaker[0];
				System.out.println("vak3: jusite kleur, verkeerde vak (zwartPin)");
			} else {
				System.out.println("vak3: fout");
			}

			// vak4

			if (codeCrackerRijvakken[3] == antwoordVak1[3]) {
				codeMakerRij1Vak4 = pinsCodeMaker[2];
				System.out.println("vak4: juist (witPin)");
			} else if (codeCrackerRijvakken[3] == antwoordVak1[0] || codeCrackerRijvakken[3] == antwoordVak1[1]
					|| codeCrackerRijvakken[3] == antwoordVak1[2]) {
				codeMakerRij1Vak2 = pinsCodeMaker[0];
				System.out.println("vak4: jusite kleur, verkeerde vak (zwartPin)");
			} else {
				System.out.println("vak4: fout");
			}

			// alles

			if (codeMakerRij1Vak1 == pinsCodeMaker[2] && codeMakerRij1Vak2 == pinsCodeMaker[2]
					&& codeMakerRij1Vak3 == pinsCodeMaker[2] && codeMakerRij1Vak4 == pinsCodeMaker[2]) {

				System.out.println("je hebt gewonnen!!!!!!");
				break;

			}
			if (poging == 10) {
				System.out.println("helaas je hebt niet gewonnen");
			}

			// TODO Auto-generated method stub

		}
	}
}
