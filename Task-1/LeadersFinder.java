public class LeadersFinder {
	public static void findLeaders(Integer[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			boolean leader = true;
			for(int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					leader = false;
					break;
				}
			}
			if(leader) System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}