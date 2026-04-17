import java.util.Scanner;

class FactorsCalculator {

    public int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public int[] getFactors(int number, int count) {
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public int sumFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public int productFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public double sumSquareFactors(int[] factors) {
        double sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += Math.pow(factors[i], 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter number: ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Invalid input.");
                System.exit(0);
            }

            FactorsCalculator obj = new FactorsCalculator();

            int count = obj.countFactors(number);
            int[] factors = obj.getFactors(number, count);

            System.out.print("Factors: ");
            for (int i = 0; i < factors.length; i++) {
                System.out.print(factors[i] + " ");
            }

            int sum = obj.sumFactors(factors);
            int product = obj.productFactors(factors);
            double squareSum = obj.sumSquareFactors(factors);

            System.out.println("\nSum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Sum of Squares: " + squareSum);
        }
    }
}