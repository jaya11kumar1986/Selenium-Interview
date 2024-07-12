package today;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
	
		Map<Integer,String>map=new HashMap<Integer,String>();
		//add()
		map.put(1,"jai");
		map.put(2,"sri");
		map.put(3,"tamil");
		map.put(4,"venil");
		
		System.out.println(map);
		//containsKey()
		boolean containsKey = map.containsKey(2);
		System.out.println(containsKey);
		//containsValue()
		boolean containsValue = map.containsValue("sri");
		System.out.println(containsValue);
		//get()
		String getValue = map.get(4);
		System.out.println(getValue);
		//Putall()
		Map<Integer,String>map1=new HashMap<Integer,String>();
		map1.putAll(map);
		System.out.println(map1);
		//equals()
		boolean equals = map.equals(map1);
		System.out.println(equals);
		//empty()
		boolean empty = map.isEmpty();
		System.out.println(empty);
		
		int size = map.size();
		System.out.println(size);
		
		
		List<Integer>l=new ArrayList<Integer>();
	
		

	}

}
