package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// read how many items.
		
		
		int countitems = scan.nextInt();

		String[] itemnames = new String[countitems];
		double[] prices = new double[countitems];
		int[] numitembought = new int[countitems];
		int[] numamtitembought = new int[countitems];
		
		for (int i=0; i < (itemnames.length); i++) {
			itemnames[i] = scan.next();
			prices[i] = scan.nextDouble();
			numitembought[i] = 0;
			numamtitembought[i] = 0;
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
						numitembought[k] = numitembought[k] + 1;
						numamtitembought[k] = numitemsbought[j] + numamtitembought[k];
					}
				}
				
				totalcost[i] = totalcost[i] + ( numitemsbought[j] * costofitembought[j] );
			}
			
		}
		
		for (int i=0; i<countitems; i++) {
			if (numitembought[i] == 0) {
				System.out.println("No customers bought " + itemnames[i]);
			}
			else {
				System.out.println(numitembought[i] + " customers bought " + numamtitembought[i] + " " + itemnames[i]);

			}
		}

				
	}
}
