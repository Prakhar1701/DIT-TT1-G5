package microsoft_teams_assignments.due4feb2023;

import java.util.Scanner;

public class solution1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        int n = new Scanner(System.in).nextInt();

        float sumOfSeries = 0f;

        for (int i = 1; i <= n; i++) {
            sumOfSeries += 1f / i;
        }

        System.out.println("The sum of given series is " + sumOfSeries);
    }
}

