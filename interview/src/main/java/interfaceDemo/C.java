package interfaceDemo;

public class C implements B {

	@Override
	public void add() {
		
		System.out.println("Class");
	}
	
	public static void main(String[] args) {
		
		C c=new C();
		c.add();
		
		System.out.println(B.age1);
	}
	
	

}
