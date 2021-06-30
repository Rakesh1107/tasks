import java.util.Arrays;

public class AverageFinder {
	public static void calculateAverage(Integer[] arr) {
		int len = arr.length; 
		float sum = 0;
		Arrays.sort(arr);
		for(int temp: arr) 
			sum+=temp;
		sum = sum - (arr[0] + arr[len-1]);
		System.out.println("Average: " + (float)sum/len);
	}
}