/* SAMPLE RUNS
  
 	Enter 5 integer elements for list1: 
	1 2 3 4 5
	Enter 5 integer elements for list2: 
	1 2 3 4 5
	The two lists are strictly identical.
	
	Enter 5 integer elements for list1: 
	1 2 3 4 5
	Enter 5 integer elements for list2: 
	1 2 3 4 8
	The two lists are not strictly identical.
	
*/


import java.util.Scanner;
public class StrictlyIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare arrays of 5 elements
		int[] list1 = new int[5];
		int[] list2 = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 5 integer elements for list1: ");
		
		//assign elements in list1 to the integers entered by the user
		for (int i = 0; i < 5; i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.println("Enter 5 integer elements for list2: ");
		
		//assign elements in list2 to the integers entered by the user
		for (int i = 0; i < 5; i++) {
			list2[i] = input.nextInt();
		}
		
		//use method equals to check equality
		if (equals(list1, list2) == false) {
			//if returned false the following will print
			System.out.println("The two lists are not strictly identical.");
		}
		else {
			//if returned true the following will print
			System.out.println("The two lists are strictly identical.");
		}
		
		input.close();
	}

	//method to check if arrays are identical
	public static boolean equals(int[] Array1, int[] Array2) {
		
		//declaring a boolean variable equal and assigning it the value true
		Boolean equal = true;
		
		//check each element of array1 with the corresponding element of array2
		for (int i = 0; i < 5; i++) {
			if (Array1[i] != Array2[i]) {
				
				//if the arrays are not identical variable equal becomes false
				equal = false;
			}
		}
		//returns variable equal
		return equal;
	}
}

