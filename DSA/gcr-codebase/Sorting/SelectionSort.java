package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] examScores = {78, 45, 90, 62, 55};
        int n = examScores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (examScores[j] < examScores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = examScores[i];
            examScores[i] = examScores[minIndex];
            examScores[minIndex] = temp;
        }

        System.out.println("Sorted Exam Scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}

