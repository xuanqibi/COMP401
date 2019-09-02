package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan;

		// Your code follows here.
		// Collaborated with Tracy Ann
		scan = new Scanner (System.in);
		int num_of_customers = scan.nextInt();
		char[] finitial = new char[num_of_customers];
		String[] lname = new String[num_of_customers];
		double[] count = new double[num_of_customers];

		for (int i = 0; i < num_of_customers; i++) {
			scan = new Scanner (System.in);
			String customer = scan.next();	
			finitial[i] = customer.charAt(0);
			lname[i] = scan.next();
			int items = scan.nextInt();
			for (int n = 0; n < items; n++) {
				scan = new Scanner (System.in);
				int num_each = scan.nextInt();
				String type = scan.next();
				double each_price = scan.nextDouble();
				count[i] += (num_each * each_price);	
			}			
		}
		for (int x = 0; x < num_of_customers; x++) {
			System.out.println(finitial[x] + ". " + lname[x] + ": " + String.format("%.2f", count[x]));
		}

		
	}
}
