package CollectionFramework;

import java.util.*;

public class AddressBookData {

    static ArrayList<Contacts> contact = new ArrayList<>();
    static HashMap<String, Contacts> contactMap = new HashMap<>();
    static HashSet<String> phoneNumber= new HashSet<>();

    public void addContact(String name, String number, String email){
        if(phoneNumber.contains(number)){
            System.out.println("User Already Exists!!");
            return;
        }
        Contacts user = new Contacts(name, number, email);
        contact.add(user);
        contactMap.put(name, user);
        phoneNumber.add(number);
        System.out.println("Contact Added Successfully!!");
    }

    public void search(String name ){
        Contacts c = contactMap.get(name);
        if(c!= null){
            System.out.println(c);
        }
        else{
            System.out.println("Contact with name"+ name +"not found");
        }
    }
    public void delete(String name){
        Contacts c = contactMap.get(name);
        if(c!= null){
            contactMap.remove(name);
            contact.remove(c);
            phoneNumber.remove(c.getPhoneNumber());
            System.out.println("Contact has been deleted");
        }
        else{
            System.out.println("Contact with name "+ name +"not found");
        }
    }
    public void display() {
        Collections.sort(contact);
        for(Contacts c : contact) {
            System.out.println(c);
        }
    }
}
