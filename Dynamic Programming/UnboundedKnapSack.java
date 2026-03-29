import java.util.Arrays;

public class UnboundedKnapSack {
    public static int profit(int i, int[] wt, int[] val, int C, int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][C] != -1) return dp[i][C];
        int skip = profit(i+1, wt, val, C, dp);
        if(wt[i]>C) return dp[i][C] = skip;
        int pick = val[i] + profit(i, wt, val, C-wt[i], dp);
        return dp[i][C] = Math.max(pick, skip);
    }
    public static void main(String[] args) {
        int[] val = {6, 3, 7, 25};
        int[] wt = {2, 2, 8, 9};
        int C = 9;
        int n = wt.length;
        int[][] dp = new int[n][C+1];
        for(int i=0 ; i<n ; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(profit(0, wt, val, C, dp));
    }

    public int coinCount(int i, int[] coins, int amount ){
        if(i == coins.length){
            if(amount == 0) return 0;
            else return Integer.MAX_VALUE;
        }

        int skip = coinCount(i+1, coins, amount);
        if(amount - coins[i] < 0) return skip;
        int pick = 1 + coinCount(i, coins, amount - coins[i]);
        return Math.min(skip, pick); 
    }

    public int coinChange(int[] coins, int amount){
        return coinCount(0, coins, amount);
    }
}
