import java.util.Arrays;
import java.util.HashSet;

public class CommonValueFinder {
	public static void findCommonValues(Integer[] arr1, Integer[] arr2) {
		HashSet<Integer> set = new HashSet<>(Arrays.asList(arr2));
		String s = "";
		for(int temp: arr1) {
			if(set.contains(temp)) {
				s+=(temp + ", ");
				set.remove(temp);
			}
		}
		if(s.length() == 0) System.out.println("No common values found");
		else System.out.println("Common values are: " + s);
	}

	public static void findCommonValues(String[] arr1, String[] arr2) {
		HashSet<String> set = new HashSet<>(Arrays.asList(arr2));
		String s = "";
		for(String temp: arr1) {
			if(set.contains(temp)) {
				s+=(temp + ", ");
				set.remove(temp);
			}
		}
		if(s.length() == 0) System.out.println("No common values found");
		else System.out.println("Common values are: " + s);
	}


}
