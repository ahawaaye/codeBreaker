package masterMind;

import java.util.Scanner;

public class function {
	public int[] CodeGenereren() {
		int[] pins = { 1, 2, 3, 4, 5, 6 };
		int[] antwoordVak1 = { pins[4], pins[1], pins[5], pins[0] };

		return antwoordVak1;

	}

	public int[] userInput() {

		Scanner sc = new Scanner(System.in);
		int[] codeCrackerRijvakken1 = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };

		return codeCrackerRijvakken1;

	}

public  int poging () {
	
	
	for (int poging1 = 1; poging1 <= 10; poging1++) {
		System.out.println("poging" + ' ' + poging1);
	
	
	return 0;
	
	
	
	
	
}

}


