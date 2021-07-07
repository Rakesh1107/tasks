import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task2Runner {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter program number to execute (1-6): ");
		int option = Integer.parseInt(br.readLine());

		if(option == 4 || option == 5) {
			System.out.println("Enter a message/string: ");
			String message = br.readLine();
			if(option == 4)
				StringReverserByLetter.reverseString(message);
			else 
				StringReverserByWord.reverse_words(message);
		}

		else {
			System.out.println("Enter the size of array: ");
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			System.out.println("Enter elements of array as space-seperated integers: ");
			String input = br.readLine();
			String[] inputs = input.split(" ");
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(inputs[i]);

			switch(option) {
				case 1:
					SecondLargestFinder.findSecondLargest(arr);
					break;
				case 2:
					ArraySegregator.segregateArray(arr);
					break;
				case 3:
					ArraySorter.sortArray(arr);
					break;
				case 6:
					ArrayList<Integer> list = ArrayListConverter.convertToArrayList(arr);
					System.out.println(list);
					break;
				default:
					System.out.println("Enter valid option!");
					break;
			}
		}
	}
}