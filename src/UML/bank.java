package UML;

import java.io.*;
import java.util.Set;

public class bank {
	// Attributes of bank
		private String name;
		
		private Set<employee> employees;
		// Constructor of this class
		bank(String name)
		{
			// this keyword refers to current instance itself
			this.name = name;
		}

		// Method of Bank class
		public String getbankName()
		{
			// Returning name of bank
			return this.name;
		}

		public void setemployees(Set<employee> employees){
			this.employees = employees;
		}
	public Set<employee> getemployees(Set<employee> employees){
			return this.employees;
		}


}
