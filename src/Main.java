import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Create UC handlers
        UC1AddContact addContactHandler = new UC1AddContact(contacts);
        UC2EditContact editContactHandler = new UC2EditContact(contacts);
        UC3DeleteContact deleteContactHandler = new UC3DeleteContact(contacts);
        UC4DisplayContacts displayContactsHandler = new UC4DisplayContacts(contacts);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
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
                    addContactHandler.addContact(contact);
                    break;

                case 2:
                    System.out.println("Enter first name of the contact to edit: ");
                    String nameToEdit = scanner.nextLine();
                    editContactHandler.editContact(nameToEdit);
                    break;

                case 3:
                    System.out.println("Enter first name of the contact to delete: ");
                    String nameToDelete = scanner.nextLine();
                    deleteContactHandler.deleteContact(nameToDelete);
                    break;

                case 4:
                    displayContactsHandler.displayContacts();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
