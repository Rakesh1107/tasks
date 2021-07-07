import java.util.Arrays;

public class ArraySorter {
	
	static void sortArray(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int[] temp = new int[n];
		int j = n-1, k = 0;

		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) 
				temp[i] = arr[j--];
			else
				temp[i] = arr[k++];
		}

		System.out.println("The sorted array is : " + Arrays.toString(temp));
	}
}