package practise;

public class Count_Of_Upper_And_Lower_Cases {

	public static void main(String[] args) {
		String text = "AutomatiOn";
		int upperCase = 0;
		int lowerCase = 0;

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCase++;
			} else {
				lowerCase++;

			}
		}
		System.out.println("Count of upper case: " + upperCase);
		System.out.println("Count of upper case: " + lowerCase);

	}

}
