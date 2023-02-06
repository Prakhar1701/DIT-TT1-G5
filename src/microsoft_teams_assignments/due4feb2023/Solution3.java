package microsoft_teams_assignments.due4feb2023;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        long n = new Scanner(System.in).nextLong();

        long x = n;
        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }

        x = n;
        n = 0;
        for (int i = 0; i < count; i++) {
            long ones = x % 10;
            x /= 10;
            n += (ones * Math.pow(10, count - i - 1));
        }

        System.out.println("Reverse:");
        System.out.println(n);
    }
}
