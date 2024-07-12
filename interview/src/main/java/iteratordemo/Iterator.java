package iteratordemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
	
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		java.util.Iterator<Integer> it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------------");
		ListIterator<Integer> lt=li.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("-----------------------");
		
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}
