import java.util.ArrayList;
import java.util.Scanner;

public class UC5AddMultipleContacts {
    private ArrayList<Contact> contacts;

    public UC5AddMultipleContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addMultipleContacts() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.println("Enter address: ");
            String address = scanner.nextLine();

            System.out.println("Enter city: ");
            String city = scanner.nextLine();

            System.out.println("Enter state: ");
            String state = scanner.nextLine();

            System.out.println("Enter zip: ");
            String zip = scanner.nextLine();

            System.out.println("Enter phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Enter email: ");
            String email = scanner.nextLine();

            Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
            contacts.add(contact);

            System.out.println("Contact added successfully!");

            System.out.println("Do you want to add another contact? (yes/no)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
