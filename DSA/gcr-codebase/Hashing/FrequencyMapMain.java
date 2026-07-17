package Hashing;
public class FrequencyMapMain {

    public static void main(String[] args) {

        int[] codes = {404, 500, 404, 200, 500, 404, 503};

        FrequencyMap obj = new FrequencyMap();

        int result = obj.mostFrequentErrorCode(codes);

        System.out.println("Most Frequent Error Code: " + result);
    }
}