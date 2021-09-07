package no.hvl.dat100;

import javax.swing.JOptionPane;

public class G3 {
	
	public static void main (String[] args) {
	
		String inputA = JOptionPane.showInputDialog("Velg telleren din: ");
		String inputB = JOptionPane.showInputDialog("Velg nemnaren din: ");
		
		int a = Integer.parseInt(inputA);
		int b = Integer.parseInt(inputB);
		
		if(b != 0) {
			
			int dele = a / b;
			JOptionPane.showMessageDialog(null, "Teller din, delt med nemnaren din er: " + dele);
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Feil, du har tastet inn 0 som nemner, det er ikkje lov i matten, prøv på nytt.");
			main(args);
			
		}
		
	}
}
