package Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WritePersonFile {
	private ObjectOutputStream output;
	
	private void openFile(){
		try {
			output = new ObjectOutputStream(new FileOutputStream(
					"person.ser"));
		} catch (FileNotFoundException e) {
			System.err.println("File not found");

		} catch (IOException e) {
			System.err.println("Problem with opening");
		}
	}
	
	public void writeToFile(ArrayList<Person> arr){
		try {
			openFile();
			output.writeObject(arr);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}finally{
			closeFile();
		}
		
	}
	private void closeFile(){
		try {
			if (output != null) {
				output.close();
			}
		} catch (Exception e) {
			System.err.println("can't close the file!");
		}
	}
}
