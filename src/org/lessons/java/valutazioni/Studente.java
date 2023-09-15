package org.lessons.java.valutazioni;

public class Studente {

	int id;
	int percAbsences;
	double avgVotes;
	
	Studente(int id, int percAbsences, double avgVotes) {
		this.id = id;
		this.percAbsences = percAbsences;
		this.avgVotes = avgVotes;
	}
	public boolean isRejected() {
		boolean rejected = true;
		
		if (this.percAbsences > 50) {
			return rejected;
		}
		else if (this.percAbsences >= 25 && this.percAbsences <= 50 && this.avgVotes >= 2) {
			rejected = false;
			return rejected;
		}
		else if (this.percAbsences < 25 && this.avgVotes >= 2) {
			rejected = false;
			return rejected;
		}
		
		return rejected;

		
	}
	
	public void printInfo() {
		String info = "ID STUDENTE: " + this.id + " - PERCENTUALE ASSENZE: " +
					this.percAbsences + "% - MEDIA VOTI: " + String.format("%.1f", this.avgVotes);
		System.out.println(info);
	}
	
}
