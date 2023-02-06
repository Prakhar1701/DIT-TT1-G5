package microsoft_teams_assignments.due5feb2023.solution2;

public class C {
    public static void main(String[] args) {
        Long[] ans = lcmAndGcd(8L, 14L);
        System.out.println("HCF: "+ans[0]+", GCD: "+ans[1]);
    }


    static Long[] lcmAndGcd(Long A, Long B) {

        Long[] ans = new Long[2];

        //LCM
        for (long i = Math.max(A, B); i <= A * B; i++) {
            if (i % A == 0 && i % B == 0) {
                ans[0] = i;
                break;
            }
        }
        
        //GCD
        while (A % B != 0) {
            long r = A % B;
            A = B;
            B = r;
        }
        ans[1] = B;

        return ans;
    }
}
