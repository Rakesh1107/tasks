
public class ArraySorter {
	public static void sortArray(Integer[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.asList(arr));
	}
}