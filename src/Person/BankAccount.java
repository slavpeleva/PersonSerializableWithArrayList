package Person;

import java.io.Serializable;

import Exceptions.BankAccountIdException;
import Exceptions.PersonExceptions;

public class BankAccount implements Serializable {
	private String id;
	

	public BankAccount(String id) {
		super();
		setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		try {
			if (id.isEmpty() || id==null) {
				throw new BankAccountIdException("can't be null or empty!");
			}
			else {
				this.id = id;
			}
		} catch (PersonExceptions e) {
			System.err.println(e.getMessagge());
		}		
	}
	
}
