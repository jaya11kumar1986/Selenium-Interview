package constructorDemo;

public class Demo1 {
	
	//int,byte char,long -0
	//double,float-0.0
	//String-null

	String product_Name;
	int price,discount;
	
	Demo1(String p,int pr,int d){
		
		this.product_Name=p;
		this.price=pr;
		this.discount=d;
		
	}

	public static void main(String[] args) {

		Demo1 d=new Demo1("Shampoo",5000,5);
		Demo1 d1=new Demo1("Pencil",5000,5);
		Demo1 d2=new Demo1("car",5000,5);
		
		d.sell();
		d1.sell();
		d2.sell();
	}


	private void sell() {
		
		System.out.println(product_Name+" "+price+" "+discount);
	}

}
