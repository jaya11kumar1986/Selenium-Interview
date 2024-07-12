package DemoOne;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String name="i am tamilan";
		
		String words[]=name.split(" ");
		
		String rev="";
		
		for(int i=words.length-1;i>=0;i--) {
			
			rev=rev+words[i]+" ";
		}
		
		System.out.println(rev);

	}

}
