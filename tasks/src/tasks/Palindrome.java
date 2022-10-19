package tasks;

public class Palindrome {
	
	public static boolean isPalindrome(String str)
	{
		
		String lowerString = str.toLowerCase();
      	String reverse = "";

      	boolean answer = false;

      	for (int i = lowerString.length() - 1; i >= 0; i--) {
      		reverse = reverse + lowerString.charAt(i);
      	}

      	if (lowerString.equals(reverse)) {
      		answer = true;
      	}
      	return answer;
	}

	public static void main(String[] args) {
		
		String str = "oto";
      	boolean answer = isPalindrome(str);
      	System.out.println(answer);

	}
	
}
