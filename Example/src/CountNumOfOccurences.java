public class CountNumOfOccurences {
	public static void main(String args[]) {

		String inputStr = "Navinkumar";
		char searchKey = 'N';

		int count = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (Character.toLowerCase(inputStr.charAt(i)) == Character.toLowerCase(searchKey))
				count++;
		}
		System.out.println("The Character '" + searchKey + "' appears " + count + " times.");
	}
}
