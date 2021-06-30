import java.util.Arrays;

public class ExtremesFinder {
	public static void findMaxMin(Integer[] arr) {
		Arrays.sort(arr);
		System.out.println("Minimum: " + arr[0]);
		System.out.println("Maximum: " + arr[arr.length-1]);
	}
}