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
		
		//BONUS
		
		Studente[] promotedStudents = new Studente[nGraduated];
		Studente[] rejectedStudents = new Studente[20-nGraduated];
		
		int counterP = 0;
		int counterR = 0;
		for (int i = 0; i < studenti.length; i++) {


			if (studenti[i].isRejected()) {
				rejectedStudents[counterP] = studenti[i];
				counterP++;
			}
			else {
				promotedStudents[counterR] = studenti[i];
				counterR++;

			}
		}
		
		//SOLO PROMOSSI STAMPA
		System.out.println("\n--------------SOLO PROMOSSI");
		//SOLO PROMOSSI
		for (int i = 0; i < promotedStudents.length; i++) {
			promotedStudents[i].printInfo();
		}
		
		//SOLO BOCCIATI STAMPA
				System.out.println("\n---------------------SOLO BOCCIATI");
				//SOLO BOCCIATI
				for (int i = 0; i < rejectedStudents.length; i++) {
					rejectedStudents[i].printInfo();
				}
				
				System.out.println();
		
			int lowestAvgID = 0;
			double min = rejectedStudents[0].avgVotes;
		for (int i = 1; i < rejectedStudents.length; i++) {
			
			if (rejectedStudents[i].avgVotes < min) {
				lowestAvgID = rejectedStudents[i].id;
			}
			
		}
		
		int highestAvgID = 0;
		double max = promotedStudents[0].avgVotes;
		
		for (int i = 1; i < promotedStudents.length; i++) {
			if (promotedStudents[i].avgVotes > max) {
				highestAvgID = promotedStudents[i].id;
			}
		}
		
		System.out.println("Il bocciato coi voti più bassi ha ID " + lowestAvgID);
		System.out.println("Il promosso coi voti più alti ha ID " + highestAvgID);

	}

}
