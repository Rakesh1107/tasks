import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task1Runner {
	public static void main(String[] args) throws IOException {
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter program number to execute: ");
			int option = Integer.parseInt(br.readLine());
			if(option == 0) break;
			else if(option == 7) {
				System.out.println("a. Integer Array\nb. String Array");
				char opt = br.readLine().charAt(0);
				System.out.println("Enter the length of array 1: ");
				int len1 = Integer.parseInt(br.readLine());
				System.out.println("Enter the length of array 2: ");
				int len2 = Integer.parseInt(br.readLine());
				if(opt == 'a') {
					Integer[] arr1 = new Integer[len1];
					Integer[] arr2 = new Integer[len2];
					System.out.println("Enter the elements of array 1 as space-seperated integers: ");
					String input1 = br.readLine();
					String[] inputs1 = input1.split(" ");
					for(int i = 0; i < len1; i++)
						arr1[i] = Integer.parseInt(inputs1[i]);
					System.out.println("Enter the elements of array 2 as space-seperated integers: ");
					String input2 = br.readLine();
					String[] inputs2 = input2.split(" ");
					for(int i = 0; i < len2; i++)
						arr2[i] = Integer.parseInt(inputs2[i]);
					CommonValueFinder.findValues(arr1, arr2);
				} 
				else if(opt == 'b') {
					String[] arr1 = new String[len1];
					String[] arr2 = new String[len2];
					System.out.println("Enter the elements of array 1 ");
					for(int i = 0; i < len1; i++)
						arr1[i] = br.readLine();
					System.out.println("Enter the elements of array 2: ");
					for(int i = 0; i < len2; i++)
						arr2[i] = br.readLine();
					CommonValueFinder.findValues(arr1, arr2);
				}
			} 
			else {
				System.out.println("Enter the length of array: ");
				int len = Integer.parseInt(br.readLine());
				Integer[] arr = new Integer[len];
				System.out.println("Enter the elements as space-seperated integers: ");
				String input = br.readLine();
				String[] inputs = input.split(" ");
				for(int i = 0; i < len; i++)
					arr[i] = Integer.parseInt(inputs[i]);
				int value, index;
				switch(option) {
					case 1: 
						System.out.println("Enter the element to find index for: ");
						value = Integer.parseInt(br.readLine());
						IndexFinder.findIndex(arr, value);
						break;
					case 2: 
						ArraySum.calculateSum(arr);
						break;
					case 3: 
						System.out.println("Enter the element to remove from array: ");
						value = Integer.parseInt(br.readLine());
						ElementRemover.removeElement(arr, value);
						break;
					case 4: 
						System.out.println("Enter the index to insert at: ");
						index = Integer.parseInt(br.readLine());
						System.out.println("Enter the value to insert: ");
						value = Integer.parseInt(br.readLine());
						ElementAdder.addElement(arr, index, value);
						break;
					case 5: 
						System.out.println("Enter the element to check if present in array: ");
						value = Integer.parseInt(br.readLine());
						ArrayChecker.checkArray(arr, value);
						break;
					case 6: 
						ExtremesFinder.findMaxMin(arr);
						break;
					case 8: 
						DuplicateRemover.removeDuplicates(arr);
						break;
					case 9: 
						EvenOddFinder.findEvenOdd(arr);
						break;
					case 10: 
						AverageFinder.calculateAverage(arr);
						break;
					case 11:	 
						System.out.println("Enter the target value: ");
						int target = Integer.parseInt(br.readLine());
						TargetSum.findElements(arr, target);
						break;
					case 12: 
						ArrayReverser.reverseArray(arr);
						break;
					case 13: 
						EvenOddSeperator.seperateArray(arr);
						break;
					case 14: 
						ArraySorter.sortArray(arr);
						break;
					case 15: 
						LeadersFinder.findLeaders(arr);
						break;
					default: 
						System.out.println("Enter options in the range 1-15! ");
						break;	
				} // end of switch
			} // end of else
		System.out.println("Enter 0 to exit! or ");
		} // end of loop
	} // end of main
}