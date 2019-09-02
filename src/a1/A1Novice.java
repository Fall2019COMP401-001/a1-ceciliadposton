package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Read how many customers there are.
		
		int count = scan.nextInt();
		
		// Create an array to store each customer.
		
		String[] firstname = new String[count];
		char[] firstinitials = new char[count];
		String[] lastname = new String[count];
		int[] amtbought = new int[count];
		double[] totalcost = new double[count];
		
		// Put first names in array
		for (int i=0; i < (firstname.length); i++) {
			firstname[i] = scan.next();
			lastname[i] = scan.next();
			amtbought[i] = scan.nextInt();
			for (int j=0; j < (amtbought[i]); j++) {
				int[] itemsbought = new int[amtbought[i]];
				String[] itembought = new String[amtbought[i]];
				itemsbought[j] = scan.nextInt();
				itembought[j] = scan.next();
				totalcost[i] = totalcost[i] + scan.nextDouble();
			}
		}
				
		// Put first initials in array
		for (int i=0; i<firstname.length; i++) {
			firstinitials[i] = firstname[i].charAt(0);
		}
		
		for (int i=0; i<firstname.length; i++) {
		System.out.println(firstinitials[i] + ". " + lastname[i] + ": " + totalcost[i]);
		}
	}
}
