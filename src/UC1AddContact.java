import java.util.ArrayList;

public class UC1AddContact {
    private ArrayList<Contact> contacts;

    public UC1AddContact(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }
}
