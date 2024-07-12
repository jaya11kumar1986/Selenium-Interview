package interfaceDemo;

public class G extends F{
	
	@Override
	void add() {
		System.out.println("Add");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		G g=new G();
		
		g.add();
		g.show();
		System.out.println(g.a);

	}

	

}
