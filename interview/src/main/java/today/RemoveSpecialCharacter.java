package today;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		
		String name="[jaya11kumar@gmail.com]";
		
		String result="";
		
		for(int i=0;i<name.length();i++) {
			
			if((name.charAt(i)>64 && name.charAt(i)<90) || (name.charAt(i)>96 && name.charAt(i)<122)) {
				
				result=result+name.charAt(i);
			}
			
			
		}
			System.out.println(result);	
				

	}

}
