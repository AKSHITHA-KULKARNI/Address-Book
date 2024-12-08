import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        // UC6: Initialize multiple address books
        UC6MultipleAddressBooks multipleAddressBooks = new UC6MultipleAddressBooks();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add New Address Book");
            System.out.println("2. Use Existing Address Book");
            System.out.println("3. Display All Address Books");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the new Address Book:");
                    String newBookName = scanner.nextLine();
                    multipleAddressBooks.addNewAddressBook(newBookName);
                    break;

                case 2:
                    System.out.println("Enter the name of the Address Book to use:");
                    String bookName = scanner.nextLine();
                    ArrayList<Contact> currentAddressBook = multipleAddressBooks.getAddressBook(bookName);

                    if (currentAddressBook == null) {
                        System.out.println("Address Book '" + bookName + "' does not exist.");
                    } else {
                        useAddressBook(currentAddressBook);
                    }
                    break;

                case 3:
                    multipleAddressBooks.displayAllAddressBooks();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void useAddressBook(ArrayList<Contact> addressBook) {
        Scanner scanner = new Scanner(System.in);

        // Create UC handlers for this specific address book
        UC5AddMultipleContacts addMultipleContactsHandler = new UC5AddMultipleContacts(addressBook);
        UC2EditContact editContactHandler = new UC2EditContact(addressBook);
        UC3DeleteContact deleteContactHandler = new UC3DeleteContact(addressBook);
        UC4DisplayContacts displayContactsHandler = new UC4DisplayContacts(addressBook);

        while (true) {
            System.out.println("\nChoose an option for the Address Book:");
            System.out.println("1. Add Multiple Contacts");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Return to Main Menu");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addMultipleContactsHandler.addMultipleContacts();
                    break;

                case 2:
                    System.out.println("Enter first name of the contact to edit:");
                    String nameToEdit = scanner.nextLine();
                    editContactHandler.editContact(nameToEdit);
                    break;

                case 3:
                    System.out.println("Enter first name of the contact to delete:");
                    String nameToDelete = scanner.nextLine();
                    deleteContactHandler.deleteContact(nameToDelete);
                    break;

                case 4:
                    displayContactsHandler.displayContacts();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
