package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Karakterskala {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			String antallPoeng = JOptionPane.showInputDialog("Poeng?");
			int poeng = Integer.parseInt(antallPoeng);
			
			if(poeng <= 100 && poeng >= 90) {
				System.out.println("A");
			}
			if(poeng <= 89 && poeng >= 80) {
				System.out.println("B");
			}
			if(poeng <= 79 && poeng >= 60) {
				System.out.println("C");
			}
			if(poeng <= 59 && poeng >= 50) {
				System.out.println("D");
			}
			if(poeng <= 49 && poeng >= 40) {
				System.out.println("D");
			}
			if(poeng <= 39 && poeng >= 0) {
				System.out.println("E");
				
			} else if (poeng <= 0 || poeng > 100) {
				System.out.println("Poeng ikke innenfor karakterskala. Skriv inn på nytt.");
				i++; 
	}
		}

	}

	}