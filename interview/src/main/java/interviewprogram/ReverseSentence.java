package interviewprogram;

public class ReverseSentence {

	public static void main(String[] args) {

		String input="i am tamil";
		
		String words[]=input.split(" ");

		String output="";
		
		for(int i=words.length-1;i>=0;i--) {
			
			output=output+words[i]+" ";
		}
		System.out.println(output);

	}

}
