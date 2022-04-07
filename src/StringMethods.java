
public class StringMethods {

	public static void main(String[] args) {

	}
	public static String capitalize(String word) {
		String result = "";
		if (word.length() > 1) {
			result += Character.toUpperCase(word.charAt(0));
			result += word.substring(1).toLowerCase();
		} else {
			result = word.toUpperCase();
		}
		return result;
		
	}
	public static int wheresWaldo(String phrase) {
		int i = phrase.indexOf("Waldo");
		return i;
	}
	public static String firstThingsFirst(String a, String b) {
		if (a.compareToIgnoreCase(b) <= 0) {
			return a + " " + b;
		} else {
			return b + " " + a;
		}
	}
	public static String reverse(String s) {
		String result = "";
		for (int i = s.length()-1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}
	public static void soLong(String a, String b) {
		if (a.length() == b.length()) {
			System.out.println(a + " " + b);
		} else if (a.length() > b.length()) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
	public static String afterMath(String phrase) {
		if (phrase.contains("math")) {
			return phrase.substring(phrase.indexOf("math"));
		} else {
			return "dud";
		}
	}
	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
	public static String camelCase(String phrase) {
		String result = "";
		String[] arrayOfPhrase = phrase.split(" ", -2);
		result += arrayOfPhrase[0].toLowerCase();
		for (int i = 1; i < arrayOfPhrase.length; i++) {
			result += capitalize(arrayOfPhrase[i]);
		}
		return result;
	}
}
