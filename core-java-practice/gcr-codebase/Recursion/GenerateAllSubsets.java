package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateAllSubsets {

    static void generate(int[] arr, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            System.out.println(list);
            return;
        }

        generate(arr, index + 1, list);

        list.add(arr[index]);
        generate(arr, index + 1, list);

        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        generate(arr, 0, new ArrayList<>());
    }
}