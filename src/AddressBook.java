import java.util.HashMap;

public class AddressBook {
    private HashMap<String, String> contacts = new HashMap<String, String>();
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

    public void add(String key, String value){
        contacts.put()


    }
}
