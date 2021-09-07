package no.hvl.dat100;

import javax.swing.JOptionPane;

public class B3 {
	
	public static void main (String[]args) {
		
		String inputBrukernavn = JOptionPane.showInputDialog("Skriv inn brukernavn: ");
		String inputPassord = JOptionPane.showInputDialog("Skriv inn passordet: ");
		
		String brukernavn = "kris.eliassen";
		String passord = "hei.123";
		
		if(inputBrukernavn.contentEquals(brukernavn) && inputPassord.contentEquals(passord)) {
			JOptionPane.showMessageDialog(null, "Voila, du klarte det!");
		} else if(inputBrukernavn.contentEquals(brukernavn) && !inputPassord.contentEquals(passord)){
			JOptionPane.showMessageDialog(null, "Feil passord, prøv på nytt");
			main(args);
		} else if(!inputBrukernavn.contentEquals(brukernavn) && inputPassord.contentEquals(passord)) {
			JOptionPane.showMessageDialog(null, "Brukernavnet eksisterer ikke, prøv på nytt");
			main(args);
		}
		
	}

}
