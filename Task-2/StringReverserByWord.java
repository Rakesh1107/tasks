
public class StringReverserByWord {
	
	static void reverse_words(String message) {
		String temp = "";
		String[] tokens = message.split(" ");

		for(int i = tokens.length-1; i >= 0; i--)
			temp+=(tokens[i] + " ");
		
		System.out.println("The message with reversed order of words: ");
		System.out.println(temp);

	}
}