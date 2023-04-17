package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo object = new Demo(1, "patternsandframeworks");
		String filename = "file.ser";
		
		// Serialization
		try
		{
			//Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// Method for serialization of object
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");

		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}


	}

}
