package practice;

import java.util.Scanner;

public class Task1 {
    static int dayCounter;
    static double[] price;

    private final static String CURRENCY = "USD";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n - кількість днів
        int n = 5;
        price = new double[n];
        System.out.println("Enter the price: ");
        for (int i = 0; i < n; ++i) {
            dayCounter++;
            System.out.println("Day " + dayCounter + "-");
            price[i] = sc.nextDouble();
        }
        sc.close();
        for (int i = 0; i < n; ++i) {
            for (int j = 1; j < n - i; ++j) {
                if (price[j - 1] > price[j]) {
                    double temp = price[j - 1];
                    price[j - 1] = price[j];
                    price[j] = temp;
                }
            }
        }
        System.out.print("Sorted price:");
        for (int i = 0; i < n; ++i) {
            System.out.printf("%n%.2f %s",
                    price[i], CURRENCY);
        }
        double minPrice = price[0];
        double maxPrice = price[n - 1];
        System.out.printf("%nMin price is: %.2f %s", minPrice, CURRENCY);
        System.out.printf("%nMax price is: %.2f %s", maxPrice, CURRENCY);

    }
}