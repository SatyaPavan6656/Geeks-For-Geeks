//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        int left=0;
        int right=0;
        int max=0;
        String ans="";
        int m=w.length();
       

        if(m==1){
            return w;
        }
        
        int sum=0;
        while(right<m){
            boolean flag=false;
            int curr=w.charAt(right);
            for(int i=0; i<n; i++){
                if(curr==x[i]){
                    sum+=b[i];
                    flag=true;
                }
            }
           if(flag==false){
                sum+=(int)(curr);
            }
            if(sum<0){
                left=right+1;
                sum=0;
            }
            if(sum>max){
                max=sum;
                ans=w.substring(left,right+1);
            }
            right++;
        }
        
        return ans;

    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends