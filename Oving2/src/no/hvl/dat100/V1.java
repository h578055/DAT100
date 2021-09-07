package no.hvl.dat100;

import javax.swing.JOptionPane;

public class V1 {
	
	public static void main (String[]args) {
		
		String input1 = JOptionPane.showInputDialog("Skriv inn tall 1: ");
		String input2 = JOptionPane.showInputDialog("Skriv inn tall 2: ");
		String input3 = JOptionPane.showInputDialog("Skriv inn tall 3: ");
		
		int tall1 = Integer.parseInt(input1);
		int tall2 = Integer.parseInt(input2);
		int tall3 = Integer.parseInt(input3);

		//Testing	
//		int tall1 = 0;
//		int tall2 = 2;
//		int tall3 = 1;
		
		int minste = tall1;
		
		//To if-løkker
//		if(tall1 >= tall2) {
//			
//			minste = tall2;
//			
//		}
//		
//		if(tall1 > tall3) {
//			minste = tall3;
//		}
		
		if(tall1 <= tall2 && tall1 <= tall3) {
			minste = tall1;
		}else if(tall2 <= tall1 && tall2 <= tall3) {
			minste = tall2;
		}else {
			minste = tall3;
		}
			
		
		//Testing
//		System.out.println(minste);
		JOptionPane.showMessageDialog(null, "Det minste tallet du skrev inn er: " + minste);
		
		
	}

}
