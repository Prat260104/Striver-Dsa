public class Fibbonaci {
    public int fib(int n) {
        int a=0;
        int b=1;
        if(n<=1){
            return n;
        } else{
            for(int i =2;i<=n;i++){
                int c = a+b;
                a=b;
                b=c;
            }
        }
        return b;
    }
}
/*
 class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
 */
