package DemoOne;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		
		String name="srividya";
		
		Map<Character,Integer>map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<name.length();i++) {
			
			if(map.containsKey(name.charAt(i))) {
				
				map.put(name.charAt(i),map.get(name.charAt(i))+1);
			}
			
			else {
				
				map.put(name.charAt(i),1);
			}
		}
		
		System.out.println(map);
				

	}

}
