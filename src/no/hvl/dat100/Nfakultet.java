package no.hvl.dat100;

public class Nfakultet {
	
	public static int fak(int n) {
		if(n == 1) return n;
		return n * fak(n - 1);
				
		
	} 
	public static void main(String[] args) {
		System.out.println("1! = " + fak(1));
		System.out.println("2! = " + fak(2));
		System.out.println("3! = " + fak(3));
		System.out.println("4! = " + fak(4));
		System.out.println("5! = " + fak(5));
		System.out.println("6! = " + fak(6));
		System.out.println("7! = " + fak(7));
		System.out.println("8! = " + fak(8));
		System.out.println("9! = " + fak(9));
		System.out.println("10! = " + fak(10));
		System.out.println("11! = " + fak(11));
		System.out.println("12! = " + fak(12));
		
		}
	
	}	

