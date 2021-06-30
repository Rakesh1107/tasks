
public class IndexFinder {
	public static void findIndex(Integer[] arr, int value) {
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				index = i;
				break;
			}
		}
		if(index != -1) System.out.println("Element found at index " + index);
		else System.out.println("Element not found");
	}
}