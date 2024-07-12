package DemoOne;

public class SecondMax {

	public static void main(String[] args) {
		int a[]= {20,50,10,1,22,45,78,12};

		int max=a[0];
		
		int smax=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				
				smax=max;
				max=a[i];
			}
			
			else if(a[i]>smax) {
				smax=a[i];
			}
		}
		
		System.out.println(smax);

	}

}
