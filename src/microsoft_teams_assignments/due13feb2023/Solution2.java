package microsoft_teams_assignments.due13feb2023;

//Print Z Using pattern
public class Solution2 {
    public static void main(String[] args) {
        int size = 11;  //lines
        int space = size - 1;
        for (int i = 1; i <= size; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int j = 0; j < size - 1; j++) {
            for (int i = 1; i < space; i++) {
                System.out.print("  ");
            }
            space--;
            System.out.println(" *");
        }

        for (int i = 1; i <= size; i++) {
            System.out.print("* ");
        }
    }
}
