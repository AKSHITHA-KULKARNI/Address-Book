import java.util.ArrayList;
import java.util.HashMap;

public class UC6MultipleAddressBooks {
    private HashMap<String, ArrayList<Contact>> addressBooks;

    public UC6MultipleAddressBooks() {
        this.addressBooks = new HashMap<>();
    }

    public void addNewAddressBook(String bookName) {
        if (addressBooks.containsKey(bookName)) {
            System.out.println("Address Book with this name already exists.");
        } else {
            addressBooks.put(bookName, new ArrayList<>());
            System.out.println("Address Book '" + bookName + "' added successfully!");
        }
    }

    public ArrayList<Contact> getAddressBook(String bookName) {
        return addressBooks.get(bookName); // Correct usage of HashMap's get method
    }

    public void displayAllAddressBooks() {
        if (addressBooks.isEmpty()) {
            System.out.println("No Address Books available.");
        } else {
            System.out.println("Available Address Books:");
            for (String bookName : addressBooks.keySet()) {
                System.out.println("- " + bookName);
            }
        }
    }
}
