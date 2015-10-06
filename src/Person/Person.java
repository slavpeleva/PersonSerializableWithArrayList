package Person;

import java.io.Serializable;

import Exceptions.FirstNameException;
import Exceptions.LastNameException;
import Exceptions.PersonExceptions;

public class Person implements Serializable {
	private String firstName;
	private String lastName;
	private BankAccount bankAcc;
	private Address address;
	
	
	public Person(String firstName, String lastName, BankAccount bankAcc,
			Address address) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setBankAcc(bankAcc);
		setAddress(address);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		try {
			if (firstName.isEmpty() || firstName==null) {
				throw new FirstNameException("can't be empty");
			}
			else {
				this.firstName = firstName;
			}
		} catch (PersonExceptions e) {
			System.err.println(e.getMessagge());
		}
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		try {
			if (lastName.isEmpty() || lastName==null) {
				throw new LastNameException("can't be empty");
			}
			else {
				this.lastName = lastName;
			}
		} catch (PersonExceptions e) {
			System.err.println(e.getMessagge());
		}
	}
	public BankAccount getBankAcc() {
		return bankAcc;
	}
	public void setBankAcc(BankAccount bankAcc) {
		this.bankAcc = bankAcc;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
