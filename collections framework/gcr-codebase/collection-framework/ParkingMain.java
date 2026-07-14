package ArrayList;
import java.util.*;

public class ParkingMain {
    public static void main(String[] args) {
        ArrayList<VehicleData> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. Enter Vehicle \n2. Exit Vehicle \n3. Search Vehicle \n4. Display Vehicles \n5. Exit");
            System.out.println("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter Vehicle Number: ");
                    String v = sc.next();

                    list.add(new VehicleData(v));
                    System.out.println("Entered Successfully");
                    break;
                }

                case 2: {
                    System.out.println("Enter Vehicle Number to exit: ");
                    String v = sc.next();

                    boolean removed = false;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).vehicleNumber.equals(v)) {
                            list.remove(i);
                            removed = true;
                            System.out.println("Vehicle Exited Successfully");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Vehicle Not Found!");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter Vehicle Number to Search: ");
                    String v = sc.next();

                    boolean found = false;

                    for (VehicleData vd : list) {
                        if (vd.vehicleNumber.equals(vd)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("Vehicle is Currently Parked");
                    } else {
                        System.out.println("Vehicle Not Found");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Parked Vehicles: ");

                    for (VehicleData vd : list) {
                        System.out.println(vd);
                    }

                    System.out.println("Occupied Slots: " + list.size());
                    break;
                }

                case 5: {
                    System.out.println("Exited!");
                    return;
                }
                default: {
                    System.out.println("Invalid Choice!");
                }
            }


        }
    }
}
