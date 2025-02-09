package manage_conatct_list.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public Contact[] getByMaxAge(int age) {
        ArrayList<Contact> aux = new ArrayList<>();
        listContact.forEach((k, v) -> {
            if (v.getAge() <= age) {
                aux.add(v);
            }
        });
        Contact[] str = aux.toArray(new Contact[0]);
        return str;
    }

    public boolean existsContact(String name) {
        Stream<Contact> st = listContact.values().stream();
        return st.anyMatch(c -> c.getName().equals(name));
    }

    public Contact MaxContact() {
        Stream<Contact> st = listContact.values().stream();
        return st.max((c1, c2) -> c1.getAge() - c2.getAge()).get();
    }

    public Contact searchByName(String name) {
        Stream<Contact> st = listContact.values().stream();
        return st.filter(c -> c.getName().equals(name)).findFirst().get();
    }

    public List<String> searchAllNames(String name) {
        Stream<Contact> st = listContact.values().stream();
        return st.map(c -> c.getName()).collect(Collectors.toList());
    }

    public double ageAvg() {
        Stream<Contact> st = listContact.values().stream();
        return st.mapToInt(c -> c.getAge()).average().getAsDouble();
    }

    public Contact[] getByMaxAgeSt(int age) {
        Stream<Contact> st = listContact.values().stream();
        return st.filter(c -> c.getAge() <= age).toArray(t -> new Contact[t]);

    }
}