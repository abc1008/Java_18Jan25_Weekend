package collections;

import java.util.ArrayList;

public class ListDemo 
{
	
	public static void main(String[] args) 
	{
		
//		SYNTAX: 
//		ArrayList<DataType> listName = new ArrayList<DataType>();
//													  optional
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		
//		insert
		
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(500);
		list1.add(100);
		
		
		System.out.println(list1);
		
//		get
		
		Integer getData = list1.get(3);
		System.out.println(getData);
		
		
//		delete
		list1.remove(2);
		
		System.out.println(list1);
		
		list1.add(600);
		
		System.out.println(list1);
		
		
//		update
		
		list1.set(2, 1000);
		System.out.println(list1);
		
		
//		size
		
		System.out.println(list1.size());
		
		
		for(Integer i : list1)
		{
			System.out.println(i);
		}
	}
	

}
