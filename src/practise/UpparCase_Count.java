package practise;

public class UpparCase_Count {

	public static void main(String[] args) {
		String text = "AutomatiOn";
		
//		Find how many characters are in upper case
		
		int counter1=0;
		int counter2=0;
		for(int index=0; index<text.length(); index++) {
			
//			According to ASCII value table
//			A-Z >> 65-90 and a-z >> 97-122
			if(text.charAt(index)>=65 && text.charAt(index)<=90) {
				System.out.println("Character is upper case: "+ text.charAt(index));
				counter1++;
			}
			else {
				System.out.println("Character is lower case: "+text.charAt(index));
				counter2++;
				
			}
		}
		System.out.println(counter1);
		System.out.println(counter2);

	}

}
