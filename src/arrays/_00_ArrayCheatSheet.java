package arrays;

import java.util.Iterator;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] newArray = new String[5];
newArray[0] = "h";
newArray[1] = "e";
newArray[2] = "l";
newArray[3] = "l";
newArray[4] = "o";


		//2. print the third element in the array
System.out.println(newArray[2]);
		//3. set the third element to a different value
		newArray[2] = "e";
		//4. print the third element again
		System.out.println(newArray[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
	for (int i = 0; i < newArray.length; i++) {
		System.out.println(newArray[i]);
	}
		
		//6. make an array of 50 integers
		int[] newerArray = new int[50];
	
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < newerArray.length; i++) {
			Random rand = new Random();
			int bob = rand.nextInt(49);
			newerArray[i] = bob;
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestn = newerArray[0];
		for (int i = 0; i < newerArray.length; i++) {
			if(smallestn>newerArray[i]) {
				smallestn = newerArray[i];
			}
		}
		System.out.println(smallestn+"small");
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < newerArray.length; i++) {
			System.out.println(newerArray[i]);
		}
		int biggestn = newerArray[0];
		//10. print the largest number in the array.
		for (int i = 0; i < newerArray.length; i++) {
			if(biggestn<newerArray[i]) {
				biggestn = newerArray[i];
			}
		}
		System.out.println(biggestn+"big");
	}
}
