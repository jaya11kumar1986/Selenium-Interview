package interviewprogram;

public class ArraySort {

	public static void main(String[] args) {
	
		int a[]= {10,100,20,15,25};
		
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
		

	}

}
