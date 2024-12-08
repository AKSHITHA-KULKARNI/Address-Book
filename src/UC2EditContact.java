import java.util.ArrayList;
import java.util.Scanner;

public class UC2EditContact {
    private ArrayList<Contact> contacts;

    public UC2EditContact(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void editContact(String firstName) {
        Scanner scanner = new Scanner(System.in);
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("Enter new address: ");
                contact.setAddress(scanner.nextLine());

                System.out.println("Enter new city: ");
                contact.setCity(scanner.nextLine());

                System.out.println("Enter new state: ");
                contact.setState(scanner.nextLine());

                System.out.println("Enter new zip: ");
                contact.setZip(scanner.nextLine());

                System.out.println("Enter new phone number: ");
                contact.setPhoneNumber(scanner.nextLine());

                System.out.println("Enter new email: ");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}
