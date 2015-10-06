package Exceptions;

public class PersonExceptions extends Exception {
	private String messagge;
	private String field;
	
	public PersonExceptions(String messagge, String field) {
		super(messagge);
		this.messagge = messagge;
		this.field = field;
	}

	public String getMessagge() {
		return this.field + ": " + this.messagge;
	}

}
