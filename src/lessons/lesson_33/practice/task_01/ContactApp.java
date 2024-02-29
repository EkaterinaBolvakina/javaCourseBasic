package lessons.lesson_33.practice.task_01;

public class ContactApp {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.addContact(new Contact("Anna","176 23 34 455"));
        manager.addContact(new Contact("Roman","176 88 34 455"));
        manager.addContact(new Contact("AnnaB","163 99 34 345"));
        manager.addContact(new Contact("Bella","176 88 94 254"));
        manager.addContact(new Contact("Tom","176 76 55 222"));

        manager.getContacts();
        manager.removeContact(new Contact("Anna","176 23 34 455"));
        manager.addContact(new Contact("Anna","176 23 34 888"));
        Contact contactByName = manager.getContactByName("Anna");
        Contact contactByPhoneNumber = manager.getContactByPhoneNumber("176 76 55 222");
        System.out.println(contactByName);
        System.out.println(contactByPhoneNumber);


    }
}
