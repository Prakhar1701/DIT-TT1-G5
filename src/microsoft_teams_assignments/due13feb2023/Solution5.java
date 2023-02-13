package microsoft_teams_assignments.due13feb2023;

public class Solution5 {
    public static void main(String[] args) {
        int lines = 7;
        int mid = lines / 2 + 1;

        for (int i = 1; i <= lines; i++) {
            if (i <= mid) {
                for (int j = 0; j < mid - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
            } else {
                for (int j = 0; j < mid - (lines - i + 1); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= lines - i + 1; j++) {
                    System.out.print(lines - i + 1 + " ");
                }
            }
            System.out.println();
        }
    }
}
