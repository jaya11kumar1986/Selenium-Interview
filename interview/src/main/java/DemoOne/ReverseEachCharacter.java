package DemoOne;

public class ReverseEachCharacter {

	public static void main(String[] args) {
		String name="i am tamilan";

		String words[]=name.split(" ");

		String rev="";
		
		for(String word:words) {
			
			String out="";
			
			for(int i=word.length()-1;i>=0;i--) {
				
				out=out+word.charAt(i);
			}
			rev=rev+out+" ";
			
		}
		
		System.out.println(rev);

	}

}
