
public class Matches {
	public static void main(String[] args) {
		String str = "11111111.jpg";
		System.out.println(str);
		System.out.println(isValidString(str));
		System.out.println(isValidString2(str));
	}
	
	public static boolean isValidString(String str) {
		String str1 = "[0-9]{8}";
		String text = ".jpg";
		str1 += text;
		return str.matches(str1);
	}
	
	public static boolean isValidString2(String str) {
		String text = ".jpg";
		return str.matches("[0-9]{8}" + text);
	}
}
