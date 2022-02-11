package com.corejava.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
	
	public Integer sum(List<? extends Number> list){
		int sum = 0;
				
		return sum;
	}	

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(85);
		list.add(68);
		
		System.out.println(list);
		
		Collections.addAll(list, 23, 54, 65, 34, 65);
		
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(10);
		list2.add(8);
		list2.add(68);
		
		
		System.out.println(Collections.disjoint(list, list2));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.shuffle(list);
		
		System.out.println(list);
		
		String[] arr = {"A", "B", "C"};
		
		System.out.println(arr.toString());
		System.out.println(Arrays.toString(arr));
		
		/*List<String> sList = new ArrayList<String>();
		for(String s : arr){
			sList.add(s);
		}*/
		
		List<String> sList = Arrays.asList(arr);
		
		System.out.println(sList);
		
		/*CopyOnWriteArrayList<Integer> arr = new CopyOnWriteArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		System.out.println(arr);
		
		Iterator<Integer> itr2 = arr.iterator();
		
		while(itr2.hasNext()){
			if(itr2.next() == 4)
				arr.add(5);
		}
		
		System.out.println(arr);*/
		
		List<Double> dList = new ArrayList<Double>();
		dList.add(1.0);
		dList.add(3.4);
		
		CollectionDemo o1 = new CollectionDemo();
		o1.sum(dList);
		
	}
	
}
