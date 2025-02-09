package manage_conatct_list.presentation;

import java.util.Scanner;

import manage_conatct_list.beans.Contact;
import manage_conatct_list.logic.ManageContacts;

public class ContactsOption {

    ManageContacts manageContacts = new ManageContacts();

    public void conctactsOption() {
        Scanner sc = new Scanner(System.in);
        int op, age;
        String name, email;
        do {
            System.out.println("1. Add contact");
            System.out.println("2. Search contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Show contacts");
            System.out.println("5. Filter by age");
            System.out.println("6. Exit");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Enter name");
                    name = sc.nextLine();
                    System.out.println("Enter email");
                    email = sc.nextLine();
                    System.out.println("Enter age");
                    age = Integer.parseInt(sc.nextLine());
                    manageContacts.addContact(age, name, email);
                    break;
                case 2:
                    System.out.println("Enter email");
                    email = sc.nextLine();
                    Contact contact = manageContacts.searchContact(email);
                    if (contact == null) {
                        System.out.println("Empty");
                    } else {
                        System.out.println("Current contact: " + contact.getName() + " - " + contact.getAge() + " - "
                                + contact.getEmail());
                    }
                    break;
                case 3:
                    System.out.println("Enter email");
                    email = sc.nextLine();
                    if (manageContacts.removeContact(email)) {
                        System.out.println("Delete!!!");
                    } else {
                        System.out.println("Empty");
                    }
                    break;
                case 4:
                    Contact[] allContacts = manageContacts.allContacts();
                    for (Contact con : allContacts) {
                        System.out.println("Info contact: " + con.getName() + " - " + con.getAge() + " - "
                                + con.getEmail());
                    }
                    break;
                case 5:
                    System.out.println("Entry max age; ");
                    age = Integer.parseInt(sc.nextLine());
                    Contact[] filter = manageContacts.getByMaxAge(age);
                    for (Contact obj : filter) {
                        System.out.println(obj.getName() + "-" + obj.getEmail() + "-" + obj.getAge());
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Enter valid option!");
            }
        } while (op != 6);
    }

}
