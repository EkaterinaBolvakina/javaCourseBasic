package lessons.lesson_33.practice.task_01;


import java.util.HashSet;
import java.util.Set;
public class ContactManager {
    Set<Contact> contactSet = new HashSet<>();

    public void addContact(Contact contact) {

            if (!contactSet.contains(contact)) {
                contactSet.add(contact);
                System.out.println("Kontakt '"+ contact.getName()+"' ist hinzugefügt");
            } else {
                System.out.println("Kontakt '"+ contact.getName()+"' besteht bereits in der Liste");
            }
        }

    public void removeContact(Contact contact) {
        if (contactSet.contains(contact)) {
            contactSet.remove(contact);
            System.out.println("Kontakt '"+ contact.getName()+": "+contact.getPhoneNumber()+"' ist gelöscht");
        } else {
            System.out.println("Kontakt '"+ contact.getName()+": "+contact.getPhoneNumber()+"' existiert nicht");
        }
    }

    public void getContacts() {
        System.out.println(" ---- Liste aller Kontakten ----");
        for (Contact contact : contactSet) {
            System.out.println(contact);
        }
    }

    public Contact getContactByName(String name) {
        for (Contact contact : contactSet) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public Contact getContactByPhoneNumber(String phoneNumber){
            for (Contact contact : contactSet) {
                if (contact.getPhoneNumber().equals(phoneNumber)) {
                    return contact;
                }
            }
            return null;
        }

}










