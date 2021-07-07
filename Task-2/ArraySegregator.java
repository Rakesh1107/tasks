import java.util.Arrays;

public class ArraySegregator {

	static void segregateArray(int[] arr) {
		int cnt = 0;
		for(int temp: arr)
			if(temp == 0)
				cnt++;

		int i = 0;
		for(; i < cnt; i++)
			arr[i] = 0;

		for(; i < arr.length; i++)
			arr[i] = 1;

		System.out.println("The segregated array is: " + Arrays.toString(arr));
	}
}