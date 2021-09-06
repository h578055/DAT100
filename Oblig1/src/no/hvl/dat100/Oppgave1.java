package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave1 {
	
	public static void main (String[] args) {
		
		String input = JOptionPane.showInputDialog("Hva er din lønn? ");
		
		int lonn = Integer.parseInt(input);
		
		int skattetrinn;
		
		if(lonn < 164100) {
			skattetrinn = 0;
		} else if(lonn > 164100 && lonn < 230950) {
			skattetrinn = 1;
		} else if(lonn > 230950 && lonn < 580650) {
			skattetrinn = 2;
		} else if(lonn > 580650 && lonn < 934050) {
			skattetrinn = 3;
		} else {
			skattetrinn = 4;
		}
		
		JOptionPane.showMessageDialog(null, "Ditt skattetrinn er: " + skattetrinn);
		
	}

}
