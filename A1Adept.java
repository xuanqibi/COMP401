package a1;

import java.util.Scanner;

public class A1Adept {

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
		double[] count = new double[num_of_customers];
		for (int i = 0; i < num_of_customers; i++) {
			scan = new Scanner (System.in);
			customer[i] = scan.next();			
			lname[i] = scan.next();
			int items = scan.nextInt();
			for (int n = 0; n < items; n++) {
				scan = new Scanner (System.in);
				int num_each = scan.nextInt();
				String item_name = scan.next();
				int index = findIndex(name, item_name);
				count[i] += num_each * price[index];
				
			}
			
		}

		double min = findValueMin(count);
		double max = findValueMax(count);
		int minIndex = findDoubleIndex(count, findValueMin(count));
		int maxIndex = findDoubleIndex(count, findValueMax(count));
		System.out.println("Biggest: " + customer[maxIndex] + " " + lname[maxIndex] + " (" + String.format("%.2f", max) + ")");
		System.out.println("Smallest: " + customer[minIndex] + " " + lname[minIndex] + " (" + String.format("%.2f", min) + ")");
		System.out.println("Average: " + String.format("%.2f", (calculateValueSum(count)/num_of_customers)));
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
static int findDoubleIndex(double arr[], double x) {
	int i = 0;
	while (i < arr.length){
		if (arr[i] == x) {
            return i; 
        } 
        else { 
            i = i + 1; 
        } 
	}
	return -1;
	
}
static double calculateValueSum(double[] vals) {
		
		double sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
	
	/* findValueMin
	 * Finds and returns the minimum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: minimum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static double findValueMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}

	/* findValueMax
	 * Finds and returns the maximum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: maximum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static double findValueMax(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}
}
