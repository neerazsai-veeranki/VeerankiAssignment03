package vectorandArrayList;

import java.io.*;
import java.util.*;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating an ArrayList
				ArrayList<String> al = new ArrayList<String>();

				// adding object to arraylist
				al.add("Practice.PatternsandApplications.org");
				al.add("quiz.PatternsandApplications.org");
				al.add("code.PatternsandApplications.org");
				al.add("contribute.PatternsandApplications.org");

				// traversing elements using Iterator'
				System.out.println("ArrayList elements are:");
				Iterator it = al.iterator();
				while (it.hasNext())
					System.out.println(it.next());

				// creating Vector
				Vector<String> v = new Vector<String>();
				v.addElement("Practice");
				v.addElement("quiz");
				v.addElement("code");

				// traversing elements using Enumeration
				System.out.println("\nVector elements are:");
				Enumeration e = v.elements();
				while (e.hasMoreElements())
					System.out.println(e.nextElement());


	}

}
