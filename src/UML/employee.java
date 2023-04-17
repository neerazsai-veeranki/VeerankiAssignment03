package UML;

public class employee {
	// Attributes of employee
		private String name;
		// Employee name
		employee(String name)
		{
			// This keyword refers to current instance itself
			this.name = name;
		}

		// Method of Employee class
		public String getEmployeeName()
		{
			// returning the name of employee
			return this.name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		


}
