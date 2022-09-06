package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Trinnskatt {

	public static void main(String[] args) {

	int brutto = Integer.parseInt(JOptionPane.showInputDialog("Hva er bruttolønnen?"));
	double pros1 = 1.7 / 100;
	double pros2 = 2.41 / 100;
	double pros3 = 11.52 / 100;
	double pros4 = 14.52 / 100;	
	double trinn1 = 164100;
	double trinn2 = 230950;
	double trinn3 = 580651;
	double trinn4 = 934051;	
	double diff;
	double rest;
	double restrund;	
	double trinn_12 = (trinn2 - trinn1) * pros1;
	double trinn_23 = (trinn3 - trinn2) * pros2;
	double trinn_34 = (trinn4 - trinn3) * pros3;
	double skatt;	
	String betale = "Vedkommende skal betale ";
	String kr = " kr i trinnskatt.";

	if (brutto <= trinn1) {
		JOptionPane.showMessageDialog(null, "0" + kr);		
	} else if (brutto <= trinn2) {
		diff = brutto - trinn1;
		rest = diff * pros1;
		restrund = Math.round(rest);
		JOptionPane.showMessageDialog(null, betale + restrund + kr);		
	} else if (brutto <= trinn3) {	
		diff = brutto - trinn3;
		rest = diff * pros2;
		skatt = Math.round(rest + trinn_12);
		JOptionPane.showMessageDialog(null, betale + skatt + kr);			
	} else if (brutto <= trinn4) {
		diff = brutto - trinn3;
		rest = diff * pros3;
		skatt = Math.round(rest + trinn_12 + trinn_23);
		JOptionPane.showMessageDialog(null, betale + skatt + kr);		
	} else {
		diff = brutto - trinn4;
		rest = diff * pros4;
		skatt = Math.round(rest + trinn_12 + trinn_23 + trinn_34);
		JOptionPane.showMessageDialog(null, betale + skatt + kr);
}
			}
}