package microsoft_teams_assignments.due5feb2023;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println("Enter value of n:");
        int n = new Scanner(System.in).nextInt();
        System.out.println(armstrongNumber(n));
    }

    static String armstrongNumber(int n) {

        int count = 0;
        int x = n;
        while (x != 0) {
            x /= 10;
            count++;
        }

        x = n;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int ones = x % 10;
            x /= 10;
            sum += Math.pow(ones, 3);
        }

        if (sum == n) {
            return "Yes";
        } else {
            return "No";
        }

    }
}
