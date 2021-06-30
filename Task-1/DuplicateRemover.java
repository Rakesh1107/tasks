
import java.util.ArrayList;

public class DuplicateRemover {
	public static void removeDuplicates(Integer[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		int cnt = 0;
		for(int temp: arr) {
			if(!list.contains(temp)) 
				list.add(temp);
			else 
				cnt++;
		}
		if(cnt == 0) System.out.println("No duplicate values found: " + list); 
		else System.out.println("Duplicate values removed: " + list);
	}
}