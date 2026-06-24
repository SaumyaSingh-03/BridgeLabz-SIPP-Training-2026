package OOPS;

public class MobilePhone {
    String brand;
    String model;
    double price;

    public void DisplayDetails() {
        System.out.println("Brand of the Phone: " +brand);
        System.out.println("Model of the Phone: " +model);
        System.out.println("Price of the Phone: " +price);
    }
    public static void main(String[] args){
        MobilePhone phone = new MobilePhone();

        phone.brand = "iPhone";
        phone.model = " iPhone 17 Pro Max";
        phone.price = 125000.00;

        phone.DisplayDetails();
    }
}
