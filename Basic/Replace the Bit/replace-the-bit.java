//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String input[];
            input = br.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);
            Solution ob = new Solution();
            
            System.out.println(ob.replaceBit(n,k));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int replaceBit(int N, int K){
        String binary=Integer.toBinaryString(N);
        StringBuilder s=new StringBuilder(binary);
        if(K>s.length())
            return N;
        
        if(s.charAt(K-1)=='1')
            s.setCharAt(K-1,'0');
        int ans=Integer.parseInt(s.toString(), 2);
        return ans;
    }
}