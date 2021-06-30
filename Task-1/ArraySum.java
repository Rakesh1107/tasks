
public class ArraySum {
	public static void calculateSum(Integer[] arr) {
		int sum = 0;
		for(int temp: arr) 
			sum+=temp;
		System.out.println("Sum of array elements: " + sum);
	}
}