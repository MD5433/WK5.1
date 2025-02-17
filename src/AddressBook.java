import java.util.HashMap;

public class AddressBook {
    private static HashMap<String, String> contacts = new HashMap<String, String>();
    private String searchContact;

    public AddressBook(HashMap<String, String> contacts, String searchContact) {
        this.contacts = contacts;
        this.searchContact = searchContact;
    }

    public HashMap<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(HashMap<String, String> contacts) {
        this.contacts = contacts;
    }

    public String getSearchContact() {
        return searchContact;
    }

    public void setSearchContact(String searchContact) {
        this.searchContact = searchContact;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contacts=" + contacts +
                ", searchContact='" + searchContact + '\'' +
                '}';
    }
//other methods
    public static void addContact(Person a){
        contacts.put(a.getName(), a.getEmail());
        System.out.println("Contact: " + a.getName() + " and their email: " + a.getEmail() + " was added.");


    }

    public static void searchContact(String name){
        String email = contacts.get(name);
        System.out.println("The contact: " + name + " email is: " + email);
    }


}

