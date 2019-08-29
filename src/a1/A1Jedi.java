package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	

		// Your code follows here.
		
		//System.out.println("How many items are in the store?");
		int numItems = scan.nextInt();
		
		double [] prices = new double[numItems];
		String [] items = new String[numItems];
		int [] customerPurchases = new int[numItems];
		int [] itemPurchases = new int[numItems];
		
		for (int i = 0; i < numItems; i++) {
			//System.out.println();
			//System.out.println();
			//System.out.println("What is item number "+ (i+1));
			items[i] = scan.next();
			
			//System.out.println("How much does that item cost?");
			prices[i] = scan.nextDouble();
			
			customerPurchases[i] = 0;
			itemPurchases[i] = 0;
			
		}
		
		//System.out.println("How many customers are in the store?");
		
		int numCus = scan.nextInt();
		//System.out.println();
		
		String [] customers = new String[numCus];
		String [] totalPrice = new String[numCus];
		double [] totalPriceNum = new double[numCus];
		
		for (int i = 0; i < numCus; i++) {
			
			double total = 0.0;
			
			//System.out.println("What is the first name of the customer?");
			String fName = scan.next();
			
			//System.out.println("What is the last name of the customer?");
			String lName = scan.next();
			
			customers[i] = fName + " " + lName;
			
			//System.out.println("How many items did they buy?");
			
			int numBought = scan.nextInt();
			
			String [] customersItems = new String[numBought];
			
			for (int j = 0; j < numBought; j++) {
				//System.out.println();
				//System.out.println();
				
				//System.out.println("How many of that item did they buy?");
				int amt = scan.nextInt();
				
				//System.out.println("What item did they buy?");
				String item = scan.next();
				
				
				
				
				int itemNum = 0;
				
				total += prices[itemNum]*amt;
				

				itemPurchases[itemNum] += amt;
				
				for (int k = 0; k < numBought; k++) {
					if (customersItems[k].equals(item)) {
						break;
					}else {
						customerPurchases[itemNum] += 1;
						customersItems[j] = item;
					}
				}
			}
			totalPriceNum[i] = total;
			String strTotal = String.format("%.2f", total);
			totalPrice[i] = strTotal;
		}
		
		for (int i = 0; i < numItems; i++) {
			if (customerPurchases[i] == 0) {
				System.out.println("No customers bought "+ items[i]);
			}else {
				System.out.println(customerPurchases[i] + " customers bought "+ itemPurchases[i] + " " + items[i]);
			}
		}
        	
	}
}