//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minSteps(n));
                    
                }
        }
}    
// } Driver Code Ends


class Solution{
        static int[] dp;
    public int calc(int n) 
    {
        if(n==1){
            return 0;
        }
        else if(n==2||n==3){
            return 1;
        }
        else if(dp[n]!=-1){
            return dp[n];
        }
        else{
            if(n%3==0){
                dp[n]=1+Math.min(calc(n/3),calc(n-1));
                return dp[n];
            }
            else if(n%2==0){
                dp[n]=1+Math.min(calc(n/2),calc(n-1));
                return dp[n];
            }
            else{
                dp[n]=1+calc(n-1);
                return dp[n];
            }
        }
    }

	public int minSteps(int N) 
	{ 
	    // Your code goes here
	    dp=new int[N+1];
        for(int i=0;i<N+1;i++){
            dp[i]=-1;
        }
        return calc(N);
	} 
}
