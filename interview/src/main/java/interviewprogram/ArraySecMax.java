package interviewprogram;

public class ArraySecMax {

	public static void main(String[] args) {
		
		int a[]= {10,100,20,15,25};

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
