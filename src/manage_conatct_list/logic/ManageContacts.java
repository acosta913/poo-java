package manage_conatct_list.logic;

import java.util.Collection;
import java.util.HashMap;

import manage_conatct_list.beans.Contact;

public class ManageContacts {
    HashMap<String, Contact> listContact;

    public ManageContacts() {
        listContact = new HashMap<>();
    }

    public boolean addContact(int age, String name, String email) {
        if (!listContact.containsKey(email)) {
            Contact contact = new Contact(name, email, age);
            listContact.put(email, contact);
            return true;
        } else {
            return false;
        }
    }

    public Contact searchContact(String email) {
        Contact contact = null;
        if (listContact.containsKey(email)) {
            contact = listContact.get(email);
        }
        return contact;
    }

    public boolean removeContact(String email) {
        if (listContact.containsKey(email)) {
            listContact.remove(email);
            return true;
        } else {
            return false;
        }
    }

    public Contact[] allContacts() {
        Contact[] contactsAll = new Contact[listContact.size()];
        int i = 0;
        Collection<Contact> contacts = listContact.values();
        for (Contact contact : contacts) {
            contactsAll[i] = contact;
            i++;
        }
        return contactsAll;
    }
}