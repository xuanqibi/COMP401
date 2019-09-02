package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan;

		// Your code follows here.
		// Collaborated with Tracy Ann
		scan = new Scanner (System.in);
		int item_count = scan.nextInt();
		String[] name = new String[item_count];
		double[] price = new double[item_count]; 
		for (int i = 0; i < item_count; i++) {
			scan = new Scanner(System.in);
			name[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		scan = new Scanner (System.in);
		int num_of_customers = scan.nextInt();
		String[] customer = new String[num_of_customers];
		String[] lname = new String[num_of_customers];
		int[] count = new int[item_count];
		int[] customer_count = new int[item_count];
		for (int i = 0; i < num_of_customers; i++) {
			scan = new Scanner (System.in);
			customer[i] = scan.next();			
			lname[i] = scan.next();
			int items = scan.nextInt();
			int[] customer_index = new int[item_count];
			for (int n = 0; n < items; n++) {
				scan = new Scanner (System.in);
				int num_each = scan.nextInt();
				String item_name = scan.next();
				int index = findIndex(name, item_name);
				count[index] += num_each;
				customer_index[index] = 1;
			}	
			for (int x = 0; x < item_count; x++) {
				customer_count[x] += customer_index[x];
			}
			
		}
		for (int x = 0; x < item_count; x++) {
			if(count[x] == 0) {
				System.out.println("No customers bought " + name[x]);
			}
			else {
				System.out.println(customer_count[x] + " customers bought " + count[x] + " " + name[x]);;
			}
		}
	}

static int findIndex(String arr[], String x) {
	int i = 0;
	while (i < arr.length){
		if (arr[i].contentEquals(x)) {
            return i; 
        } 
        else { 
            i = i + 1; 
        } 
	}
	return -1;
	
}

}