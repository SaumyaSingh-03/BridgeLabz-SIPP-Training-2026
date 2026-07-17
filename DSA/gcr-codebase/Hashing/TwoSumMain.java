package Hashing;
public class TwoSumMain {

    public static void main(String[] args) {

        int[] amounts = {15, 7, 11, 2};
        int target = 9;

        TwoSum obj = new TwoSum();

        int[] result = obj.findFraudPair(amounts, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}