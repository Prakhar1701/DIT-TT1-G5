package microsoft_teams_assignments.due5feb2023.solution2;

public class B {
    public static void main(String[] args) {
        B obj = new B();
        int gcd = obj.gcd(5, 9);
        System.out.println(gcd);
    }

    public int gcd(int A, int B) {
        int min = Math.min(A, B);

        for (int i = min; i > 0; i--) {
            if (A % i == 0 && B % i == 0) {
                return i;
            }
        }

        return 0;
    }
}
