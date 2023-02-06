package microsoft_teams_assignments.due5feb2023.solution2;

public class C {
    public static void main(String[] args) {
        Long[] ans = lcmAndGcd(14L, 8L);
        System.out.println("HCF: " + ans[0] + ", GCD: " + ans[1]);
    }

    static Long[] lcmAndGcd(Long A, Long B) {
        Long[] ans = new Long[2];

        //LCM
        long a = A;
        long b = B;
        while (a % b != 0) {
            a = a + A;
        }
        ans[0] = a;

        //GCD
        a = A;
        b = B;
        while (a % b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        ans[1] = b;

        return ans;
    }
}
