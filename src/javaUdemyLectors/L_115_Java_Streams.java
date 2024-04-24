package javaUdemyLectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.testng.Assert;
import org.testng.annotations.Test;

public class L_115_Java_Streams {

//	@Test
//	Count the number of names starting with alphabet "A" in list with regular for loop
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Adam");
		names.add("Alekha");
		names.add("Rama");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
//	Count the number of names starting with alphabet "A" in list with java stream
	public void streamFilter() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Adam");
		names.add("Alekha");
		names.add("Rama");

//		There is no life for intermediate operation if there is no terminal operation
//		Terminal operations will execute only if intermediate operation (filter) returns true
//		We can create stream
//		How to use stream in stream API
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

//		Create stream directly
//		If more than one operation perform write code like below
		Stream.of("Abhijeet", "Don", "Adam", "Alekha", "Rama").filter(s -> {
			s.endsWith("a");
			return true;
		}).count();

//		Print all the names which has length more than 4

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

//		Print only first result
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	@Test

	public void streamMap() {

//	Print all the names having length>4 in upper case
		Stream.of("Abhijeet", "Don", "Adam", "Alekha", "Rama").filter(s -> s.length() > 4).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

//		Print names which have first letter "A" in upper case and sorted
		Stream.of("Don", "Adam", "Abhijeet", "Alekha", "Rama").filter(s -> s.startsWith("A")).sorted()
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

	}

	@Test
	public void mergeArrayList() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Man");
		names.add("Don");
		names.add("Women");

//		Converting array to array list
		Stream.of("Don", "Adam", "Abhijeet", "Alekha", "Rama");
		List<String> name1 = Arrays.asList("Don", "Adam", "Abhijeet", "Alekha", "Rama");

//		Merging two array list

		Stream<String> newStream = Stream.concat(names.stream(), name1.stream());
//		newStream.forEach(s -> System.out.println(newStream));
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	
	public void streamCollect() {
		
//		Collect method collects output which we manipulated and store it in list
		List<String> ls = Stream.of("Don", "Adam", "Abhijeet", "Alekha", "Rama").filter(s -> s.startsWith("A")).sorted()
		.map(s -> s.toUpperCase()).collect(Collectors.toList());
		
//		Printing first result from the new list from above output
//		We can also use limit to get the first result
		System.out.println(ls.get(0));
	}
	
	@Test
	public void printOnlyDistinctValues() {
		
		List<Integer> value = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		
//		Print distinct numbers
		value.stream().distinct().forEach(s->System.out.println(s));
		
//		Print in ascending order
		value.stream().sorted().forEach(s->System.out.println(s));
		
//		Print unique numbers, sort it and print 3rd index
		List<Integer> value1 = value.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(value1.get(2));
	}
	
	

}
