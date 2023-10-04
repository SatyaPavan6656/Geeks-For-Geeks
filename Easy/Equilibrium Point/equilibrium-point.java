//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==0)
        {
            return -1;
        }
        if(n==1)
        {
            return 1;
        }
        long num1=0,num2=0;
        for(int i=0;i<n/2;i++)
        {
            num1+=arr[i];
            
        }
        for(int i=n/2;i<n;i++)
        {
            num2+=arr[i];
            
        }
        if(num1<num2)
        {
            int x=n/2;
            num1=num1-arr[n/2-1];
            for(int i=n/2-1;i<n-2;i++)
            {
                num1=num1+arr[i];
                num2=0;
              for(int j=x+1;j<n;j++)
              {
                  num2+=arr[j];
              }
              if(num1==num2)
              {
                  return x+1;
              }
              x++;
            }
        }
        else if(num1>num2)
        {
            num1=0;
           for(int i=0;i<n/2;i++)
        {
            num1=num1+arr[i];
            num2=0;
            for(int j=i+2;j<n;j++)
            {
                num2=num2+arr[j];
            }
            if(num1==num2)
            {
                return i+2;
            }
        }
        }
        else
        {
            return -1;
        }
            
         
        return -1;
    }
}