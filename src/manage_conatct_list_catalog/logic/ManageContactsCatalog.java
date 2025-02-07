package manage_conatct_list_catalog.logic;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import manage_conatct_list.beans.Contact;

public class ManageContactsCatalog {

    String path = "C:\\temporal\\contact.txt";

    public boolean addContact(int age, String name, String email) {
        if (searchContact(email) == null) {
            Contact contact = new Contact(name, email, age);
            try (FileOutputStream fos = new FileOutputStream(path, true);
                    PrintStream exit = new PrintStream(fos)) {
                exit.println(name + "|" + age + "|" + email);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        } else

        {
            return false;
        }
    }

    public Contact searchContact(String email) {
        Contact contact = null;
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = bf.readLine()) != null) {
                String[] data = s.split("[|]");
                if (data[2].equals(email)) {
                    contact = new Contact(data[0], data[2], Integer.parseInt(data[1]));
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contact;
    }

    public boolean removeContact(String email) {
        boolean res = false;
        Contact[] readAll = allContacts();
        try (PrintStream out = new PrintStream(path)) {
            for (Contact contact : readAll) {
                if (!email.equals(contact.getEmail())) {
                    out.println(contact.getName() + "|" + contact.getAge() + "|" + contact.getEmail());
                } else {
                    res = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public Contact[] allContacts() {
        ArrayList<Contact> contactsAll = new ArrayList<>();
        Contact contact = null;
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = bf.readLine()) != null) {
                String[] data = s.split("[|]");
                contact = new Contact(data[0], data[2], Integer.parseInt(data[1]));
                contactsAll.add(contact);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return contactsAll.toArray(new Contact[0]);
    }
}