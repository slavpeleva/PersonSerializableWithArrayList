package Person;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Commands are:");
		System.out.println("add person: add");
		System.out.println("remove person: remove");
		System.out.println("update person: update");
		System.out.println("display person: display");
		System.out.println("Enter command");
		InformationForPersons info = new InformationForPersons();
		while (in.hasNext()) {			
			String command = in.nextLine();
			switch (command) {
			case "add":
				System.out.println("Enter First name");
				String firstName = in.nextLine();
				System.out.println("Enter Last name");
				String lastName = in.nextLine();
				System.out.println("Enter Bank Account");
				String bankAcc = in.nextLine();
				System.out.println("Enter City");
				String city = in.nextLine();
				System.out.println("Enter street");
				String street = in.nextLine();
				BankAccount acc = new BankAccount(bankAcc);
				Address adr = new Address(city, street);
				Person person = new Person(firstName, lastName, acc, adr);
				info.addPerson(person);
				break;
			case "remove":
				System.out.println("Enter Bank Account");
				String bankAcc2 = in.nextLine();
				info.removePerson(bankAcc2);
				break;
			case "update":
				System.out.println("Enter First name");
				String firstName1 = in.nextLine();
				System.out.println("Enter Last name");
				String lastName1 = in.nextLine();
				System.out.println("Enter Bank Account");
				String bankAcc1 = in.nextLine();
				System.out.println("Enter City");
				String city1 = in.nextLine();
				System.out.println("Enter street");
				String street1 = in.nextLine();
				BankAccount acc1 = new BankAccount(bankAcc1);
				Address adr1 = new Address(city1, street1);
				Person person1 = new Person(firstName1, lastName1, acc1, adr1);
				info.updatePerson(bankAcc1, person1);
				break;
			case "display":
				info.displayPersons();
				break;
			default:System.out.println("Invalid command!");
				break;
			}
			System.out.println("Enter new command");
		}
	}

}
