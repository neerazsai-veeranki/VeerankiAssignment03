package UML;

import java.util.HashSet;
import java.util.Set;

public class GFG {

		public static void main(String[] args)
		{
			// Creating objects of bank and Employee class
			bank bank = new bank("ICICI");
			employee emp = new employee("Ridhi");

			Set<employee> employees = new HashSet<>();
			employees.add(emp);
		
			bank.setEmployees(employees);
		
			System.out.println(bank.getemployees()+"are belongs to bank"+bank.getbankName());
		}

}
