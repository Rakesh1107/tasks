import java.util.ArrayList;

public class ArrayListConverter {
	
	static ArrayList<Integer> convertToArrayList(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int temp: arr)
			list.add(temp);
		return list;
	}
}