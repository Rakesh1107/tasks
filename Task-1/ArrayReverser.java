
public class ArrayReverser {
	public static void reverseArray(Integer[] arr) {
		int start = 0, end = arr.length-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}		
		System.out.println("Reverse Array: " + Arrays.asList(arr));
	}
}