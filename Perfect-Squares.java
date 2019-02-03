class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        int s=0;
        int dif;
        for(int i=1;i<=n;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        for(int i=1;i<=n;i++){
            s=(int)Math.sqrt(i);
            if(s*s==i){
                dp[i]=1;
                continue;
            }
            for(int j=1;j<=s;j++){
                dif= i-j*j;
                dp[i]=Math.min(dp[i],dp[dif]+1);
            }
        }
        return dp[n];
    }
}
