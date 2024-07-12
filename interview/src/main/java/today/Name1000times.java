package today;

public class Name1000times {

	public static void main(String[] args) {
		
		String name="jaya";
		String s="i";
		
		s=s.replaceAll("i","iiiiiiiiii");
		s=s.replaceAll("i","iiiiiiiiii");
		s=s.replaceAll("i","iiiiiiiiii");
		
		s=s.replaceAll("i",name+"\n");
		
		System.out.println(s);

	}

}
