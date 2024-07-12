package DemoOne;

import java.util.Arrays;

public class AnnaGram {

	public static void main(String[] args) {
		
		String a="keep";
		String b="peec";
		
		boolean flag=true;
		
		if(a.length()!=b.length()) {
			flag=false;
		}
		
		else {
			
			char c[]=a.toCharArray();
			char d[]=b.toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(d);
			
		
			flag = Arrays.equals(c,d);
		}
		
		if(flag)
			System.out.println("Anagram");
		else
			System.out.println("No");

	}

}
