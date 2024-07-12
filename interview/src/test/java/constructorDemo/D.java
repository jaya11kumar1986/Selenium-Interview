package constructorDemo;

public class D extends C {
	int y;
	D(int _x,int y){

		super(_x);
		y=y;

	}
	
	 void Display()
	    {
	        // Print statement
	        System.out.println("x = " + x + ", y = " + y);
	    }

}
