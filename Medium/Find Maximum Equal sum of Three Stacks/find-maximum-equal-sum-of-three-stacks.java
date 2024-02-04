//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 3);
            
            
            int[] S1 = IntArray.input(br, a[0]);
            
            
            int[] S2 = IntArray.input(br, a[1]);
            
            
            int[] S3 = IntArray.input(br, a[2]);
            
            Solution obj = new Solution();
            int res = obj.maxEqualSum(a[0],a[1],a[2], S1, S2, S3);
            
            out.println(res);
            
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public static int calSum(int[] arr) {
        int sum = 0;
        for(int el : arr) {
            sum += el;
        }
        return sum;
    }
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        int i=0, j=0, k=0;
        int sum1 = calSum(S1);
        int sum2 = calSum(S2);
        int sum3 = calSum(S3);
        
        int max; 
        
        while(i<N1 && j<N2 && k<N3) {
            if(sum1 == sum2 && sum2 == sum3) {
                return sum1;
            }
            
            max = Math.max(sum1, Math.max(sum2, sum3));
            
            if(sum1 == max) {
                sum1 = sum1-S1[i];
                i++;
            } else if(sum2 == max) {
                sum2 = sum2-S2[j];
                j++;
            } else {
                sum3 = sum3-S3[k];
                k++;
            } 
        }

        return 0;
    }
}
        
