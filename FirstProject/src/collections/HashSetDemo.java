package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		
//		SYNTAX: 
//		HashSet<DataType> setName = new HashSet<DataType>();
//		  										optional
		Set<Integer> set1 = new HashSet<Integer>();
		
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(100);
		set1.add(500);
		set1.add(600);
		
		
		System.out.println(set1);
		
		
//		iterate over HashSet
		
		for(Integer i : set1)
		{
			System.out.println(i);
		}
		
//		contains
		 boolean contains = set1.contains(6000);
		
		System.out.println(contains);
		
//		remove
		
		 boolean remove = set1.remove(200);
		 System.out.println(set1);
		 
		System.out.println(remove);
		
//		size
		
		System.out.println(set1.size());
		
	}
	
	
	
	
	
	
	

}
