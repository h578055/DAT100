package no.hvl.dat100;

import javax.swing.JOptionPane;

public class B2 {
	
	public static void main (String[]args) {
		
		String inputPris = JOptionPane.showInputDialog("Hva er prisen? ");
		String inputBelop = JOptionPane.showInputDialog("Hva er ditt bel�p? ");
		
		int pris = Integer.parseInt(inputPris);
		int belop = Integer.parseInt(inputBelop);
		
		int rest = belop - pris;
		
		int ti = 0;
		int ein = 0;
		
		if(rest > 0) {
			ti = rest / 10;
			ein = rest % 10;
		}
		
		JOptionPane.showMessageDialog(null, "Du f�r igjen " + ti + " ti-kroninger og " + ein + " ein-kroninger.");
		
	}

}
