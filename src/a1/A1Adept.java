package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// read how many items.
		
		
		int countitems = scan.nextInt();

		String[] itemnames = new String[countitems];
		double[] prices = new double[countitems];
		
		for (int i=0; i < (itemnames.length); i++) {
			itemnames[i] = scan.next();
			prices[i] = scan.nextDouble();
			
		}
		
		int countppl = scan.nextInt();
		
		String[] firstname = new String[countppl]; 
		String[] lastname = new String[countppl];
		int[] amtbought = new int[countppl];
		double[] totalcost = new double[countppl];

		for (int i=0; i < (firstname.length); i++) {
			firstname[i] = scan.next();
			lastname[i] = scan.next();
			amtbought[i] = scan.nextInt();
			
			for (int j=0; j < (amtbought[i]); j++) {
				int[] numitemsbought = new int[amtbought[i]];
				String[] itembought = new String[amtbought[i]];
				numitemsbought[j] = scan.nextInt();
				itembought[j] = scan.next();
				double[] costofitembought = new double[amtbought[i]];
				
				for (int k=0; k < (countitems); k++) {
					if (itembought[j].equals(itemnames[k])) {
						costofitembought[j] = prices[k];
					}
				}
				
				totalcost[i] = totalcost[i] + ( numitemsbought[j] * costofitembought[j] );
			}
			
		}
		
		double max = totalcost[0];
		String truemax = "a";
		
		double min = totalcost[0];
		String truemin = "a";
		
		double avg = totalcost[0];
		String trueavg = "a";
				
		for (int i=1; i < totalcost.length; i++) {
			if (totalcost[i] < min) {
				min = totalcost[i];
			}
		}
		
		truemin = String.format("%.2f", min);
		
		for (int i=1; i < totalcost.length; i++) {
			if (totalcost[i] > max) {
				max = totalcost[i];
			}
		}
		
		truemax = String.format("%.2f", max);
		
		double sum = 0;
		
		for (int i=0; i < totalcost.length; i++) {
			sum = totalcost[i] + sum;
		}
		
		avg = ((double) sum) / ((double) totalcost.length) ;
		trueavg = String.format("%.2f", avg);
		
		
		String bigfirstname = "a";
		String biglastname = "a";
		String smallfirstname = "a";
		String smalllastname = "a";

		for (int i=0; i < (totalcost.length); i++) {
			if (max == totalcost[i]) {
				bigfirstname = firstname[i];
				biglastname = lastname[i];
			}
		}

		for (int i=0; i < (totalcost.length); i++) {
			if (min == totalcost[i]) {
				smallfirstname = firstname[i];
				smalllastname = lastname[i];
			}
		}
		
		System.out.println( "Biggest:" + " " + bigfirstname + " " + biglastname + " " + "(" + truemax + ")" );
		System.out.println( "Smallest:" + " " + smallfirstname + " " + smalllastname + " " +  "(" + truemin + ")" );
		System.out.println( "Average:" + trueavg );
		

		
	}
}
