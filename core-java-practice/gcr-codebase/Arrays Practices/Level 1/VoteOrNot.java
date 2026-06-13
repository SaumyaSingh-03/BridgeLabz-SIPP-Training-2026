package arrays;
import java.util.Scanner;

public class VoteOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] students = new int[10];

        for(int i = 0; i<students.length; i++) {
            System.out.println("Enter Your Age: ");
            students[i] = sc.nextInt();
        }

        for(int i = 0; i<students.length; i++) {
            if(students[i]<0) {
                System.out.println("Invalid Age");
            } else if (students[i]<18) {
                System.out.println("Can Not Vote");
            } else {
                System.out.println("Can Vote");
            }
        }
        sc.close();
    }
}
