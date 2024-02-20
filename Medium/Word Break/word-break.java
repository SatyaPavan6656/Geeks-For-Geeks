//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> dictionary = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            dictionary.add(p);
                        }
                    String s = sc.next();
                    Solution obj = new Solution();  
                    System.out.println(obj.wordBreak(n, s, dictionary));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        //code here
        if(trav(s,0,s.length(),dictionary)){
          return 1;
      }
      return 0;
    }
    public static boolean trav(String s,int i,int n,ArrayList<String> a){
        if(i==n){
            return true;
        }
      
        for(int k=i+1;k<=n;k++){
            String str=s.substring(i,k);
            if(a.contains(str)){
           if(trav(s,k,n,a)){
               return true;
           }
            }
        }
        
        return false;
    }
}