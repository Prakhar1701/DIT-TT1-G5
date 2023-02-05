package microsoft_teams_assignments.due5feb2023.solution2;

public class A {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPrime(n));
    }

    static String isPrime(int n) {

        if (n < 2) {
            return "No";
        }

        if (n == 2 || n == 3) {
            return "Yes";
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return "No";
        }

        for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return "No";
            }
        }

        return "Yes";
    }
}
