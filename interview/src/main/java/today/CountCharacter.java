package today;

public class CountCharacter {

	public static void main(String[] args) {

		String input="i am human";
		int count=0;
		for(int i=0;i<input.length();i++) {

			char c=' ';
			if(input.charAt(i)!=c) {

				count++;

			}
		}
		System.out.println(count);
	}

}
