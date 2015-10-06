package Person;

import java.io.Serializable;

import Exceptions.AddressException;
import Exceptions.BankAccountIdException;
import Exceptions.PersonExceptions;

public class Address implements Serializable {
	private String city;
	private String street;	
	
	public Address(String city, String street) {
		super();
		setCity(city);
		setStreet(street);
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		try {
			if (city.isEmpty() || city==null) {
				throw new AddressException("can't be null or empty!");
			}
			else {
				this.city = city;
			}
		} catch (PersonExceptions e) {
			System.err.println(e.getMessagge());
		}
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		try {
			if (street.isEmpty() || street==null) {
				throw new AddressException("can't be null or empty!");
			}
			else {
				this.street = street;
			}
		} catch (PersonExceptions e) {
			System.err.println(e.getMessagge());
		}
	}
	
}
