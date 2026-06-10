package ScenerioBased;

import java.util.Scanner;

public class PollingBoothSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {

            System.out.println("Enter voter's age: ");
            int age = sc.nextInt();


            if (age == -1) {
                break;
            }


            if (age >= 18) {

                System.out.println("Eligible to vote");
                System.out.println("Choose Candidate:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                int vote = sc.nextInt();

                if (vote == 1) {
                    candidate1Votes++;
                }
                else if (vote == 2) {
                    candidate2Votes++;
                }
                else if (vote == 3) {
                    candidate3Votes++;
                }
                else {
                    System.out.println("Invalid Vote!");
                }

            } else {
                System.out.println("Not Eligible to Vote");
            }
        }

        System.out.println("\n----- Election Results -----");
        System.out.println("Candidate A Votes: " + candidate1Votes);
        System.out.println("Candidate B Votes: " + candidate2Votes);
        System.out.println("Candidate C Votes: " + candidate3Votes);

        sc.close();
    }
}