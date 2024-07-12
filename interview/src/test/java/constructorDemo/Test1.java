package constructorDemo;

public class Test1 {

	Test1(){

		System.out.println("Constructor");
	}

	Test1(int x,int y){

		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {

		Test1 ts=new Test1(10,12);
		Test1 ts1=new Test1();
	}

}
