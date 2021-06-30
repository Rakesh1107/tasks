
public class TargetSum {
	public static void findElements(Integer[] arr, int target) {
		boolean found = false;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					System.out.println("The values are at index " + i + ", " + j);
					found = true;
					break;
				}
			}
		}
		if(!found) System.out.println("No such pairs possible");
	}
}