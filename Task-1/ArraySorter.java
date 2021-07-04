
public class ArraySorter {
	public static void sortArray(Integer[] arr) {
		boolean sorted;
		for(int i = 0; i < arr.length-1; i++) {
			sorted = true;
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
		System.out.println("Sorted Array: " + Arrays.asList(arr));
	}
}
