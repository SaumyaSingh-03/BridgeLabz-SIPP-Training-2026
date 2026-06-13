package arrays;
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer: ");
        int num = sc.nextInt();

        int[] table = new int[10];

        for(int i = 1; i<table.length; i++) {
            table[i] = num*i;
        }

        for(int i = 1; i<table.length; i++) {
            System.out.println(table[i]);
        }
        sc.close();
    }
}
