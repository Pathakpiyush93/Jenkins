package practise;

public class Fibonacci_Numbers {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		int count=8;
		System.out.print(n1+" "+ n2);
		for(int i=1;i<=count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
