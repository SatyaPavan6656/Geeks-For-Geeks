//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.MinSquares(n);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int solve(int n,int []dp){
         if(n==0) return 0;
         if(dp[n]!=-1){
             return dp[n];
        }
        int ans=n;
        for(int i=1;i*i<=n;i++){
            ans=Math.min(ans,1+solve(n-i*i,dp));
        }
        dp[n]=ans;
        
        return dp[n];
    }

    public int MinSquares(int n)
    {
        // Code here
         int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
}