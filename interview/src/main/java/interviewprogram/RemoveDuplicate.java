package interviewprogram;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[]= {10,100,20,15,25,100,10};
		
		int x=a.length;
		
		int b[]=new int[x];
		
		for(int i=0;i<x;i++) {
			
			for(int j=i+1;j<x;j++) {
				
				if(a[i]==a[j]) {
					
					b[i]=a[i];
					//System.out.println(a[i]);
				}
			}
			if(b[i]!=a[i]) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
