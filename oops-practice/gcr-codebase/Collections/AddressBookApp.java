package Collection;

import java.util.*;

class Contact {
    String name, phone, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBookApp {
    static ArrayList<Contact> list = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phones = new HashSet<>();

    static void add(String name, String phone, String email) {
        if (phones.contains(phone)) {
            System.out.println("Duplicate phone!");
            return;
        }
        Contact c = new Contact(name, phone, email);
        list.add(c);
        map.put(name, c);
        phones.add(phone);
    }

    static void search(String name) {
        System.out.println(map.getOrDefault(name, null));
    }

    static void display() {
        list.sort(Comparator.comparing(c -> c.name));
        for (Contact c : list)
            System.out.println(c.name + " " + c.phone + " " + c.email);
    }

    public static void main(String[] args) {
        add("Aman", "123", "a@gmail.com");
        add("Riya", "456", "r@gmail.com");
        display();
    }
}
