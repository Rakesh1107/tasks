import java.io.*;
import java.util.Arrays;

public class SecondLargestFinder {
	
	static void findSecondLargest(int[] arr) {
		Arrays.sort(arr);
		System.out.println("The second largest element in the array is: ");
		System.out.println(arr[arr.length-2]);
	}	
}