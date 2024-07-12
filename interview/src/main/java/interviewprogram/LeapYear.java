package interviewprogram;

public class LeapYear {

	public static void main(String[] args) {
	
		int year=2020;
		
		if(year%400==0||year%4==0 )
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
		
		

	}

}
