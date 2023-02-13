package microsoft_teams_assignments.due13feb2023;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        int lines = new Scanner(System.in).nextInt();

        if (lines % 2 == 0) {
            lines = lines + 1;
        }

        int mid = (lines / 2) + 1, star = mid;

        boolean s = true;
        for (int i = 1; i <= lines; i++) {

            int space = mid - star;

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }

            if (star > 1 && s) {
                star--;
            } else {
                star++;
                s = false;
            }

            System.out.println();
        }
    }
}
