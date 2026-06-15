package methods;

import java.util.Scanner;

public class factorsProgram {

    public static int[] findFactors(int n) {

        int count = 0;

        // Count factors
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public int findSum(int[] factors) {
        int sum = 0;

        for(int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    public int findProduct(int[] factors) {
        int product = 1;

        for(int factor : factors) {
            product *= factor;
        }

        return product;
    }

    public double findSumOfSquares(int[] factors) {
        double sum = 0;

        for(int factor : factors) {
            sum += Math.pow(factor, 2);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);

        System.out.print("Factors: ");
        for(int factor : factors) {
            System.out.print(factor + " ");
        }

        factorsProgram fp = new factorsProgram();

        System.out.println("\nSum of Factors: " + fp.findSum(factors));
        System.out.println("Product of Factors: " + fp.findProduct(factors));
        System.out.println("Sum of Squares of Factors: " + fp.findSumOfSquares(factors));

        sc.close();
    }
}