package masterMind;

import java.util.Scanner;

public class Mastermind2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int roodPin = 1;
//		int oranjePin = 2;
//		int geelPin = 3;
//		int blauwPin = 4;
//		int paarsPin = 5;
//		int groenPin = 6

		int [] pins = {1,2,3,4,5,6};
		int [] pinsCodeMaker = {7,8,9};
		
//		int zwartPin = 7;
//		int witPin = 8;
//		int niksPin = 9;

//		int codeMakerantwoordrijvak1 = paarsPin;
//		int codeMakerantwoordrijvak2 = oranjePin;
//		int codeMakerantwoordrijvak3 = groenPin;
//		int codeMakerantwoordrijvak4 = roodPin;
		
		int[] antwoordVak1 = {pins[4],pins[1],pins[5],pins[0]};
		

		for (int poging = 1; poging <= 10; poging++) {
			System.out.println("poging"+' ' + poging);
			int codeCrackerRij1Vak1 = sc.nextInt();
			int codeCrackerRij1Vak2 = sc.nextInt();
			int codeCrackerRij1Vak3 = sc.nextInt();
			int codeCrackerRij1Vak4 = sc.nextInt();

			int codeMakerRij1Vak1 = 9; 
			int codeMakerRij1Vak2 = 9;
			int codeMakerRij1Vak3 = 9; 
			int codeMakerRij1Vak4 = 9; 
			

			//start corrective vak1
			if (codeCrackerRij1Vak1 == antwoordVak1[0] ) {

				codeMakerRij1Vak1 = ;
				System.out.println("vak1: juist (witPin)");
				
			} else if (codeCrackerRij1Vak1 == codeMakerantwoordrijvak1 ||
                       codeCrackerRij1Vak1 == codeMakerantwoordrijvak2 ||
                      codeCrackerRij1Vak1 == codeMakerantwoordrijvak3) {
				
			codeMakerRij1Vak1 = zwartPin;
			System.out.println("vak1: juiste kleur, verkeerde vak (zwartPin) ");
			} else { 
				System.out.println("vak1: fout");
			}
			
			//vak2
			if (codeCrackerRij1Vak2 == codeMakerantwoordrijvak2) {
				codeMakerRij1Vak2= witPin; 
				System.out.println("vak2: juist (witPin)");
			}else if (codeCrackerRij1Vak2 == codeMakerantwoordrijvak1 ||
					  codeCrackerRij1Vak2 == codeMakerantwoordrijvak3 ||
					  codeCrackerRij1Vak2 == codeMakerantwoordrijvak4) {
				codeMakerRij1Vak2 = zwartPin;
				System.out.println("vak2: jusite kleur, verkeerde vak (zwartPin)");
			} else {
				System.out.println("vak2: fout");
			}
			
			//vak 3
			if (codeCrackerRij1Vak3 == codeMakerantwoordrijvak3) {
				codeMakerRij1Vak3= witPin; 
				System.out.println("vak3: juist (witPin)");
			}else if (codeCrackerRij1Vak3 == codeMakerantwoordrijvak1 ||
					  codeCrackerRij1Vak3 == codeMakerantwoordrijvak2 ||
					  codeCrackerRij1Vak3 == codeMakerantwoordrijvak4) {
				codeMakerRij1Vak2 = zwartPin;
				System.out.println("vak3: jusite kleur, verkeerde vak (zwartPin)");
			} else {
				System.out.println("vak3: fout");
			}
			
			//vak4
			
			if (codeCrackerRij1Vak4 == codeMakerantwoordrijvak4) {
				codeMakerRij1Vak4= witPin; 
				System.out.println("vak4: juist (witPin)");
			}else if (codeCrackerRij1Vak4 == codeMakerantwoordrijvak1 ||
					  codeCrackerRij1Vak4 == codeMakerantwoordrijvak2 ||
					  codeCrackerRij1Vak4 == codeMakerantwoordrijvak3) {
				codeMakerRij1Vak2 = zwartPin;
				System.out.println("vak4: jusite kleur, verkeerde vak (zwartPin)");
			} else {
				System.out.println("vak4: fout");
			}
			
			//alles 
			
			if (codeMakerRij1Vak1 == witPin &&
				codeMakerRij1Vak2 == witPin &&
				codeMakerRij1Vak3 == witPin &&
				codeMakerRij1Vak4 == witPin) {
				
				System.out.println("je hebt gewonnen!!!!!!");
				break;						
				
			}  
			if   (poging==10) {
				System.out.println("helaas je hebt niet gewonnen");
			}
			
		

		// TODO Auto-generated method stub

			}}}
