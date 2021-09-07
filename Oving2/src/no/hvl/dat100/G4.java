package no.hvl.dat100;

import javax.swing.JOptionPane;

public class G4 {
	
	public static void main (String[] args) {
		
		String tallTxt = JOptionPane.showInputDialog("Gi et tall:");

		int tall = Integer.parseInt(tallTxt);
		
		//a
//		System.out.println(tall);
		
		//b
		for(int i = 0; i <= 4; i++) {
			System.out.println(tall);
		}
		
	}

}
