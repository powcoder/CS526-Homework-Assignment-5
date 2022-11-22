https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder


import java.util.Arrays;

public class Hw5 {

	public static double recursiveAverage( /* determine arguments */ ) {
		
		// implement this method
	}
	
	public static int recursiveDifference(/* determine arguments */) {
		
		// implement this method
	}
	
	public static void main(String[] args) {

		char[] bitPattern1 = {'0', '0', '1', '0', '1', '1', '0', '1'};
		char[] bitPattern2 = {'0', '1', '1', '1', '1', '0', '0', '1'};
		
		int d = recursiveDifference(/* determine actual parameters */);
		
		System.out.println("Bit pattern 1: " + Arrays.toString(bitPattern1));
		System.out.println("Bit pattern 2: " + Arrays.toString(bitPattern2));
		System.out.println("Difference between the two bit patterns is: " + d);
		
			
		char[] bitPattern3 = {'1', '0', '1', '0', '0', '1', '1', '1', '0', '0', '1'};
		char[] bitPattern4 = {'0', '0', '0', '0', '1', '1', '0', '0', '1', '1', '1'};
		
		d = recursiveDifference(/* determine actual parameters */);
		
		System.out.println();
		System.out.println("Bit pattern 3: " + Arrays.toString(bitPattern3));
		System.out.println("Bit pattern 4: " + Arrays.toString(bitPattern4));
		System.out.println("Difference between the two bit patterns is: " + d);
		
		double[] numbers1 = {15, 3, 12, 27, 48};
		double[] numbers2 = {10, 31, 68, 72, 56, 90, 82};
		double avg1 = recursiveAverage(/* determine actual parameters */);
		double avg2 = recursiveAverage(/* determine actual parameters */);
		
		System.out.println();
		System.out.println("Number array 1: " + Arrays.toString(numbers1));
		System.out.println("Number array 2: " + Arrays.toString(numbers2));
		System.out.println("Average of numbers in number array 1 is: " + avg1);
		System.out.println("Average of numbers in number array 2 is: " + avg2);
		
	}

}
