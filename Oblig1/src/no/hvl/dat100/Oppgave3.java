package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave3 {
	
	public static void main (String[] args) {
		
		//Lagrer input fra dialog boksen
		String input = JOptionPane.showInputDialog("Hvilket tall vil du ha fakultetet av? ");
		
		int n = Integer.parseInt(input);
		
		long fakultet = fakultetRek(n);
		
		JOptionPane.showMessageDialog(null, "Fakultetet av tallet du tastet inn er: " + fakultet);
		
	}
	
	public static long fakultetRek(int n) {
	    if (n <= 2) {
	        return n;
	    }
	    return n * fakultetRek(n - 1);
	}

}
