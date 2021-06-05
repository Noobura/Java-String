
public class StringJava {
	public static String isPalindrome() {
		String str = "Malayalioam";
		if (palindromCheck(str)) {

			return "string is a palindrome";
		} else {
			for (int i = 0; i < str.length(); i++) {
				
				StringBuffer temp = new StringBuffer(str);
				
				if (palindromCheck(temp.deleteCharAt(i).toString()))
					
					return "string is a palindrome if we remove " + str.charAt(i);

				else if ((i < (str.length() - 1)) && palindromCheck(temp.deleteCharAt(i).toString()))
					
					return "string is a palindrome if we remove " + str.charAt(i) + str.charAt(i + 1);

				else
					continue;
			}

			return "String is not a palindrome";
		}

	}

	public static boolean palindromCheck(String str1) {
		StringBuffer reverseStr = new StringBuffer(str1);
		return str1.equalsIgnoreCase(reverseStr.reverse().toString());
	}

	public static void main(String[] args) {
		//StringJava s = new StringJava();
		System.out.println(StringJava.isPalindrome());

	}

}
