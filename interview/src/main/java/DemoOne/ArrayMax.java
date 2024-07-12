package DemoOne;

public class ArrayMax {

	public static void main(String[] args) {
		
		int a[]= {20,50,10,1,22,45,78,12};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
			}
		}
		
		System.out.println(max);

	}

}
