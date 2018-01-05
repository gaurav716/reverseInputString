package walmart.assessment.solution.one;

import java.util.Scanner;

public class ReverseInputString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString;

		// Get input for user
		System.out.println("Enter string to reverse:");
		inputString = scan.nextLine();

		// Print reverse input
		System.out.println(getReverseString(new StringBuilder(inputString)));

		// Close scanner
		scan.close();
	}
	
	/**
	 * Validate and reverse the string 
	 * @param inputStr 
	 * @return string 
	 */
	private static String getReverseString(StringBuilder inputStr) {
		/**
		 * Bullet proofing: Do not proceed to reverse the string Indicate the
		 * user with proper message
		 */
		if (inputStr == null || inputStr.length() <= 0) {
			return "Invalid Input";
		} else {
			System.out.println("Reverse input:");
			char temp;
			/**
			 * Start reversing and printing the input
			 */
			for (int i = 0, j = (inputStr.length() - 1); i < j; i++, j--) {
				temp = inputStr.charAt(i);
				inputStr.setCharAt(i, inputStr.charAt(j));
				inputStr.setCharAt(j, temp);
			}
		}
		return inputStr.toString();
	}

}
