package Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadPersonFile {
	private ObjectInputStream input;
	
	private void openFile(){
		try {
			input = new ObjectInputStream(new FileInputStream("person.ser"));
		} catch (FileNotFoundException e) {
			System.err.println("No such file");		
		} catch (IOException e) {
			System.err.println("Error opening file");			
		}
	}
	
	public ArrayList<Person> readFromFile(){
		ArrayList<Person> arr= null;
		try {
			openFile();
			arr = (ArrayList<Person>)input.readObject();
			
		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			closeFile();		}
		return arr;
	}
	
	private void closeFile(){
		try {
			if (input != null) {
				input.close();
			}
		} catch (IOException e) {
			System.err.println("Problem with closing file");
			//System.exit(1);
		}
	}
	public boolean isFileEmpty(){
		try {
			openFile();
		} catch (Exception e) {
			return true;
		}
		finally{
			closeFile();
		}
		return false;
	}
	
	
}
