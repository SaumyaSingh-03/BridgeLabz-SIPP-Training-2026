package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 108, 101, 104};

        int n = employeeIDs.length;

        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i];
            int j = i - 1;

            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }
            employeeIDs[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
}

