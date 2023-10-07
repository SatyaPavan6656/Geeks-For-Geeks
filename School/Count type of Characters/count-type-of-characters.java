//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here 
        int upper=0;
        int lower=0;
        int num=0;
        int spl=0;
        int res[]=new int[4];
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                upper++;
            }
            else if(Character.isLowerCase(s.charAt(i))){
                lower++;
            }
            else if(Character.isDigit(s.charAt(i))){
                num++;
            }
            else{
                spl++;
            }
        }
        res[0] = upper;
        res[1] = lower;
        res[2] = num;
        res[3] = spl;
        return res;

    }
}