package interviewprogram;

public class PolyDromeIntDemo {

	public static void main(String[] args) {
	
		int num=324;
		int pol=0;
		int rem;
		int num2=num;
		
		do {
			
			rem=num%10;
			pol=pol*10+rem;
			num=num/10;
		}while(num>0);
		
		if(num2==pol)
			System.out.println("Polydrome");
		else{
			System.out.println("No");
		}

	}

}
