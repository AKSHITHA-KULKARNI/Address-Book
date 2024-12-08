import java.util.ArrayList;

public class UC3DeleteContact {
    private ArrayList<Contact> contacts;

    public UC3DeleteContact(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void deleteContact(String firstName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}
