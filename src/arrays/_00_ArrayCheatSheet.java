package arrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] letters = { "a", "b", "c", "d", "e" };
		// 2. print the third element in the array
		System.out.println(letters[2]);
		// 3. set the third element to a different value
		letters[2] = "cc";
		// 4. print the third element again
		System.out.println(letters[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}

		// 6. make an array of 50 integers
		int[] num = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int o = 0; o < num.length; o++) {
			Random ran = new Random();
			num[o] = ran.nextInt(50);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int small = 50;
		for (int o = 0; o < num.length; o++) {
			if (num[o] < small) {
				small = num[o];
			}
		}
		

		// 9 print the entire array to see if step 8 was correct
		for (int o =0; o<num.length; o++) {
			System.out.println(num[o]);
		}
		// 10. print the largest number in the array.
		int big = 0;
		for (int o = 0; o < num.length; o++) {
			if (num[o] > big) {
				big = num[o];
			}
		}
		System.out.println("The biggest number is " +big);
		System.out.println("The smallest number is " +small);

	}
}
