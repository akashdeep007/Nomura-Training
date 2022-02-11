package com.corejava.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.corejava.day5.Student;

public class CollectionDemo {

	public static void main(String[] args){
		String[] strArr = new String[5];
		
		strArr[0] = "raktim";
		strArr[1] = "ghosh";
		
		for(int i = 0; i < strArr.length; i++){
			System.out.println("Input: "+strArr[i]);
		}
		
		System.out.println(strArr.toString());
		
		System.out.println("-------------------------------------");
		
		ArrayList arrList = new ArrayList(4);
		arrList.add("raktim");
		arrList.add("raktim");
		arrList.add("raktim");
		arrList.add("ghosh");
		arrList.add(new Student());
		System.out.println("Size of the list: "+arrList.size());
		System.out.println(arrList.toString());
		
		Iterator objItr = arrList.iterator();
		
		while(objItr.hasNext()){
			Object obj = objItr.next();
			if(obj instanceof String){
				if(((String)obj).equals("ghosh")){
					objItr.remove();					
//					arrList.add(10);
				}
			}
		}
		
		/*for(int i = 0; i < arrList.size(); i++){
			if(arrList.get(i) instanceof String){
				if(((String)arrList.get(i)).equals("ghosh")){
					arrList.remove(i);
				}					
			}
		}*/
		System.out.println(arrList.toString());
		/*HashSet set = new HashSet();
		set.add("raktim");
		set.add("raktim");
		set.add("raktim");
		set.add("ghosh");
		
		System.out.println("Size of the set: "+set.size());
		System.out.println(set.toString());*/
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "raktim");
		map.put(2, "ghosh");

		map.put(4, "collection");
		map.put(3, "java");
		
		map.put(3, "core java");
		
		Set<Integer> keySet = map.keySet();
		
		Iterator<Integer> intItr = keySet.iterator();
		
		while(intItr.hasNext()){
			System.out.println("Map object: "+map.get(intItr.next()));
		}
		
		Map<String, List<String>> map2 = new HashMap<String, List<String>>();
		
//		map2.put("raktim", new ArrayList<String>());
		String key = "raktim";
		
		int i = 0;
		while(i<3){
			String val = "math";
			if(i == 1)
				val = "computer";
			else if(i == 2)
				val = "english";
			
			
			if(map2.get(key) == null){
				List<String> subjects = new ArrayList<String>();
				subjects.add(val);
				map2.put(key, subjects);
			}else{
				List<String> subjects = map2.get(key);
				subjects.add(val);
				map2.put(key, subjects);
			}
			i++;
		}
		
		
		System.out.println("Subjects are: "+map2.get("raktim").toString());
		
		
	}
	
	
	
	
}
