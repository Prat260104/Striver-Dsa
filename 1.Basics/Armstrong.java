public class Armstrong {
   
    public int solve(int A) {
        int num = A;
        int digits = (int) Math.log10(A) + 1; // number of digits
        int sum = 0;

        while (A > 0) {
            int digit = A % 10;
            sum += Math.pow(digit, digits);
            A /= 10;
        }

        return (sum == num) ? 1 : 0;
    }
}

