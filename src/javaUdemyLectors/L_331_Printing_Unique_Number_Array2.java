package javaUdemyLectors;

import java.util.ArrayList;

public class L_331_Printing_Unique_Number_Array2 {

	public static void main(String[] args) {

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				if (k == 1) {
					System.out.println("The unique number in array is: "+a[i]);
				}
			}
		}
	}
}
