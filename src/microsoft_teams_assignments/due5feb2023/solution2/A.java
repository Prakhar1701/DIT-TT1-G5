package microsoft_teams_assignments.due5feb2023.solution2;

public class A {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPrime(n));
    }
    static String isPrime(int n) {

        if(n<2){
            return "No";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Write your logic here
            // Return "Yes" if n is prime, else return "No"
            /*n is prime only if it is not divisible by any i.
            We will not reach till n and 1 is already discarded*/
            if(n%i==0){
                return "No";
            }
        }
        return "Yes";
    }
}
