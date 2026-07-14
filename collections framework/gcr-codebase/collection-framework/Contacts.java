package CollectionFramework;

public class Contacts implements Comparable<Contacts>{
    private String Name;
    private String PhoneNumber;
    private String Email;

//    public Contacts(String name, String phoneNumber, String email) {
//        Name = name;
//        PhoneNumber = phoneNumber;
//        Email = email;
//    }

    Contacts(String Name, String Phone, String Email) {
        this.Name = Name;
        this.PhoneNumber = Phone;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "Name='" + Name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contacts c){
        return this.Name.compareToIgnoreCase(c.Name);
    }
}
