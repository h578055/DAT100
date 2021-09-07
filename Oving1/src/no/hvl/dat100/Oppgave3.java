package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Oppgave3 {
	
	public static void main (String[] args) {
		
		String inputDag = JOptionPane.showInputDialog("Velg dagnummer: ");
		String inputMnd = JOptionPane.showInputDialog("Velg månednummer: ");
		String inputAar = JOptionPane.showInputDialog("Velg årstall: ");
		
		int dag = Integer.parseInt(inputDag);
		int mnd = Integer.parseInt(inputMnd);
		int aar = Integer.parseInt(inputAar);
		
		String dagIAaret = dag + "." + mnd + "." + aar;
		
		JOptionPane.showMessageDialog(null, "Her er dagen du har tastet inn: " + dagIAaret);
		
	}

}
