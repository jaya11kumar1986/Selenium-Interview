package DemoOne;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

public class Duplicate {

	public static void main(String[] args) {
		
		int a[]= {10,20,5,4,5,10,1,20,45};
		
		int x=a.length;
		
		int b[]=new int [x];
		
		List<Integer>li=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					//System.out.println(a[i]);
					
					//b[i]=a[i];
					li.add(a[i]);
					
				}
			}
			
			//if(b[i]!=a[i]) {
				//System.out.print(a[i]+" ");
			//}
		}
		
	
		

	}

}
