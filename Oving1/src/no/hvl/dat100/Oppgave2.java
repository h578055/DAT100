package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave2 {
	
	public static void main (String[] args) {
		
		String input1 = JOptionPane.showInputDialog("Skriv inn tall 1: ");
		String input2 = JOptionPane.showInputDialog("Skriv inn tall 2: ");
		String input3 = JOptionPane.showInputDialog("Skriv inn tall 3: ");
		String input4 = JOptionPane.showInputDialog("Skriv inn tall 4: ");
		
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		int c = Integer.parseInt(input3);
		int d = Integer.parseInt(input4);
	
		int min1 = Math.min(a, b);
		int min2 = Math.min(b, c);
		int min3 = Math.min(c, d);
		int min4 = Math.min(min1, min2);
		int min5 = Math.min(min2, min3);
		int min6 = Math.min(min4, min5);
		
		
		JOptionPane.showMessageDialog(null, "Det minste av de du tastet inn er: " + min6);
		
	}

}
