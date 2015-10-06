package Person;

import java.util.ArrayList;
import java.util.HashMap;


public class InformationForPersons {
	private ArrayList<Person> persons;
	private WritePersonFile writer;
	private ReadPersonFile reader;
	
	public InformationForPersons() {
		super();		
		writer = new WritePersonFile();
		reader = new ReadPersonFile();
		if (this.reader.isFileEmpty()) {
			this.persons = new ArrayList<Person>();
		}
		else {
			this.persons = reader.readFromFile();
		}
	}
	
	public void addPerson(Person person){
		boolean isValidId = true;
		for (int i = 0; i < this.persons.size(); i++) {
			if (person.getBankAcc().getId().equals(this.persons.get(i).getBankAcc().getId())) {
				System.out.println("Your id is already in use");
				isValidId = false;
				
			}
		}
		if (isValidId) {
			this.persons.add(person);
			writer.writeToFile(this.persons);
		}
		
	}
	
	public void removePerson(String bankID){	
		int position = -1;
		for (int i = 0; i < this.persons.size(); i++) {
			if (bankID.equals(this.persons.get(i).getBankAcc().getId())) {
				position = i;
			
			}
		}
		if (position!= -1) {
			this.persons.remove(position);
			writer.writeToFile(persons);
		}
		else {
			System.out.println("No such person");
		}
		
	}
	
	public void updatePerson(String bankId,Person person){
		for (int i = 0; i < this.persons.size();i++) {
			if (bankId.equals(this.persons.get(i).getBankAcc().getId())) {
				this.persons.set(i, person);
			}
		}
		writer.writeToFile(persons);
	}
	
	public void displayPersons(){
		this.persons = reader.readFromFile();
		StringBuilder sb = new StringBuilder();
		sb.append("First name	Last name	Bank Account	City		Street\n");
		for (Person person : persons) {
			sb.append(person.getFirstName()+ "		"
		+ person.getLastName()+ "		"+ person.getBankAcc().getId() + "		"
		+ person.getAddress().getCity()+"		"+ person.getAddress().getStreet()+"\n");
		}
		System.out.println(sb.toString());
	}
}
