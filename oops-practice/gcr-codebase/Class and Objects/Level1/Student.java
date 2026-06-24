package OOPS;

public class Student {
    String name;
    int rollNumber;
    double marks;

    public char CalculateGrade() {
        if(marks >= 90) {
            return 'A';
        } else if(marks >= 80) {
            return 'B';
        } else if(marks >= 70) {
            return 'C';
        } else if(marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void displayDetails() {
        System.out.println("Name: " +name);
        System.out.println("Roll Number: " +rollNumber);
        System.out.println("Marks: " +marks);
        System.out.println("Grade" + CalculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Sneha";
        s.rollNumber = 101;
        s.marks = 67.8;

        s.displayDetails();
    }
}
