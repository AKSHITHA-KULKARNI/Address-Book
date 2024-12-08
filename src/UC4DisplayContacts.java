import java.util.ArrayList;

public class UC4DisplayContacts {
    private ArrayList<Contact> contacts;

    public UC4DisplayContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address book is empty.");
            return;
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
