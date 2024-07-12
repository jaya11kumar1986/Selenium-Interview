package interviewprogram;

public class Fibinocy {

	public static void main(String[] args) {
		
		int num=10;
		int t=0,t1=1;
		
		for(int i=0;i<num;i++) {
			
			System.out.print(t+" ");
			
			int sum=t+t1;
			t=t1;
			t1=sum;
			sum=t;
		}

	}

}
