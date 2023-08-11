package recursion.attempts;

import recursion.attempts.*;

public class Stage3 {
	/**
	 * 
	 * @param str
	 * @return the reverse of the string
	 * return null if string is null
	 */
	public static String reverse(String str) {
		if (str==null)
			return null;
		if (str.length() == 0)
			return "";
		char first = str.charAt(0);
		String rest = str.substring(1);
		String revRest = reverse(rest) + first;
		return revRest; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @return true if string is a palindrome (same when reversed), false otherwise
	 * return false if Sting is null
	 */
	public static boolean isPalindrome(String str) {
		if (str==null) 
			return false;
		if (str.length() <=1)
			return true;
		if(str.charAt(0) != str.charAt(str.length() -1))
			return false;
		return isPalindrome(str.substring(1, str.length()-1)); //to be completed
	}

	/**
	 * 
	 * @param x
	 * @param n (n COULD be negative)
	 * @return x to the power of n
	 * IMPORTANT: for any integer x, x to the power of 0 is 1
	 * 
	 *  For example:
	 *  
	 *  powerV2(2, 5) = 32
	 *  powerV2(2, -3) = 0.125
	 *  powerV2(-2, -3) = -0.125
	 *  powerV2(2, -5) = 0.03125
	 *  powerV2(3, -2) = 0.11111
	 *  
	 *  HINT 1: x^(-n) is 1/(x^n)
	 *  HINT 2: you can call power from Stage1
	 */
	public static double powerV2(int x, int n) {
		if (n == 0)
			return 1;
		if (n < 0)
			return (double)1/x * powerV2(x, n+1);
		return x*( powerV2(x, n-1)); //to be completed
	}

	/**
	 * 
	 * @param n (assume n is more than or equal to zero)
	 * @param destBase (assume destBase is a number between 2 and 10)
	 * @return the number in destBase base.
	 * for example,
	 * convert(13, 2) returns "1101" since 13 in base-2 is 1101 (1*8 + 1*4 + 0*2 + 1*1 = 13)
	 * convert(19, 3) returns "201" since 19 in base-3 is 211 (2*9 + 0*3 + 1*1 = 19)
	 * convert(1905, 8) returns "3561" since 1905 in base-8 is 3561 (3*512 + 5*64 + 6*8 + 1*1 = 1905)
	 */
	public static String convert(int n, int destBase) {
		if (n<destBase)
			return Integer.toString(n);
		if (n==0)
			return "";
		return convert(n/destBase, destBase) + Integer.toString(n%destBase); //to be completed
	}

	/**
	 * 
	 * @param str
	 * @param pattern
	 * @param replacement
	 * @return a modified version of str where all occurrences of pattern
	 * are replaced by replacement
	 * 
	 * For example,
	 * replaceAll("this is better than the other thing", "th", "sup") 
	 * returns the String "supis is better supan supe osuper suping"
	 * 
	 */
	public static String replaceAll(String str, String pattern, String replacement) {
		if(str==null)
			return null;
		if(str.length()==0)
			return "";
		if(str.length()<pattern.length())
			return str;
		if(str.substring(0,pattern.length()).equals(pattern))
			return replacement + replaceAll(str.substring(pattern.length()), pattern, replacement);
		return str.charAt(0) + replaceAll(str.substring(1), pattern, replacement); //to be completed
	}

	/**
	 * 
	 * @param n
	 * @param d: single digit integer
	 * @return the number of occurrences of digit d in integer n, 
	 * except that a d with another d immediately to its left counts double, 
	 * For example, 
	 * 
	 * if countWeighted(8818, 8) returns 4. 
	 * 
	 * Explanation:
	 * 
	 * First 8 (from left) contributes 1
	 * Second 8 contributes 2 (since there is another 8 immediately to its left)
	 * Third 8 contributes 1
	 * 
	 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
	 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 */
	public static int countWeighted(int n, int d) {
		if (n ==0) 
			return 0;
		if((n % 10) == d && (n/10)%10==d)
			return 2+countWeighted(n/10,d);
		else if ((n % 10) == d)
			return 1 + countWeighted(n/10, d);
		return countWeighted(n/10, d); //to be completed
	}

	/**
	 * 
	 * @param str
	 * @param tokens
	 * @return true if str contains all characters from token, false otherwise
	 * Note if tokens contains multiple occurrences of a particular character,
	 * then str must have at least those many occurrences of that character.
	 */
	public static boolean contains(String str, String tokens) {
		if (str==null)
			return false;
		if (str.length() == 0) {
            return true; // Base case: All characters in str2 have been found in str1
        }

        if (tokens.length() == 0) {
            return false; // Base case: str1 is empty and characters in str2 have not been found
        }

        if (tokens.charAt(0) == str.charAt(0)) {
            // If the first character in str1 matches the first character in str2,
            // recursively check the remaining characters
            return contains(str.substring(1), tokens.substring(1));
        } else {
            // If the first character in str1 does not match the first character in str2,
            // recursively check the remaining characters in str1
            return contains(str, tokens.substring(1));
        }
	}

	/**
	 * two Strings are anagrams of each other if you can rearrange one to form the other one.
	 * @param s1
	 * @param s2
	 * @return true if s1 and s2 are anagrams of each other, false otherwise
	 */
	public static boolean areAnagrams(String s1, String s2) {
		if (s1.length()==0 && s2.length()==0)
			return true;
		else if ((s1.length()!=0 && s2.length()==0) || s1.length()==0 && s2.length()!=0) {
			return false;
		}
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		char checker = sb1.charAt(0);
		int index = sb2.indexOf(Character.toString(checker));
		if (index == -1)
			return false;
		sb1 = sb1.deleteCharAt(0);
		sb2 = sb2.deleteCharAt(index);
		
		s1 = sb1.toString();
		s2 = sb2.toString();
		return areAnagrams(s1, s2); //to be completed
	}

	@SuppressWarnings("unused")
	private static String[] morseCodes = {"-","-...","-.-.","-..",".",
			"..-.","--.","....","..",".---",
			"-.-",".-..","--","-.","---",
			".--.","--.-",".-.","...","-",
			"..-","...-",".--","-..-",
			"-.--","--.."};

	/**
	 * 
	 * @param message
	 * @return a String containing morse code for message passed.
	 * return null if string is null. return "" is string is ""
	 * IMPORTANT lookup array provided as static variable morseCodes
	 * Use / as a space
	 * Use space to separate morse codes for two letters
	 * The returned value ends with a space for all non-null, non-empty inputs
	 * For example, 
	 * if message = "nice one", return "-. .. -.-. . / --- -. . "
	 */
	public static String getMorse(String message) {
		//morseCodes[i] gives the equivalent morse code for letter (char)('a' + i)
		//'b' -> morseCodes[1]
		//'k' ('a' + 10) -> morseCodes[10]
		return null; //to be completed		
	}

	/**
	 * a polynomial is defined as 
	 * (c_0 *  x^0) +  (c_1 *  x^1) + ... (c_n *  x^n)
	 * 
	 * For example, take the polynomial 3 + 5x - 7(x^2) + 9(x^5)
	 * c_0 = 3
	 * c_1 = 5
	 * c_2 = -7
	 * c_3 = 0
	 * c_4 = 0
	 * c_5 = 9
	 * this is represented as the array coefficients {3, 5, -7, 0, 0, 9}
	 * 
	 * when we plug in the value of x = 2, it evaluates to 3 + 10 - 28 + 288 = 273 
	 * 
	 * @param coefficients (contains the values for the coefficients, coefficients[0] contains value for c_0)
	 * @param maxDegree (contains the highest degree to consider. the array coefficients might have 10 terms but 
	 * if maxDegree = 3, only items up to, and including index [3] should be evaluated).
	 * @param xValue
	 * @return
	 */
	public static double evaluatePolynomial(int[] coefficients, int maxDegree, int xValue) {
		return 0; //to be completed
	}
}
