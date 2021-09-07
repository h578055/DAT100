package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave4 {
	
	public static void main (String[] args) {
		
		String inputSek = JOptionPane.showInputDialog("Skriv antall sekunder: ");
		
		int sek = Integer.parseInt(inputSek);
		int min = 0;
		int time = 0;
		
		if(sek >= 60) {
			min = sek / 60;
			sek = sek % 60;
			if(min >= 60) {
				time = min / 60;
				min = min % 60;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Det blir " + time + "timer, "+ min + "minutter, og " + sek + "sekunder");
		
		
	}

}
