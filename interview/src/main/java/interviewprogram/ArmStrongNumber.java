package interviewprogram;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int num=152;
		
		int arm=0;
		
		int rem;
		
		int num2=num;
		
		do {
			
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}while(num>0);
			if(num2==arm)
				System.out.println("ArmStrong Number");
			else
				System.out.println("No");

	}

}
