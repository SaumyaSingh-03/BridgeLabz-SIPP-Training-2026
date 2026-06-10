package ScenerioBased;
import java.util.*;
public class CoffeeShop {
    String CoffeeTypes;
    int Quantity;
    public double calculatePrice(double price){
        double bill= price*Quantity;
        double gst=bill*0.18;
        double finalBill=bill+gst;
        return finalBill;
    }
    public void generateBill(double bill){
        System.out.println("COFFEE TYPE->" + CoffeeTypes);
        System.out.println("QUANTITY->" + Quantity);
        System.out.println("BILL AMOUNT->" + bill);
        System.out.println("THANK YOU FOR VISITING!!");
    }
    public static void main (String[]args){
        System.out.println("Choose Coffee Type or Exit!!");
        System.out.println("1.Cappuccino:-250 \n2.Latte:-270\n3.Americano:-200\n4.Espresso:-230\n5.Matcha:-300\n6.Strawberry Matcha-360");
        Scanner sc =new Scanner(System.in);
        int choice = sc.nextInt();
        CoffeeShop coffee = new CoffeeShop();
        System.out.println("Quantity");
        coffee.Quantity=sc.nextInt();
        switch(choice){
            case 1:
                coffee.generateBill(coffee.calculatePrice(250));
                coffee.CoffeeTypes="Cappuccino";
                break;

            case 2:
                coffee.generateBill(coffee.calculatePrice(270));
                coffee.CoffeeTypes="Latte";
                break;

            case 3:
                coffee.generateBill(coffee.calculatePrice(200));
                coffee.CoffeeTypes="Americano";
                break;

            case 4:
                coffee.generateBill(coffee.calculatePrice(230));
                coffee.CoffeeTypes="Espresso";
                break;

            case 5:
                coffee.generateBill(coffee.calculatePrice(300));
                coffee.CoffeeTypes="Matcha";
                break;

            case 6:
                coffee.generateBill(coffee.calculatePrice(360));
                coffee.CoffeeTypes="Strawberry Matcha";
                break;

        }

    }
}
