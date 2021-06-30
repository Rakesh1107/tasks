
public class EvenOddSeperator {
	public static void seperateArray(Integer[] arr) {
		Integer[] newArray = new Integer[arr.length];
		int j = 0, k = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				newArray[j] = arr[i];
				j++;
			} else {
				newArray[k] = arr[i];
				k--;
			}

		}		
		System.out.println("Even Odd Seperated Array: " + Arrays.asList(newArray));
	}
}