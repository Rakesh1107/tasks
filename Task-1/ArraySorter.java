
public class ArraySorter {
	public static void sortArray(Integer[] arr) {
		boolean swapped;
		for(int i = 0; i < arr.length-1; i++) {
			swapped = false;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if(swapped == false) break;
		}
		System.out.println("Sorted Array: " + Arrays.asList(arr));
	}
}
