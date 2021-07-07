
public class StringReverserByLetter {
	
	static void reverseString(String word) {
		String temp = "";
		
		for(int i = word.length()-1; i >= 0; i--) 
			temp+=(word.charAt(i));

		System.out.println("The reversed string is: ");
		System.out.println(temp);
	}
}