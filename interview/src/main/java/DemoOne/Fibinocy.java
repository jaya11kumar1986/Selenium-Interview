package DemoOne;

public class Fibinocy {

	public static void main(String[] args) {
		
		int t=0,t1=1;
		
		for(int i=0;i<10;i++) {
			
			System.out.print(t+",");
			
			int sum=t+t1;
			
			t=t1;
			t1=sum;
			
			
			
		}

	}

}
