package DemoOne;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=121;
		int pal=0;
		int rem;
		int num2=num;
		
		do {
			
			rem=num%10;
			pal=pal*10+rem;
			num=num/10;
		}while(num>0);
		
		System.out.println(pal);
		
		if(num2==pal)
			System.out.println("Palindrome");
				
		else
			System.out.println("No");

	}

}
