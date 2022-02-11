package com.corejava.day14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	
	public static void main(String[] args){
		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(50);
		l1.add(34);
		l1.add(55);
		l1.add(12);
		l1.add(65);
		l1.add(37);
		l1.add(76);
		l1.add(16);
		
		System.out.println("Original List: "+l1.toString());
		
//		List<Integer> oddNumList = new ArrayList<Integer>();
		
		/*for(Integer i : l1){
			if(i%2 != 0)
				oddNumList.add(i);
		}
		
		System.out.println("Odd Numt List: "+oddNumList.toString());*/
		
//		Stream<Integer> s1 = l1.stream();
		
		Predicate<Integer> p1 = i -> i%2 != 0;
		Predicate<Integer> p2 = i -> i > 50;
		
		List<Integer> oddNumList = l1.stream().filter(p1.or(p2)).collect(Collectors.toList());
		
		System.out.println();
				
		List<Integer> updatedList = l1.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println("Updated List: "+updatedList);
		
		updatedList = l1.stream().map(i -> {if(i<20)return i+5;else return i;}).collect(Collectors.toList());
		System.out.println("Updated List2: "+updatedList);
		
		/*Consumer<Integer> c1 = i -> {
			if(i>20)
				System.out.println("Marks : "+i+" Status: Pass");
			else
				System.out.println("Marks : "+i+" Status: Fail");
		};
//		c1.accept(9);
		
		l1.stream().map(i -> {if(i<20)return i+5;else return i;}).forEach(c1);*/
		
		StreamsDemo obj = new StreamsDemo();
		
		l1.stream().map(i -> {if(i<20)return i+5;else return i;}).forEach(obj::printMarks);
		
		List<Integer> sortedList = l1.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List: "+sortedList);
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Raktim");
		l2.add("Ankan");
		l2.add("Akashdeep");
		l2.add("Raj");
		l2.add("Pratyush");
		l2.add("Harsh");
		l2.add("Sohan");
		
		
		System.out.println(l2);
		
		List<String> sortedL2 = l2.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedL2);
		
		Comparator<String> c1 = (s1, s2) -> s1.length() < s2.length() ? 1 : s1.length() > s2.length() ? -1 : 0;
		
		sortedL2 = l2.stream().sorted(c1).collect(Collectors.toList());
		
		System.out.println(sortedL2);
		
		sortedL2 = l2.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		
		System.out.println(sortedL2);
		
		
		System.out.println("Min value: "+l2.stream().min((s1, s2) -> s1.compareTo(s2)).get());
		System.out.println("Max value: "+l2.stream().max(c1).get());
		
		
	}
	
	public void printMarks(Integer i){
		Supplier<Double> randomSupplier = () -> Math.random();
		if(i>20)
			System.out.println("Marks : "+i+" Status: Pass | ID: "+randomSupplier.get());
		else
			System.out.println("Marks : "+i+" Status: Fail");
	}

}
