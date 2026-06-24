package OOPS;

public class Employee {
    int ID;
    String Name;
    double Salary;

    public void DisplayDetails() {
        System.out.println("ID:" +ID);
        System.out.println("Name: " +Name);
        System.out.println("Salary: " +Salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.ID = 323;
        e.Name = "Sneha";
        e.Salary = 232.432;

        e.DisplayDetails();
    }
}
