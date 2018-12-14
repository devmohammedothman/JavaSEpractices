package javase.problems;

public class LongestPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Longest pass " + findLongestPassword("test 5 a0A pass007 ?xy1"));
	}

	public static int findLongestPassword(String password) {
		String[] words = password.replaceAll("\\s+", " ").split(" ");
		int maxLength = -1;
		for (String word : words) {
			//replace all numbers , then you got letters and vice versa 
			if (word.matches("^[0-9a-zA-Z]*$") && word.replaceAll("[0-9]+", "").length() % 2 == 0
					&& word.replaceAll("[a-zA-Z]+", "").length() % 2 == 1) {
				maxLength = Math.max(maxLength, word.length());
			}
		}
		return maxLength;
	}
}


//Put every opening bracket on a stack. If a closing bracket is not the same as the top stack bracket, the string is not properly nested.