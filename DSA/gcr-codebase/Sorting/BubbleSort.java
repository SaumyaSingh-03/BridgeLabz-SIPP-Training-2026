package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] marks = {78, 45, 90, 62, 55};

        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        System.out.println("Sorted Marks:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}