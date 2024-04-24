package practise;

public class CountOfUpperLowerCases {

	public static void main(String[] args) {
		int upperCase=0;
		int lowerCase=0;
		String text = "AutomaTion";
		for(int i=0; i<text.length(); i++) {
			char ch = text.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.println(ch+" is upper case");
				upperCase++;
			}
			else {
				System.out.println(ch+" is lower case");
				lowerCase++;
			}
		}
		System.out.println("Upper case count: "+upperCase);
		System.out.println("Lower case count: "+lowerCase);

	}

}
