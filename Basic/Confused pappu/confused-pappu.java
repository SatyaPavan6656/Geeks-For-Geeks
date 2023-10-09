//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            long amount = Long.parseLong(read.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.findDiff(amount);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long findDiff(long amount) 
    {
        // code here
        String am1=amount+"";
        am1=am1.replaceAll("6","9");
        long p=Long.parseLong(am1);
        return p-amount;
    }
} 
