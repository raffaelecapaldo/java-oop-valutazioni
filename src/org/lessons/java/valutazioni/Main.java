package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Studente[] studenti = new Studente[20];
		Random rand = new Random();
		
		for (int i = 0; i < studenti.length; i++) {
			studenti[i] = new Studente(i+1, rand.nextInt(101), rand.nextDouble(1,5));
			
		}
		
		int nGraduated = 0;
		for (int i = 0; i < studenti.length; i++) {
			studenti[i].printInfo();
			boolean rejected = studenti[i].isRejected();
			if (rejected) {
				System.out.println("Lo studente con ID " + studenti[i].id + " è BOCCIATO");
			}
			else {
				System.out.println("Lo studente con ID " + studenti[i].id +  " è PROMOSSO");
				nGraduated++;

			}
			System.out.println();
		}
		
		System.out.println("\n -----------------------------");
		System.out.println("Sono stati promossi: " + nGraduated + " studenti");
		
	}

}
