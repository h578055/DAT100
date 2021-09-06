package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave2 {
	
	public static void main (String[] args) {
		
		//Lagrer input fra dialog boksen
		String input = JOptionPane.showInputDialog("Hva var din score på prøven? ");
		//Gjør string input om til integer
		int score = Integer.parseInt(input);
		
		String melding = "";
		
		String feilmelding = "";
		
		//Sjekker scoren som er tastet inn mot scoringssystemet, og bestemmer karakter, eller feilmelding
		if(score < 0) {
			feilmelding = "Feil, du kan ikke ha mindre enn 0 i score, prøv igjen.";
		} else if(score >= 0 && score < 40) {
			melding = "F";
		}  else if(score >= 40 && score < 50) {
			melding = "E";
		} else if(score >= 50 && score < 60) {
			melding = "d";
		} else if(score >= 60 && score < 80) {
			melding = "C";
		} else if(score >= 80 && score < 90) {
			melding = "B";
		} else if(score >= 90 && score <= 100) {
			melding = "A";
		} else if(score > 100) {
			feilmelding = "Feil, du kan ikke ha mer enn 100 i score, prøv igjen";
		}
		
		//sjekker om det er lagret noe i feilmelding. Er det lagret noe i den så har det skjedd en feil.
		if(feilmelding.length() != 0) {
			JOptionPane.showMessageDialog(null, feilmelding);
			//For å kjøre koden på nytt, istedet for å starte programmet om igjen. Vil bli kjørt om igjen heilt til det kommer inn et godkjent tall.
			main(args);
		}else {
			JOptionPane.showMessageDialog(null, "Din karakter er: " + melding);
		}
		
	}

}
