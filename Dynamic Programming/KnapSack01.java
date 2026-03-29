import java.util.Arrays;

public class KnapSack01 {
    public static int profit(int i, int[] wt, int[] val, int C, int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][C] != -1) return dp[i][C];
        int skip = profit(i+1, wt, val, C, dp);
        if(wt[i]>C) return dp[i][C] = skip;
        int pick = val[i] + profit(i+1, wt, val, C-wt[i], dp);
        return dp[i][C] = Math.max(pick, skip);
    }
    public static void main(String[] args) {
        int[] val = {5, 3, 7, 16};
        int[] wt = {1, 2, 8, 10};
        int C = 8;
        int n = wt.length;
        int[][] dp = new int[n][C+1];
        for(int i=0 ; i<n ; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(profit(0, wt, val, C, dp));
    }
}
