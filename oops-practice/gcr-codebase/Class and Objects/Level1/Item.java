package OOPS;

public class Item {
    int ItemCode;
    String ItemName;
    double Price;

    public void DisplayDetails() {
        System.out.println("Item Code:" +ItemCode);
        System.out.println("Item Name: " +ItemName);
        System.out.println("Item Price: " +Price);
    }

    public double CalculateTotalCost(int quantity) {
        return Price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();

        item.ItemCode = 2323;
        item.ItemName = "Pen";
        item.Price = 20.0;

        item.DisplayDetails();

        int quantity = 5;
        System.out.println("Total Cost: " +item.CalculateTotalCost(quantity));
    }
}
