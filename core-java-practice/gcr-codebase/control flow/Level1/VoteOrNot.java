package controlFlow;
import java.util.*;

public class VoteOrNot {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>=18) {
            System.out.println("The person's age is " + age + " and can vote");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote");
        }

        sc.close();
    }
}
