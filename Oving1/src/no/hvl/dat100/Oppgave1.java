package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave1 {
	
	public static void main (String[] args) {
		
		String inputLengde = JOptionPane.showInputDialog("Skriv inn lengden du vil ha p� rektangelet ditt: ");
		
		String inputHoyde = JOptionPane.showInputDialog("Skriv inn h�yden du vil ha p� rektangelet ditt: ");
		
		int lengde = Integer.parseInt(inputLengde);
		int hoyde = Integer.parseInt(inputHoyde);

		int areal = lengde * hoyde;
		
		JOptionPane.showMessageDialog(null, "Arealet av lengden og h�yden din er: " + areal);
	}

}
