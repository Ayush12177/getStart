class Solution {

    int[] dp= new int[31];

    public int fib(int n) {
        // if (n == 0 || n == 1) {
        //     return n;
        // }

        //  int fn1= fib(n-1);
        //  int fn2= fib(n-2);
        //  int fn= fn1 + fn2;
        //  return fn;

        // return fib(n - 1) + fib(n - 2);

        if(n <= 1){
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        dp[n]=fib(n-1)+fib(n-2);

        return dp[n];
        

    }
}