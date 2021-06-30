public class EvenOddFinder {
	public static void findEvenOdd(Integer[] arr) {
		int even = 0, odd = 0;
		for(int temp: arr) {
			if(temp % 2 == 0) 
				even++;
			else 
				odd++;
		}
		System.out.println("Number of even integers: " + even);
		System.out.println("Number of odd integers: " + odd);
	}
}