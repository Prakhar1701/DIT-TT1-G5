package microsoft_teams_assignments.due4feb2023;

public class Solution5 {
    public static void main(String[] args) {
        System.out.println(new Solution5().isDivisible(45));
    }
    int isDivisible(int N) {
        int sum = 0, x = N;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return (N % sum == 0 ? 1 : 0);
    }
}

//Time Complexity: O(log N)