package interviewprogram;

public class ArrayCompare {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		boolean status=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					status=false;
					break;
				}}
			}
		
		else {
			status=false;
		}
		
		if(status) {
			System.out.println("Equal");
		}
		
		else {
			System.out.println("Not equal");
		}

	}

}
