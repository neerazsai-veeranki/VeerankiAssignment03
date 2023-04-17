package generics;

import java.util.ArrayList;

public class GenericsDemo {
	
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();		// ArrayList is an example of generic class
		
		list.add("ramu");
		list.add("somu");
		
		System.out.println(list);
		
	}
	
}
